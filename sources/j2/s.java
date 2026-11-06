package j2;

import a8.p0;
import android.net.TrafficStats;
import android.net.Uri;
import h2.m0;
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
public final class s extends c {
    public final boolean f16471a;
    public final int f16472b;
    public final int f16473c;
    public final String d;
    public final wf.b f16474e;
    public final wf.b f16475f;
    public m h;
    public HttpURLConnection f16476n;
    public InputStream f16477r;
    public boolean f16478s;
    public int f16479w;
    public long f16480x;
    public long f16481y;

    public s(String str, int i7, int i10, boolean z9, wf.b bVar) {
        super(true);
        this.d = str;
        this.f16472b = i7;
        this.f16473c = i10;
        this.f16471a = z9;
        this.f16474e = bVar;
        this.f16475f = new wf.b(24);
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f16476n;
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
            InputStream inputStream = this.f16477r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    String str = m0.f14112a;
                    throw new w(e10, 2000, 3);
                }
            }
        } finally {
            this.f16477r = null;
            a();
            if (this.f16478s) {
                this.f16478s = false;
                transferEnded();
            }
            this.f16476n = null;
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
                    throw new w(rf.b.i("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f16471a && !protocol.equals(url.getProtocol())) {
                    throw new w("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e10) {
                throw new w(e10, 2001, 1);
            }
        }
        throw new w("Null location redirect", 2001);
    }

    public final HttpURLConnection e(m mVar) {
        boolean z9;
        HttpURLConnection f10;
        URL url = new URL(mVar.f16446a.toString());
        int i7 = mVar.f16447b;
        byte[] bArr = mVar.f16448c;
        long j3 = mVar.f16449e;
        long j10 = mVar.f16450f;
        int i10 = 1;
        int i11 = 0;
        if ((mVar.h & 1) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!this.f16471a) {
            return f(url, i7, bArr, j3, j10, z9, true, mVar.d);
        }
        while (true) {
            int i12 = i11 + 1;
            if (i11 <= 20) {
                f10 = f(url, i7, bArr, j3, j10, z9, false, mVar.d);
                int responseCode = f10.getResponseCode();
                String headerField = f10.getHeaderField("Location");
                if ((i7 != i10 && i7 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i7 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    f10.disconnect();
                    url = d(url, headerField);
                    bArr = null;
                    i7 = 1;
                } else {
                    f10.disconnect();
                    url = d(url, headerField);
                }
                i11 = i12;
                i10 = 1;
            } else {
                throw new w(new NoRouteToHostException(jg.g.j(i12, "Too many redirects: ")), 2001, 1);
            }
        }
        return f10;
    }

    public final HttpURLConnection f(URL url, int i7, byte[] bArr, long j3, long j10, boolean z9, boolean z10, Map map) {
        String sb2;
        String str;
        boolean z11;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f16472b);
        httpURLConnection.setReadTimeout(this.f16473c);
        HashMap hashMap = new HashMap();
        wf.b bVar = this.f16474e;
        if (bVar != null) {
            hashMap.putAll(bVar.a0());
        }
        hashMap.putAll(this.f16475f.a0());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = z.f16487a;
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
        if (z9) {
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
        int i10 = m.f16445i;
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

    public final void g(long j3) {
        if (j3 != 0) {
            byte[] bArr = new byte[4096];
            while (j3 > 0) {
                InputStream inputStream = this.f16477r;
                String str = m0.f14112a;
                int read = inputStream.read(bArr, 0, (int) Math.min(j3, 4096));
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        j3 -= read;
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
        HttpURLConnection httpURLConnection = this.f16476n;
        if (httpURLConnection == null) {
            return y1.h;
        }
        return new r(httpURLConnection.getHeaderFields());
    }

    @Override
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f16476n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        m mVar = this.h;
        if (mVar != null) {
            return mVar.f16446a;
        }
        return null;
    }

    @Override
    public final long open(j2.m r27) {
        throw new UnsupportedOperationException("Method not decompiled: j2.s.open(j2.m):long");
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j3 = this.f16480x;
            if (j3 != -1) {
                long j10 = j3 - this.f16481y;
                if (j10 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j10);
            }
            InputStream inputStream = this.f16477r;
            String str = m0.f14112a;
            int read = inputStream.read(bArr, i7, i10);
            if (read != -1) {
                this.f16481y += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            String str2 = m0.f14112a;
            throw w.a(e10, 2);
        }
    }
}
