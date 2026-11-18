package j2;

import a8.p0;
import android.net.TrafficStats;
import android.net.Uri;
import h2.l0;
import h9.y1;
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
    public final boolean f17207a;
    public final int f17208b;
    public final int f17209c;
    public final String d;
    public final q4.q f17210e;
    public final q4.q f17211f;
    public m h;
    public HttpURLConnection f17212n;
    public InputStream f17213r;
    public boolean f17214s;
    public int f17215w;
    public long f17216x;
    public long f17217y;

    public r(String str, int i7, int i10, boolean z10, q4.q qVar) {
        super(true);
        this.d = str;
        this.f17208b = i7;
        this.f17209c = i10;
        this.f17207a = z10;
        this.f17210e = qVar;
        this.f17211f = new q4.q(28);
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f17212n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                h2.a.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    @Override
    public final void close() {
        try {
            InputStream inputStream = this.f17213r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    String str = l0.f13783a;
                    throw new v(e10, 2000, 3);
                }
            }
        } finally {
            this.f17213r = null;
            a();
            if (this.f17214s) {
                this.f17214s = false;
                transferEnded();
            }
            this.f17212n = null;
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
                    throw new v(p5.c.k("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f17207a && !protocol.equals(url.getProtocol())) {
                    throw new v("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e10) {
                throw new v(e10, 2001, 1);
            }
        }
        throw new v("Null location redirect", 2001);
    }

    @Override
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f17212n;
        if (httpURLConnection == null) {
            return y1.h;
        }
        return new q(httpURLConnection.getHeaderFields());
    }

    @Override
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f17212n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        m mVar = this.h;
        if (mVar != null) {
            return mVar.f17185a;
        }
        return null;
    }

    public final HttpURLConnection h(m mVar) {
        boolean z10;
        HttpURLConnection i7;
        URL url = new URL(mVar.f17185a.toString());
        int i10 = mVar.f17186b;
        byte[] bArr = mVar.f17187c;
        long j3 = mVar.f17188e;
        long j10 = mVar.f17189f;
        int i11 = 1;
        int i12 = 0;
        if ((mVar.h & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f17207a) {
            return i(url, i10, bArr, j3, j10, z10, true, mVar.d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                i7 = i(url, i10, bArr, j3, j10, z10, false, mVar.d);
                int responseCode = i7.getResponseCode();
                String headerField = i7.getHeaderField("Location");
                if ((i10 != i11 && i10 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    i7.disconnect();
                    url = e(url, headerField);
                    bArr = null;
                    i10 = 1;
                } else {
                    i7.disconnect();
                    url = e(url, headerField);
                }
                i12 = i13;
                i11 = 1;
            } else {
                throw new v(new NoRouteToHostException(i5.c.i(i13, "Too many redirects: ")), 2001, 1);
            }
        }
        return i7;
    }

    public final HttpURLConnection i(URL url, int i7, byte[] bArr, long j3, long j10, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        boolean z12;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f17208b);
        httpURLConnection.setReadTimeout(this.f17209c);
        HashMap hashMap = new HashMap();
        q4.q qVar = this.f17210e;
        if (qVar != null) {
            hashMap.putAll(qVar.b());
        }
        hashMap.putAll(this.f17211f.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = y.f17223a;
        if (j3 == 0 && j10 == -1) {
            sb2 = null;
        } else {
            StringBuilder t6 = p0.t(j3, "bytes=", "-");
            if (j10 != -1) {
                t6.append((j3 + j10) - 1);
            }
            sb2 = t6.toString();
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
        int i10 = m.f17184i;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
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

    public final void j(long j3) {
        if (j3 != 0) {
            byte[] bArr = new byte[4096];
            while (j3 > 0) {
                InputStream inputStream = this.f17213r;
                String str = l0.f13783a;
                int read = inputStream.read(bArr, 0, (int) Math.min(j3, 4096));
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        j3 -= read;
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
    public final long open(j2.m r27) {
        throw new UnsupportedOperationException("Method not decompiled: j2.r.open(j2.m):long");
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j3 = this.f17216x;
            if (j3 != -1) {
                long j10 = j3 - this.f17217y;
                if (j10 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j10);
            }
            InputStream inputStream = this.f17213r;
            String str = l0.f13783a;
            int read = inputStream.read(bArr, i7, i10);
            if (read != -1) {
                this.f17217y += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            String str2 = l0.f13783a;
            throw v.a(e10, 2);
        }
    }
}
