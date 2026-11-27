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
public final class pb3 extends sf0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final um4 e;
    public final um4 f;
    public n73 h;
    public HttpURLConnection n;
    public InputStream r;
    public boolean s;
    public int w;
    public long x;
    public long y;

    public pb3(String str, int i, int i2, boolean z, um4 um4Var) {
        super(true);
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = z;
        this.e = um4Var;
        this.f = new um4();
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                efd.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
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
                    String str = gcc.a;
                    throw new li5(e, 2000, 3);
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

    public final URL f(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new li5(c00.i("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.a && !protocol.equals(url.getProtocol())) {
                    String protocol2 = url.getProtocol();
                    throw new li5("Disallowed cross-protocol redirect (" + protocol2 + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e) {
                throw new li5(e, 2001, 1);
            }
        }
        throw new li5("Null location redirect", 2001);
    }

    @Override
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection == null) {
            return o99.h;
        }
        return new ob3(httpURLConnection.getHeaderFields());
    }

    @Override
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        n73 n73Var = this.h;
        if (n73Var != null) {
            return n73Var.a;
        }
        return null;
    }

    public final HttpURLConnection i(n73 n73Var) {
        boolean z;
        HttpURLConnection j;
        URL url = new URL(n73Var.a.toString());
        byte b = n73Var.b;
        byte[] bArr = n73Var.c;
        long j2 = n73Var.e;
        long j3 = n73Var.f;
        byte b2 = 1;
        int i = 0;
        if ((n73Var.h & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!this.a) {
            return j(url, b, bArr, j2, j3, z, true, n73Var.d);
        }
        while (true) {
            int i2 = i + 1;
            if (i <= 20) {
                j = j(url, b, bArr, j2, j3, z, false, n73Var.d);
                int responseCode = j.getResponseCode();
                String headerField = j.getHeaderField("Location");
                if ((b != b2 && b != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (b != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    j.disconnect();
                    url = f(url, headerField);
                    bArr = null;
                    b = 1;
                } else {
                    j.disconnect();
                    url = f(url, headerField);
                }
                i = i2;
                b2 = 1;
            } else {
                throw new li5(new NoRouteToHostException(uh9.k(i2, "Too many redirects: ")), 2001, 1);
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
        hashMap.putAll(this.e.T());
        hashMap.putAll(this.f.T());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = qi5.a;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder o = ik8.o(j, "bytes=", "-");
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
        int i2 = n73.i;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "HEAD";
                } else {
                    grb.g();
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

    public final void k(long j) {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                InputStream inputStream = this.r;
                String str = gcc.a;
                int read = inputStream.read(bArr, 0, (int) Math.min(j, 4096L));
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        j -= read;
                        bytesTransferred(read);
                    } else {
                        throw new li5();
                    }
                } else {
                    throw new li5(new InterruptedIOException(), 2000, 1);
                }
            }
        }
    }

    @Override
    public final long open(defpackage.n73 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb3.open(n73):long");
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
            String str = gcc.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.y += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = gcc.a;
            throw li5.a(e, 2);
        }
    }
}
