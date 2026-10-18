package g2;

import android.net.TrafficStats;
import android.net.Uri;
import e2.m0;
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
public final class r extends c {
    public final boolean f10810a;
    public final int f10811b;
    public final int f10812c;
    public final String d;
    public final n4.s e;
    public final n4.s f10813f;
    public m h;
    public HttpURLConnection f10814n;
    public InputStream f10815r;
    public boolean f10816s;
    public int v;
    public long f10817w;
    public long f10818x;

    public r(String str, int i10, int i11, boolean z10, n4.s sVar) {
        super(true);
        this.d = str;
        this.f10811b = i10;
        this.f10812c = i11;
        this.f10810a = z10;
        this.e = sVar;
        this.f10813f = new n4.s(19);
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f10814n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e2.a.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override
    public final void close() {
        try {
            InputStream inputStream = this.f10815r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = m0.f8253a;
                    throw new v(e, 2000, 3);
                }
            }
        } finally {
            this.f10815r = null;
            a();
            if (this.f10816s) {
                this.f10816s = false;
                transferEnded();
            }
            this.f10814n = null;
            this.h = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final URL d(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new v(r4.c.h("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f10810a && !protocol.equals(url.getProtocol())) {
                    throw new v("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e) {
                throw new v(e, 2001, 1);
            }
        }
        throw new v("Null location redirect", 2001);
    }

    public final HttpURLConnection e(m mVar) {
        boolean z10;
        HttpURLConnection f7;
        URL url = new URL(mVar.f10792a.toString());
        int i10 = mVar.f10793b;
        byte[] bArr = mVar.f10794c;
        long j10 = mVar.e;
        long j11 = mVar.f10795f;
        int i11 = 1;
        int i12 = 0;
        if ((mVar.h & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f10810a) {
            return f(url, i10, bArr, j10, j11, z10, true, mVar.d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                f7 = f(url, i10, bArr, j10, j11, z10, false, mVar.d);
                int responseCode = f7.getResponseCode();
                String headerField = f7.getHeaderField("Location");
                if ((i10 != i11 && i10 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    f7.disconnect();
                    url = d(url, headerField);
                    bArr = null;
                    i10 = 1;
                } else {
                    f7.disconnect();
                    url = d(url, headerField);
                }
                i12 = i13;
                i11 = 1;
            } else {
                throw new v(new NoRouteToHostException(i2.d.j(i13, "Too many redirects: ")), 2001, 1);
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
        httpURLConnection.setConnectTimeout(this.f10811b);
        httpURLConnection.setReadTimeout(this.f10812c);
        HashMap hashMap = new HashMap();
        n4.s sVar = this.e;
        if (sVar != null) {
            hashMap.putAll(sVar.A());
        }
        hashMap.putAll(this.f10813f.A());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = y.f10824a;
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
        int i11 = m.f10791i;
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
                InputStream inputStream = this.f10815r;
                String str = m0.f8253a;
                int read = inputStream.read(bArr, 0, (int) Math.min(j10, 4096));
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        j10 -= read;
                        bytesTransferred(read);
                    } else {
                        throw new v();
                    }
                } else {
                    throw new v(new InterruptedIOException(), 2000, 1);
                }
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f10814n;
        if (httpURLConnection == null) {
            return c2.h;
        }
        return new q(httpURLConnection.getHeaderFields());
    }

    @Override
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f10814n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        m mVar = this.h;
        if (mVar != null) {
            return mVar.f10792a;
        }
        return null;
    }

    @Override
    public final long open(g2.m r27) {
        throw new UnsupportedOperationException("Method not decompiled: g2.r.open(g2.m):long");
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f10817w;
            if (j10 != -1) {
                long j11 = j10 - this.f10818x;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f10815r;
            String str = m0.f8253a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.f10818x += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = m0.f8253a;
            throw v.a(e, 2);
        }
    }
}
