package g2;

import android.net.TrafficStats;
import android.net.Uri;
import e2.l0;
import e9.c2;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
public final class s extends c {
    public final boolean f7334a;
    public final int f7335b;
    public final int f7336c;
    public final String d;
    public final n4.q e;
    public final n4.q f7337f;
    public n h;
    public HttpURLConnection f7338n;
    public InputStream f7339r;
    public boolean f7340s;
    public int f7341w;
    public long f7342x;
    public long f7343y;

    public s(String str, int i10, int i11, boolean z10, n4.q qVar) {
        super(true);
        this.d = str;
        this.f7335b = i10;
        this.f7336c = i11;
        this.f7334a = z10;
        this.e = qVar;
        this.f7337f = new n4.q(19);
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f7338n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e2.a.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final URL c(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new w(sc.e.h("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f7334a && !protocol.equals(url.getProtocol())) {
                    throw new w("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e) {
                throw new w(e, 2001, 1);
            }
        }
        throw new w("Null location redirect", 2001);
    }

    @Override
    public final void close() {
        try {
            InputStream inputStream = this.f7339r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = l0.f6165a;
                    throw new w(e, 2000, 3);
                }
            }
        } finally {
            this.f7339r = null;
            a();
            if (this.f7340s) {
                this.f7340s = false;
                transferEnded();
            }
            this.f7338n = null;
            this.h = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final HttpURLConnection e(n nVar) {
        boolean z10;
        HttpURLConnection f7;
        URL url = new URL(nVar.f7315a.toString());
        int i10 = nVar.f7316b;
        byte[] bArr = nVar.f7317c;
        long j10 = nVar.e;
        long j11 = nVar.f7318f;
        int i11 = 1;
        int i12 = 0;
        if ((nVar.h & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f7334a) {
            return f(url, i10, bArr, j10, j11, z10, true, nVar.d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                f7 = f(url, i10, bArr, j10, j11, z10, false, nVar.d);
                int responseCode = f7.getResponseCode();
                String headerField = f7.getHeaderField("Location");
                if ((i10 != i11 && i10 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    f7.disconnect();
                    url = c(url, headerField);
                    bArr = null;
                    i10 = 1;
                } else {
                    f7.disconnect();
                    url = c(url, headerField);
                }
                i12 = i13;
                i11 = 1;
            } else {
                throw new w(new NoRouteToHostException(i0.a.i(i13, "Too many redirects: ")), 2001, 1);
            }
        }
        return f7;
    }

    public final HttpURLConnection f(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        boolean z12;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f7335b);
        httpURLConnection.setReadTimeout(this.f7336c);
        HashMap hashMap = new HashMap();
        n4.q qVar = this.e;
        if (qVar != null) {
            hashMap.putAll(qVar.x());
        }
        hashMap.putAll(this.f7337f.x());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = z.f7349a;
        if (j10 == 0 && j11 == -1) {
            sb2 = null;
        } else {
            StringBuilder s10 = a1.g.s(j10, "bytes=", "-");
            if (j11 != -1) {
                s10.append((j10 + j11) - 1);
            }
            sb2 = s10.toString();
        }
        if (sb2 != null) {
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        String str3 = this.d;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z10) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z11);
        if (bArr != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        httpURLConnection.setDoOutput(z12);
        int i11 = n.f7314i;
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

    public final void g(long j10) {
        if (j10 != 0) {
            byte[] bArr = new byte[4096];
            while (j10 > 0) {
                InputStream inputStream = this.f7339r;
                String str = l0.f6165a;
                int read = inputStream.read(bArr, 0, (int) Math.min(j10, 4096));
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        j10 -= read;
                        bytesTransferred(read);
                    } else {
                        throw new w();
                    }
                } else {
                    throw new w(new InterruptedIOException(), 2000, 1);
                }
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f7338n;
        if (httpURLConnection == null) {
            return c2.h;
        }
        return new r(httpURLConnection.getHeaderFields());
    }

    @Override
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f7338n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        n nVar = this.h;
        if (nVar != null) {
            return nVar.f7315a;
        }
        return null;
    }

    @Override
    public final long open(g2.n r27) {
        throw new UnsupportedOperationException("Method not decompiled: g2.s.open(g2.n):long");
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f7342x;
            if (j10 != -1) {
                long j11 = j10 - this.f7343y;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f7339r;
            String str = l0.f6165a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.f7343y += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = l0.f6165a;
            throw w.a(e, 2);
        }
    }
}
