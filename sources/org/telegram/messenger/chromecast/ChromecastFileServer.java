package org.telegram.messenger.chromecast;

import android.net.Uri;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.gms.cast.MediaMetadata;
import fi.iki.elonen.NanoHTTPD;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.chromecast.ChromecastMedia;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;

public class ChromecastFileServer extends NanoHTTPD {
    public static final ChromecastMedia ASSET_FALLBACK_FILE;
    private static final ChromecastMedia[] ASSET_FILES;
    private static final HashMap ASSET_FILES_MAP;
    private final DataSource.Factory assetDataSourceFactory;
    private final HashMap castedFiles;
    private Pair coverFile;
    private final DataSource.Factory fileDataSourceFactory;
    private final DataSource.Factory mediaDataSourceFactory;
    private final AtomicInteger reqId;
    private boolean started;

    public static class DataSourceInputStream extends InputStream {
        private long availableBytes;
        private final DataSource dataSource;
        private final byte[] tmpByte = new byte[1];

        public DataSourceInputStream(DataSource dataSource, DataSpec dataSpec) {
            this.dataSource = dataSource;
            try {
                this.availableBytes = dataSource.open(dataSpec);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public int available() {
            return (int) this.availableBytes;
        }

        @Override
        public void close() {
            this.dataSource.close();
        }

        @Override
        public int read() {
            int read = this.dataSource.read(this.tmpByte, 0, 1);
            this.availableBytes--;
            if (read == -1) {
                return -1;
            }
            return this.tmpByte[0] & 255;
        }

        @Override
        public int read(byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            int read = this.dataSource.read(bArr, i, i2);
            this.availableBytes -= read;
            return read;
        }
    }

    public static class Range {
        final long end;
        final long start;

        public Range(long j, long j2) {
            this.start = j;
            this.end = j2;
        }
    }

    static {
        ChromecastMedia build = ChromecastMedia.Builder.fromUri(Uri.parse("file:///android_asset/cast/default.png"), "/assets/default", "image/png").build();
        ASSET_FALLBACK_FILE = build;
        ChromecastMedia[] chromecastMediaArr = {build};
        ASSET_FILES = chromecastMediaArr;
        HashMap hashMap = new HashMap();
        ASSET_FILES_MAP = hashMap;
        ChromecastMedia chromecastMedia = chromecastMediaArr[0];
        hashMap.put(chromecastMedia.externalPath, chromecastMedia);
    }

    public ChromecastFileServer() {
        super(61578);
        this.castedFiles = new HashMap();
        this.coverFile = null;
        this.started = false;
        this.reqId = new AtomicInteger();
        this.assetDataSourceFactory = new DataSource.Factory() {
            @Override
            public final DataSource createDataSource() {
                DataSource lambda$new$0;
                lambda$new$0 = ChromecastFileServer.lambda$new$0();
                return lambda$new$0;
            }
        };
        this.fileDataSourceFactory = new FileDataSource.Factory();
        this.mediaDataSourceFactory = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    private static NanoHTTPD.Response addCorsHeaders(NanoHTTPD.Response response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Max-Age", "3628800");
        response.addHeader("Access-Control-Allow-Methods", "*");
        response.addHeader("Access-Control-Allow-Headers", "*");
        return response;
    }

    private void check() {
        if (this.castedFiles.isEmpty()) {
            if (this.started) {
                stop();
                this.started = false;
                return;
            }
            return;
        }
        if (this.started) {
            return;
        }
        try {
            start(5000, true);
            this.started = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String fixHlsManifest(String str, String str2) {
        return str.replaceAll("mtproto:", getUrlToSource(str2, "/mtproto_"));
    }

    private static String formatIp4(int i) {
        return String.valueOf(i & 255) + '.' + ((i >> 8) & 255) + '.' + ((i >> 16) & 255) + '.' + ((i >> 24) & 255);
    }

    private DataSource.Factory getDataSourceFactory(ChromecastMedia chromecastMedia) {
        return chromecastMedia.internalUri.toString().startsWith("file://") ? chromecastMedia.internalUri.toString().startsWith("file:///android_asset/") ? this.assetDataSourceFactory : this.fileDataSourceFactory : this.mediaDataSourceFactory;
    }

    private ChromecastMedia getFile(String str) {
        ChromecastMedia chromecastMedia = (ChromecastMedia) ASSET_FILES_MAP.get(str);
        return chromecastMedia == null ? (ChromecastMedia) this.castedFiles.get(str) : chromecastMedia;
    }

    public static String getHost() {
        return formatIp4(getMyLocalIp()) + ":61578";
    }

    private static int getMyLocalIp() {
        int ipAddress = ((WifiManager) ApplicationLoader.applicationContext.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (nextElement.isSiteLocalAddress()) {
                            byte[] address = nextElement.getAddress();
                            ipAddress = (((address[3] + 256) % 256) << 24) + ((address[0] + 256) % 256) + (((address[1] + 256) % 256) << 8) + (((address[2] + 256) % 256) << 16);
                        }
                    }
                }
            } catch (SocketException e) {
                FileLog.e(e);
            }
        }
        return ipAddress;
    }

    public static String getUrlToSource(String str, String str2) {
        return "http://" + str + str2;
    }

    public static DataSource lambda$new$0() {
        return new AssetDataSource(ApplicationLoader.applicationContext);
    }

    private static Range parseRangeHeader(String str, long j) {
        long parseLong;
        long parseLong2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String substring = str.trim().substring(6);
        if (substring.startsWith("-")) {
            parseLong2 = j - 1;
            parseLong = parseLong2 - Long.parseLong(substring.substring(1));
        } else {
            String[] split = substring.split("-");
            parseLong = Long.parseLong(split[0]);
            parseLong2 = split.length > 1 ? Long.parseLong(split[1]) : j - 1;
        }
        long j2 = j - 1;
        if (parseLong2 > j2) {
            parseLong2 = j2;
        }
        return new Range(parseLong, parseLong2);
    }

    private NanoHTTPD.Response serveAvailableRoutes(String str) {
        StringBuilder sb = new StringBuilder();
        if (this.coverFile != null) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(getUrlToSource(str, (String) this.coverFile.first));
        }
        int i = 0;
        while (i < 2) {
            for (Map.Entry entry : (i == 0 ? ASSET_FILES_MAP : this.castedFiles).entrySet()) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(getUrlToSource(str, (String) entry.getKey()));
                MediaMetadata mediaMetadata = ((ChromecastMedia) entry.getValue()).mediaMetadata;
                if (mediaMetadata != null) {
                    String string = mediaMetadata.getString("com.google.android.gms.cast.metadata.TITLE");
                    String string2 = mediaMetadata.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    if (string != null) {
                        sb.append(' ');
                        sb.append(string);
                    }
                    if (string2 != null) {
                        sb.append(" [");
                        sb.append(string2);
                        sb.append(']');
                    }
                }
            }
            i++;
        }
        return NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/plain", sb.toString());
    }

    private NanoHTTPD.Response serveFileImpl(NanoHTTPD.IHTTPSession iHTTPSession, File file) {
        return NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "image/jpeg", new BufferedInputStream(new FileInputStream(file)), file.length());
    }

    private NanoHTTPD.Response serveFileImpl(NanoHTTPD.IHTTPSession iHTTPSession, ChromecastMedia chromecastMedia) {
        NanoHTTPD.Response newFixedLengthResponse;
        String str = (String) iHTTPSession.getHeaders().get("host");
        if (chromecastMedia.internalUri.toString().startsWith("data:application/x-mpegurl;base64,")) {
            return NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, chromecastMedia.mimeType, fixHlsManifest(new String(Base64.decode(chromecastMedia.internalUri.toString().substring(34), 0)), str));
        }
        DataSource createDataSource = getDataSourceFactory(chromecastMedia).createDataSource();
        DataSpec.Builder uri = new DataSpec.Builder().setUri(chromecastMedia.internalUri);
        long open = createDataSource.open(uri.build());
        createDataSource.close();
        boolean equals = TextUtils.equals(chromecastMedia.mimeType, "application/x-mpegURL");
        Range parseRangeHeader = !equals ? parseRangeHeader((String) iHTTPSession.getHeaders().get("range"), open) : null;
        long j = parseRangeHeader != null ? (parseRangeHeader.end - parseRangeHeader.start) + 1 : open;
        if (parseRangeHeader != null) {
            uri.setPosition(parseRangeHeader.start);
            uri.setLength(j);
        }
        if (equals) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            createDataSource.open(uri.build());
            createDataSource.read(bArr, 0, i);
            createDataSource.close();
            return NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, chromecastMedia.mimeType, fixHlsManifest(new String(bArr), str));
        }
        if (j != 0) {
            newFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(parseRangeHeader != null ? NanoHTTPD.Response.Status.PARTIAL_CONTENT : NanoHTTPD.Response.Status.OK, chromecastMedia.mimeType, new DataSourceInputStream(createDataSource, uri.build()), j);
        } else {
            newFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NO_CONTENT, chromecastMedia.mimeType, "");
        }
        if (parseRangeHeader != null) {
            newFixedLengthResponse.addHeader("Content-Range", "bytes " + parseRangeHeader.start + "-" + parseRangeHeader.end + "/" + open);
        }
        return newFixedLengthResponse;
    }

    private NanoHTTPD.Response serveImpl(NanoHTTPD.IHTTPSession iHTTPSession) {
        NanoHTTPD.Response.Status status;
        String str;
        String str2 = (String) iHTTPSession.getHeaders().get("host");
        String path = Uri.parse("http://" + str2 + iHTTPSession.getUri()).getPath();
        if (NanoHTTPD.Method.OPTIONS.equals(iHTTPSession.getMethod())) {
            status = NanoHTTPD.Response.Status.OK;
            str = "";
        } else {
            if (TextUtils.equals(path, "/")) {
                return serveAvailableRoutes(str2);
            }
            ChromecastMedia file = getFile(path);
            if (file != null) {
                return serveFileImpl(iHTTPSession, file);
            }
            Pair pair = this.coverFile;
            File file2 = (pair == null || !((String) pair.first).equalsIgnoreCase(path)) ? null : (File) this.coverFile.second;
            if (file2 != null) {
                return serveFileImpl(iHTTPSession, file2);
            }
            status = NanoHTTPD.Response.Status.NOT_FOUND;
            str = "file not found";
        }
        return NanoHTTPD.newFixedLengthResponse(status, "text/plain", str);
    }

    public void addFileToCast(ChromecastMedia chromecastMedia) {
        this.castedFiles.put(chromecastMedia.externalPath, chromecastMedia);
        check();
    }

    public void removeFileFromCast(ChromecastMedia chromecastMedia) {
        this.castedFiles.remove(chromecastMedia.externalPath);
        check();
    }

    @Override
    public NanoHTTPD.Response serve(NanoHTTPD.IHTTPSession iHTTPSession) {
        int incrementAndGet = this.reqId.incrementAndGet();
        Log.d("CAST_SERVER", "Request " + incrementAndGet + " " + iHTTPSession.getMethod() + " " + iHTTPSession.getUri() + " " + ((String) iHTTPSession.getHeaders().get("range")));
        try {
            return addCorsHeaders(serveImpl(iHTTPSession));
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            return addCorsHeaders(NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, "text/plain", "Error reading file"));
        }
    }

    public void setCoverFile(String str, File file) {
        if (str == null || file == null) {
            Pair pair = this.coverFile;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.coverFile.second).delete();
                } catch (Exception unused) {
                }
            }
            this.coverFile = null;
        } else {
            this.coverFile = new Pair(str, file);
        }
        check();
    }
}
