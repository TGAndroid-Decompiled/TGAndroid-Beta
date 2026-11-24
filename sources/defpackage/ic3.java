package defpackage;

import android.net.TrafficStats;
import android.net.Uri;
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
public final class ic3 extends qg0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final wm4 e;
    public final wm4 f;
    public g83 h;
    public HttpURLConnection n;
    public InputStream r;
    public boolean s;
    public int w;
    public long x;
    public long y;

    public ic3(String str, int i, int i2, boolean z, wm4 wm4Var) {
        super(true);
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = z;
        this.e = wm4Var;
        this.f = new wm4();
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                ncd.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override
    public final void close() {
        try {
            InputStream inputStream = this.r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = hac.a;
                    throw new ii5(e, 2000, 3);
                }
            }
        } finally {
            this.r = null;
            a();
            if (this.s) {
                this.s = false;
                transferEnded();
            }
            this.n = null;
            this.h = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final URL e(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new ii5(b10.h("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.a && !protocol.equals(url.getProtocol())) {
                    String protocol2 = url.getProtocol();
                    throw new ii5("Disallowed cross-protocol redirect (" + protocol2 + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e) {
                throw new ii5(e, 2001, 1);
            }
        }
        throw new ii5("Null location redirect", 2001);
    }

    @Override
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection == null) {
            return d89.h;
        }
        return new hc3(httpURLConnection.getHeaderFields());
    }

    @Override
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        g83 g83Var = this.h;
        if (g83Var != null) {
            return g83Var.a;
        }
        return null;
    }

    public final HttpURLConnection h(g83 g83Var) {
        boolean z;
        HttpURLConnection j;
        URL url = new URL(g83Var.a.toString());
        byte b = g83Var.b;
        byte[] bArr = g83Var.c;
        long j2 = g83Var.e;
        long j3 = g83Var.f;
        byte b2 = 1;
        int i = 0;
        if ((g83Var.h & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!this.a) {
            return j(url, b, bArr, j2, j3, z, true, g83Var.d);
        }
        while (true) {
            int i2 = i + 1;
            if (i <= 20) {
                j = j(url, b, bArr, j2, j3, z, false, g83Var.d);
                int responseCode = j.getResponseCode();
                String headerField = j.getHeaderField("Location");
                if ((b != b2 && b != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (b != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    j.disconnect();
                    url = e(url, headerField);
                    bArr = null;
                    b = 1;
                } else {
                    j.disconnect();
                    url = e(url, headerField);
                }
                i = i2;
                b2 = 1;
            } else {
                throw new ii5(new NoRouteToHostException(hg9.j(i2, "Too many redirects: ")), 2001, 1);
            }
        }
        return j;
    }

    public final HttpURLConnection j(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        boolean z3;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.e.Y());
        hashMap.putAll(this.f.Y());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = ni5.a;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder o = wi8.o(j, "bytes=", "-");
            if (j2 != -1) {
                o.append((j + j2) - 1);
            }
            sb = o.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str3 = this.d;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z2);
        if (bArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        httpURLConnection.setDoOutput(z3);
        int i2 = g83.i;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "HEAD";
                } else {
                    rjb.h();
                    return null;
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

    public final void l(long j) {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                InputStream inputStream = this.r;
                String str = hac.a;
                int read = inputStream.read(bArr, 0, (int) Math.min(j, 4096L));
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        j -= read;
                        bytesTransferred(read);
                    } else {
                        throw new ii5();
                    }
                } else {
                    throw new ii5(new InterruptedIOException(), 2000, 1);
                }
            }
        }
    }

    @Override
    public final long open(defpackage.g83 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic3.open(g83):long");
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.x;
            if (j != -1) {
                long j2 = j - this.y;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                }
                return -1;
            }
            InputStream inputStream = this.r;
            String str = hac.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.y += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = hac.a;
            throw ii5.a(e, 2);
        }
    }
}
