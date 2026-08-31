package g5;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.ui.yh;
public final class x extends g {
    public final boolean f6953a;
    public final int f6954b;
    public final int f6955c;
    public final String d;
    public final f7.b f6956e;
    public final f7.b f6957f;
    public HttpURLConnection h;
    public InputStream f6958n;
    public boolean f6959r;
    public int f6960s;
    public long v;
    public long f6961w;

    public x(String str, int i10, int i11, boolean z4, f7.b bVar) {
        super(true);
        this.d = str;
        this.f6954b = i10;
        this.f6955c = i11;
        this.f6953a = z4;
        this.f6956e = bVar;
        this.f6957f = new f7.b(5, (byte) 0);
    }

    public static void k(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = h5.d0.f7237a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e6) {
                h5.a.p("DefaultHttpDataSource", "Unexpected error while disconnecting", e6);
            }
            this.h = null;
        }
    }

    @Override
    public final void close() {
        try {
            InputStream inputStream = this.f6958n;
            if (inputStream != null) {
                long j10 = this.v;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f6961w;
                }
                k(this.h, j11);
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    int i10 = h5.d0.f7237a;
                    throw new c0(e6, 2000, 3);
                }
            }
        } finally {
            this.f6958n = null;
            a();
            if (this.f6959r) {
                this.f6959r = false;
                transferEnded();
            }
        }
    }

    public final URL d(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new c0(yh.k("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f6953a && !protocol.equals(url.getProtocol())) {
                    throw new c0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e6) {
                throw new c0(e6, 2001, 1);
            }
        }
        throw new c0("Null location redirect", 2001);
    }

    @Override
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return s8.n0.h;
        }
        return new w(httpURLConnection.getHeaderFields());
    }

    @Override
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection h(p pVar) {
        boolean z4;
        HttpURLConnection j10;
        URL url = new URL(pVar.f6885a.toString());
        int i10 = pVar.f6886b;
        byte[] bArr = pVar.f6887c;
        long j11 = pVar.f6888e;
        long j12 = pVar.f6889f;
        int i11 = 1;
        int i12 = 0;
        if ((pVar.h & 1) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!this.f6953a) {
            return j(url, i10, bArr, j11, j12, z4, true, pVar.d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                j10 = j(url, i10, bArr, j11, j12, z4, false, pVar.d);
                int responseCode = j10.getResponseCode();
                String headerField = j10.getHeaderField("Location");
                if ((i10 != i11 && i10 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    j10.disconnect();
                    url = d(url, headerField);
                    bArr = null;
                    i10 = 1;
                } else {
                    j10.disconnect();
                    url = d(url, headerField);
                }
                i12 = i13;
                i11 = 1;
            } else {
                throw new c0(new NoRouteToHostException(l.d.j(i13, "Too many redirects: ")), 2001, 1);
            }
        }
        return j10;
    }

    public final HttpURLConnection j(URL url, int i10, byte[] bArr, long j10, long j11, boolean z4, boolean z10, Map map) {
        String sb;
        String str;
        boolean z11;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f6954b);
        httpURLConnection.setReadTimeout(this.f6955c);
        HashMap hashMap = new HashMap();
        f7.b bVar = this.f6956e;
        if (bVar != null) {
            hashMap.putAll(bVar.s());
        }
        hashMap.putAll(this.f6957f.s());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = f0.f6852a;
        if (j10 == 0 && j11 == -1) {
            sb = null;
        } else {
            StringBuilder s6 = android.support.v4.media.a.s(j10, "bytes=", "-");
            if (j11 != -1) {
                s6.append((j10 + j11) - 1);
            }
            sb = s6.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str3 = this.d;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z4) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z10);
        if (bArr != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        httpURLConnection.setDoOutput(z11);
        int i11 = p.f6884i;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str2 = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final void l(long j10) {
        if (j10 != 0) {
            byte[] bArr = new byte[4096];
            while (j10 > 0) {
                int min = (int) Math.min(j10, 4096);
                InputStream inputStream = this.f6958n;
                int i10 = h5.d0.f7237a;
                int read = inputStream.read(bArr, 0, min);
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        j10 -= read;
                        bytesTransferred(read);
                    } else {
                        throw new c0();
                    }
                } else {
                    throw new c0(new InterruptedIOException(), 2000, 1);
                }
            }
        }
    }

    @Override
    public final long open(g5.p r27) {
        throw new UnsupportedOperationException("Method not decompiled: g5.x.open(g5.p):long");
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.v;
            if (j10 != -1) {
                long j11 = j10 - this.f6961w;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f6958n;
            int i12 = h5.d0.f7237a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.f6961w += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e6) {
            int i13 = h5.d0.f7237a;
            throw c0.a(e6, 2);
        }
    }
}
