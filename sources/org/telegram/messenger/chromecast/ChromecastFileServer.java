package org.telegram.messenger.chromecast;

import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import androidx.datastore.preferences.PreferencesProto$Value$ValueCase$EnumUnboxingSharedUtility;
import androidx.recyclerview.widget.DiffUtil;
import com.android.billingclient.api.zzcm;
import com.android.billingclient.api.zzcs;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.internal.mlkit_language_id_common.zzig;
import com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0;
import fi.iki.elonen.NanoHTTPD;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;

public final class ChromecastFileServer extends NanoHTTPD {
    public static final ChromecastMedia ASSET_FALLBACK_FILE;
    public static final HashMap ASSET_FILES_MAP;
    public final FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0 assetDataSourceFactory;
    public final HashMap castedFiles;
    public Pair coverFile;
    public final zzcm fileDataSourceFactory;
    public final ExtendedDefaultDataSourceFactory mediaDataSourceFactory;
    public final AtomicInteger reqId;
    public boolean started;

    public final class Range {
        public final long end;
        public final long start;

        public Range(long j, long j2) {
            this.start = j;
            this.end = j2;
        }
    }

    static {
        ChromecastMedia chromecastMedia = new ChromecastMedia(new ChromecastMedia.Builder(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        ASSET_FALLBACK_FILE = chromecastMedia;
        ChromecastMedia[] chromecastMediaArr = {chromecastMedia};
        HashMap map = new HashMap();
        ASSET_FILES_MAP = map;
        ChromecastMedia chromecastMedia2 = chromecastMediaArr[0];
        map.put(chromecastMedia2.externalPath, chromecastMedia2);
    }

    public ChromecastFileServer() {
        this.tempFileManagerFactory = new zzcs(21);
        this.asyncRunner = new NanoHTTPD.DefaultAsyncRunner(0);
        this.castedFiles = new HashMap();
        this.coverFile = null;
        this.started = false;
        this.reqId = new AtomicInteger();
        this.assetDataSourceFactory = new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(14);
        this.fileDataSourceFactory = new zzcm();
        this.mediaDataSourceFactory = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String getHost() {
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
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb.append(":61578");
        return sb.toString();
    }

    public final void check() {
        if (!this.castedFiles.isEmpty()) {
            if (this.started) {
                return;
            }
            try {
                start();
                this.started = true;
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (this.started) {
            try {
                NanoHTTPD.safeClose(this.myServerSocket);
                NanoHTTPD.DefaultAsyncRunner defaultAsyncRunner = this.asyncRunner;
                defaultAsyncRunner.getClass();
                ArrayList arrayList = new ArrayList((List) defaultAsyncRunner.running);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    NanoHTTPD.ClientHandler clientHandler = (NanoHTTPD.ClientHandler) obj;
                    NanoHTTPD.safeClose(clientHandler.inputStream);
                    NanoHTTPD.safeClose(clientHandler.acceptSocket);
                }
                Thread thread = this.myThread;
                if (thread != null) {
                    thread.join();
                }
            } catch (Exception e2) {
                NanoHTTPD.LOG.log(Level.SEVERE, "Could not stop all connections", (Throwable) e2);
            }
            this.started = false;
        }
    }

    @Override
    public final NanoHTTPD.Response serve(NanoHTTPD.HTTPSession hTTPSession) {
        String str;
        int iIncrementAndGet = this.reqId.incrementAndGet();
        StringBuilder sbM = DiffUtil.m(iIncrementAndGet, "Request ", " ");
        switch (hTTPSession.method) {
            case 1:
                str = "GET";
                break;
            case 2:
                str = "PUT";
                break;
            case 3:
                str = "POST";
                break;
            case 4:
                str = "DELETE";
                break;
            case 5:
                str = "HEAD";
                break;
            case 6:
                str = "OPTIONS";
                break;
            case 7:
                str = "TRACE";
                break;
            case 8:
                str = "CONNECT";
                break;
            case 9:
                str = "PATCH";
                break;
            case 10:
                str = "PROPFIND";
                break;
            case 11:
                str = "PROPPATCH";
                break;
            case 12:
                str = "MKCOL";
                break;
            case 13:
                str = "MOVE";
                break;
            case 14:
                str = "COPY";
                break;
            case 15:
                str = "LOCK";
                break;
            case 16:
                str = "UNLOCK";
                break;
            default:
                str = "null";
                break;
        }
        sbM.append(str);
        sbM.append(" ");
        sbM.append(hTTPSession.uri);
        sbM.append(" ");
        sbM.append((String) hTTPSession.headers.get("range"));
        Log.d("CAST_SERVER", sbM.toString());
        try {
            NanoHTTPD.Response responseServeImpl = serveImpl(hTTPSession);
            responseServeImpl.addHeader("Access-Control-Allow-Origin", "*");
            responseServeImpl.addHeader("Access-Control-Max-Age", "3628800");
            responseServeImpl.addHeader("Access-Control-Allow-Methods", "*");
            responseServeImpl.addHeader("Access-Control-Allow-Headers", "*");
            return responseServeImpl;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + iIncrementAndGet);
            NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, "text/plain", "Error reading file");
            responseNewFixedLengthResponse.addHeader("Access-Control-Allow-Origin", "*");
            responseNewFixedLengthResponse.addHeader("Access-Control-Max-Age", "3628800");
            responseNewFixedLengthResponse.addHeader("Access-Control-Allow-Methods", "*");
            responseNewFixedLengthResponse.addHeader("Access-Control-Allow-Headers", "*");
            return responseNewFixedLengthResponse;
        }
    }

    public final NanoHTTPD.Response serveImpl(NanoHTTPD.HTTPSession hTTPSession) {
        boolean z;
        Range range;
        long j;
        NanoHTTPD.Response responseNewFixedLengthResponse;
        NanoHTTPD.Response response;
        long j2;
        long j3;
        String str = (String) hTTPSession.headers.get("host");
        String path = Uri.parse("http://" + str + hTTPSession.uri).getPath();
        boolean zEquals = PreferencesProto$Value$ValueCase$EnumUnboxingSharedUtility.equals(6, hTTPSession.method);
        NanoHTTPD.Response.Status status = NanoHTTPD.Response.Status.OK;
        if (zEquals) {
            return NanoHTTPD.newFixedLengthResponse(status, "text/plain", "");
        }
        boolean zEquals2 = TextUtils.equals(path, "/");
        HashMap map = this.castedFiles;
        HashMap map2 = ASSET_FILES_MAP;
        int i = 0;
        if (zEquals2) {
            StringBuilder sb = new StringBuilder();
            if (this.coverFile != null) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(zzig.m("http://", str, (String) this.coverFile.first));
            }
            while (i < 2) {
                for (Map.Entry entry : (i == 0 ? map2 : map).entrySet()) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(zzig.m("http://", str, (String) entry.getKey()));
                    MediaMetadata mediaMetadata = ((ChromecastMedia) entry.getValue()).mediaMetadata;
                    if (mediaMetadata != null) {
                        MediaMetadata.throwIfWrongType(1, "com.google.android.gms.cast.metadata.TITLE");
                        Bundle bundle = mediaMetadata.zza;
                        String string = bundle.getString("com.google.android.gms.cast.metadata.TITLE");
                        MediaMetadata.throwIfWrongType(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                        String string2 = bundle.getString("com.google.android.gms.cast.metadata.SUBTITLE");
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
            return NanoHTTPD.newFixedLengthResponse(status, "text/plain", sb.toString());
        }
        ChromecastMedia chromecastMedia = (ChromecastMedia) map2.get(path);
        if (chromecastMedia == null) {
            chromecastMedia = (ChromecastMedia) map.get(path);
        }
        if (chromecastMedia == null) {
            Pair pair = this.coverFile;
            File file = (pair == null || !((String) pair.first).equalsIgnoreCase(path)) ? null : (File) this.coverFile.second;
            return file != null ? new NanoHTTPD.Response(status, "image/jpeg", new BufferedInputStream(new FileInputStream(file)), file.length()) : NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NOT_FOUND, "text/plain", "file not found");
        }
        String str2 = (String) hTTPSession.headers.get("host");
        Uri uri = chromecastMedia.internalUri;
        boolean zStartsWith = uri.toString().startsWith("data:application/x-mpegurl;base64,");
        String str3 = chromecastMedia.mimeType;
        if (zStartsWith) {
            return NanoHTTPD.newFixedLengthResponse(status, str3, new String(Base64.decode(uri.toString().substring(34), 0)).replaceAll("mtproto:", zzig.m("http://", str2, "/mtproto_")));
        }
        DataSource dataSourceCreateDataSource = (uri.toString().startsWith("file://") ? uri.toString().startsWith("file:///android_asset/") ? this.assetDataSourceFactory : this.fileDataSourceFactory : this.mediaDataSourceFactory).createDataSource();
        Map map3 = Collections.EMPTY_MAP;
        long j4 = 0;
        long j5 = -1;
        long jOpen = dataSourceCreateDataSource.open(new DataSpec(uri, null, map3, 0L, -1L, null, 0));
        dataSourceCreateDataSource.close();
        boolean zEquals3 = TextUtils.equals(str3, "application/x-mpegURL");
        if (!zEquals3) {
            z = zEquals3;
            String str4 = (String) hTTPSession.headers.get("range");
            if (!TextUtils.isEmpty(str4)) {
                String strSubstring = str4.trim().substring(6);
                if (strSubstring.startsWith("-")) {
                    j3 = jOpen - 1;
                    j2 = j3 - Long.parseLong(strSubstring.substring(1));
                } else {
                    String[] strArrSplit = strSubstring.split("-");
                    j2 = Long.parseLong(strArrSplit[0]);
                    j3 = strArrSplit.length > 1 ? Long.parseLong(strArrSplit[1]) : jOpen - 1;
                }
                long j6 = j2;
                long j7 = jOpen - 1;
                range = new Range(j6, j3 > j7 ? j7 : j3);
            }
            if (range != null) {
                j = (range.end - range.start) + 1;
            } else {
                j = jOpen;
            }
            if (range != null) {
                j5 = j;
                j4 = range.start;
            }
            if (z) {
                int i2 = (int) j;
                byte[] bArr = new byte[i2];
                dataSourceCreateDataSource.open(new DataSpec(uri, null, map3, j4, j5, null, 0));
                dataSourceCreateDataSource.read(bArr, 0, i2);
                dataSourceCreateDataSource.close();
                return NanoHTTPD.newFixedLengthResponse(status, str3, new String(bArr).replaceAll("mtproto:", zzig.m("http://", str2, "/mtproto_")));
            }
            if (j != 0) {
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(dataSourceCreateDataSource, new DataSpec(uri, null, map3, j4, j5, null, 0));
                if (range != null) {
                    status = NanoHTTPD.Response.Status.PARTIAL_CONTENT;
                }
                responseNewFixedLengthResponse = new NanoHTTPD.Response(status, chromecastMedia.mimeType, dataSourceInputStream, j);
            } else {
                responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NO_CONTENT, str3, "");
            }
            response = responseNewFixedLengthResponse;
            if (range != null) {
                response.addHeader("Content-Range", "bytes " + range.start + "-" + range.end + "/" + jOpen);
            }
            return response;
        }
        z = zEquals3;
        jOpen = jOpen;
        range = null;
        if (range != null) {
            j = (range.end - range.start) + 1;
        } else {
            j = jOpen;
        }
        if (range != null) {
            j5 = j;
            j4 = range.start;
        }
        if (z) {
            int i3 = (int) j;
            byte[] bArr2 = new byte[i3];
            dataSourceCreateDataSource.open(new DataSpec(uri, null, map3, j4, j5, null, 0));
            dataSourceCreateDataSource.read(bArr2, 0, i3);
            dataSourceCreateDataSource.close();
            return NanoHTTPD.newFixedLengthResponse(status, str3, new String(bArr2).replaceAll("mtproto:", zzig.m("http://", str2, "/mtproto_")));
        }
        if (j != 0) {
            DataSourceInputStream dataSourceInputStream2 = new DataSourceInputStream(dataSourceCreateDataSource, new DataSpec(uri, null, map3, j4, j5, null, 0));
            if (range != null) {
                status = NanoHTTPD.Response.Status.PARTIAL_CONTENT;
            }
            responseNewFixedLengthResponse = new NanoHTTPD.Response(status, chromecastMedia.mimeType, dataSourceInputStream2, j);
        } else {
            responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NO_CONTENT, str3, "");
        }
        response = responseNewFixedLengthResponse;
        if (range != null) {
            response.addHeader("Content-Range", "bytes " + range.start + "-" + range.end + "/" + jOpen);
        }
        return response;
    }

    public final void setCoverFile(File file, String str) {
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

    public final class DataSourceInputStream extends InputStream implements AutoCloseable {
        public long availableBytes;
        public final DataSource dataSource;
        public final byte[] tmpByte = new byte[1];

        public DataSourceInputStream(DataSource dataSource, DataSpec dataSpec) {
            this.dataSource = dataSource;
            try {
                this.availableBytes = dataSource.open(dataSpec);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public final int available() {
            return (int) this.availableBytes;
        }

        @Override
        public final void close() {
            this.dataSource.close();
        }

        @Override
        public final int read() {
            DataSource dataSource = this.dataSource;
            byte[] bArr = this.tmpByte;
            int i = dataSource.read(bArr, 0, 1);
            this.availableBytes--;
            if (i == -1) {
                return -1;
            }
            return bArr[0] & 255;
        }

        @Override
        public final int read(byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            int i3 = this.dataSource.read(bArr, i, i2);
            this.availableBytes -= (long) i3;
            return i3;
        }
    }
}
