package i2;

import android.net.TrafficStats;
import android.net.Uri;
import g2.n0;
import g9.x1;
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
import k2.p1;
public final class s extends c {
    public final boolean f14586a;
    public final int f14587b;
    public final int f14588c;
    public final String d;
    public final p4.q f14589e;
    public final p4.q f14590f;
    public n h;
    public HttpURLConnection f14591n;
    public InputStream f14592r;
    public boolean f14593s;
    public int f14594w;
    public long f14595x;
    public long f14596y;

    public s(String str, int i3, int i10, boolean z10, p4.q qVar) {
        super(true);
        this.d = str;
        this.f14587b = i3;
        this.f14588c = i10;
        this.f14586a = z10;
        this.f14589e = qVar;
        this.f14590f = new p4.q(23);
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f14591n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                g2.a.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    public final URL b(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new w(t4.c.f("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f14586a && !protocol.equals(url.getProtocol())) {
                    throw new w("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e10) {
                throw new w(e10, 2001, 1);
            }
        }
        throw new w("Null location redirect", 2001);
    }

    @Override
    public final void close() {
        try {
            InputStream inputStream = this.f14592r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    String str = n0.f11873a;
                    throw new w(e10, 2000, 3);
                }
            }
        } finally {
            this.f14592r = null;
            a();
            if (this.f14593s) {
                this.f14593s = false;
                transferEnded();
            }
            this.f14591n = null;
            this.h = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final HttpURLConnection f(n nVar) {
        boolean z10;
        HttpURLConnection i3;
        URL url = new URL(nVar.f14564a.toString());
        int i10 = nVar.f14565b;
        byte[] bArr = nVar.f14566c;
        long j10 = nVar.f14567e;
        long j11 = nVar.f14568f;
        int i11 = 1;
        int i12 = 0;
        if ((nVar.h & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f14586a) {
            return i(url, i10, bArr, j10, j11, z10, true, nVar.d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                i3 = i(url, i10, bArr, j10, j11, z10, false, nVar.d);
                int responseCode = i3.getResponseCode();
                String headerField = i3.getHeaderField("Location");
                if ((i10 != i11 && i10 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    i3.disconnect();
                    url = b(url, headerField);
                    bArr = null;
                    i10 = 1;
                } else {
                    i3.disconnect();
                    url = b(url, headerField);
                }
                i12 = i13;
                i11 = 1;
            } else {
                throw new w(new NoRouteToHostException(p1.i(i13, "Too many redirects: ")), 2001, 1);
            }
        }
        return i3;
    }

    @Override
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f14591n;
        if (httpURLConnection == null) {
            return x1.h;
        }
        return new r(httpURLConnection.getHeaderFields());
    }

    @Override
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f14591n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        n nVar = this.h;
        if (nVar != null) {
            return nVar.f14564a;
        }
        return null;
    }

    public final HttpURLConnection i(URL url, int i3, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        boolean z12;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f14587b);
        httpURLConnection.setReadTimeout(this.f14588c);
        HashMap hashMap = new HashMap();
        p4.q qVar = this.f14589e;
        if (qVar != null) {
            hashMap.putAll(qVar.w());
        }
        hashMap.putAll(this.f14590f.w());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = z.f14602a;
        if (j10 == 0 && j11 == -1) {
            sb2 = null;
        } else {
            StringBuilder t10 = a1.g.t(j10, "bytes=", "-");
            if (j11 != -1) {
                t10.append((j10 + j11) - 1);
            }
            sb2 = t10.toString();
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
        int i10 = n.f14563i;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
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

    public final void j(long j10) {
        if (j10 != 0) {
            byte[] bArr = new byte[4096];
            while (j10 > 0) {
                InputStream inputStream = this.f14592r;
                String str = n0.f11873a;
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
    public final long open(i2.n r27) {
        throw new UnsupportedOperationException("Method not decompiled: i2.s.open(i2.n):long");
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j10 = this.f14595x;
            if (j10 != -1) {
                long j11 = j10 - this.f14596y;
                if (j11 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j11);
            }
            InputStream inputStream = this.f14592r;
            String str = n0.f11873a;
            int read = inputStream.read(bArr, i3, i10);
            if (read != -1) {
                this.f14596y += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            String str2 = n0.f11873a;
            throw w.a(e10, 2);
        }
    }
}
