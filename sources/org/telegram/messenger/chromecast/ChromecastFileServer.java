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

    static {
        ChromecastMedia chromecastMediaBuild = ChromecastMedia.Builder.fromUri(Uri.parse("file:///android_asset/cast/default.png"), "/assets/default", "image/png").build();
        ASSET_FALLBACK_FILE = chromecastMediaBuild;
        ChromecastMedia[] chromecastMediaArr = {chromecastMediaBuild};
        ASSET_FILES = chromecastMediaArr;
        HashMap map = new HashMap();
        ASSET_FILES_MAP = map;
        ChromecastMedia chromecastMedia = chromecastMediaArr[0];
        map.put(chromecastMedia.externalPath, chromecastMedia);
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
                return ChromecastFileServer.lambda$new$0();
            }
        };
        this.fileDataSourceFactory = new FileDataSource.Factory();
        this.mediaDataSourceFactory = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static DataSource lambda$new$0() {
        return new AssetDataSource(ApplicationLoader.applicationContext);
    }

    public void addFileToCast(ChromecastMedia chromecastMedia) {
        this.castedFiles.put(chromecastMedia.externalPath, chromecastMedia);
        check();
    }

    public void removeFileFromCast(ChromecastMedia chromecastMedia) {
        this.castedFiles.remove(chromecastMedia.externalPath);
        check();
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

    public File getCoverFile() {
        Pair pair = this.coverFile;
        if (pair == null) {
            return null;
        }
        return (File) pair.second;
    }

    public String getCoverPath() {
        Pair pair = this.coverFile;
        if (pair == null) {
            return null;
        }
        return (String) pair.first;
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

    @Override
    public NanoHTTPD.Response serve(NanoHTTPD.IHTTPSession iHTTPSession) {
        int iIncrementAndGet = this.reqId.incrementAndGet();
        Log.d("CAST_SERVER", "Request " + iIncrementAndGet + " " + iHTTPSession.getMethod() + " " + iHTTPSession.getUri() + " " + ((String) iHTTPSession.getHeaders().get("range")));
        try {
            return addCorsHeaders(serveImpl(iHTTPSession));
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + iIncrementAndGet);
            return addCorsHeaders(NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, "text/plain", "Error reading file"));
        }
    }

    private NanoHTTPD.Response serveImpl(NanoHTTPD.IHTTPSession iHTTPSession) {
        String str = (String) iHTTPSession.getHeaders().get("host");
        String path = Uri.parse("http://" + str + iHTTPSession.getUri()).getPath();
        if (NanoHTTPD.Method.OPTIONS.equals(iHTTPSession.getMethod())) {
            return NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "text/plain", "");
        }
        if (TextUtils.equals(path, "/")) {
            return serveAvailableRoutes(str);
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
        return NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NOT_FOUND, "text/plain", "file not found");
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

    private NanoHTTPD.Response serveFileImpl(NanoHTTPD.IHTTPSession iHTTPSession, ChromecastMedia chromecastMedia) {
        NanoHTTPD.Response responseNewFixedLengthResponse;
        String str = (String) iHTTPSession.getHeaders().get("host");
        if (chromecastMedia.internalUri.toString().startsWith("data:application/x-mpegurl;base64,")) {
            return NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, chromecastMedia.mimeType, fixHlsManifest(new String(Base64.decode(chromecastMedia.internalUri.toString().substring(34), 0)), str));
        }
        DataSource dataSourceCreateDataSource = getDataSourceFactory(chromecastMedia).createDataSource();
        DataSpec.Builder uri = new DataSpec.Builder().setUri(chromecastMedia.internalUri);
        long jOpen = dataSourceCreateDataSource.open(uri.build());
        dataSourceCreateDataSource.close();
        boolean zEquals = TextUtils.equals(chromecastMedia.mimeType, "application/x-mpegURL");
        Range rangeHeader = !zEquals ? parseRangeHeader((String) iHTTPSession.getHeaders().get("range"), jOpen) : null;
        long j = rangeHeader != null ? (rangeHeader.end - rangeHeader.start) + 1 : jOpen;
        if (rangeHeader != null) {
            uri.setPosition(rangeHeader.start);
            uri.setLength(j);
        }
        if (zEquals) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            dataSourceCreateDataSource.open(uri.build());
            dataSourceCreateDataSource.read(bArr, 0, i);
            dataSourceCreateDataSource.close();
            return NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, chromecastMedia.mimeType, fixHlsManifest(new String(bArr), str));
        }
        if (j != 0) {
            responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(rangeHeader != null ? NanoHTTPD.Response.Status.PARTIAL_CONTENT : NanoHTTPD.Response.Status.OK, chromecastMedia.mimeType, new DataSourceInputStream(dataSourceCreateDataSource, uri.build()), j);
        } else {
            responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NO_CONTENT, chromecastMedia.mimeType, "");
        }
        if (rangeHeader != null) {
            responseNewFixedLengthResponse.addHeader("Content-Range", "bytes " + rangeHeader.start + "-" + rangeHeader.end + "/" + jOpen);
        }
        return responseNewFixedLengthResponse;
    }

    private NanoHTTPD.Response serveFileImpl(NanoHTTPD.IHTTPSession iHTTPSession, File file) {
        return NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "image/jpeg", new BufferedInputStream(new FileInputStream(file)), file.length());
    }

    private ChromecastMedia getFile(String str) {
        ChromecastMedia chromecastMedia = (ChromecastMedia) ASSET_FILES_MAP.get(str);
        return chromecastMedia == null ? (ChromecastMedia) this.castedFiles.get(str) : chromecastMedia;
    }

    private DataSource.Factory getDataSourceFactory(ChromecastMedia chromecastMedia) {
        if (chromecastMedia.internalUri.toString().startsWith("file://")) {
            if (chromecastMedia.internalUri.toString().startsWith("file:///android_asset/")) {
                return this.assetDataSourceFactory;
            }
            return this.fileDataSourceFactory;
        }
        return this.mediaDataSourceFactory;
    }

    private static NanoHTTPD.Response addCorsHeaders(NanoHTTPD.Response response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Max-Age", "3628800");
        response.addHeader("Access-Control-Allow-Methods", "*");
        response.addHeader("Access-Control-Allow-Headers", "*");
        return response;
    }

    private static String fixHlsManifest(String str, String str2) {
        return str.replaceAll("mtproto:", getUrlToSource(str2, "/mtproto_"));
    }

    private static Range parseRangeHeader(String str, long j) {
        long j2;
        long j3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strSubstring = str.trim().substring(6);
        if (strSubstring.startsWith("-")) {
            j3 = j - 1;
            j2 = j3 - Long.parseLong(strSubstring.substring(1));
        } else {
            String[] strArrSplit = strSubstring.split("-");
            j2 = Long.parseLong(strArrSplit[0]);
            j3 = strArrSplit.length > 1 ? Long.parseLong(strArrSplit[1]) : j - 1;
        }
        long j4 = j - 1;
        if (j3 > j4) {
            j3 = j4;
        }
        return new Range(j2, j3);
    }

    private static class Range {
        final long end;
        final long start;

        public Range(long j, long j2) {
            this.start = j;
            this.end = j2;
        }
    }

    public static String getUrlToSource(String str, String str2) {
        return "http://" + str + str2;
    }

    public static String getHost() {
        return formatIp4(getMyLocalIp()) + ":61578";
    }

    private static String formatIp4(int i) {
        return String.valueOf(i & 255) + '.' + ((i >> 8) & 255) + '.' + ((i >> 16) & 255) + '.' + ((i >> 24) & 255);
    }

    private static int getMyLocalIp() {
        int ipAddress = ((WifiManager) ApplicationLoader.applicationContext.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (inetAddressNextElement.isSiteLocalAddress()) {
                            byte[] address = inetAddressNextElement.getAddress();
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

    private static class DataSourceInputStream extends InputStream {
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
        public int read() {
            int i = this.dataSource.read(this.tmpByte, 0, 1);
            this.availableBytes--;
            if (i == -1) {
                return -1;
            }
            return this.tmpByte[0] & 255;
        }

        @Override
        public int read(byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            int i3 = this.dataSource.read(bArr, i, i2);
            this.availableBytes -= (long) i3;
            return i3;
        }

        @Override
        public void close() {
            this.dataSource.close();
        }
    }
}
