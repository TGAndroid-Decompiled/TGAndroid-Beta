package g2;

import android.net.TrafficStats;
import android.net.Uri;
import e2.n0;
import f9.x1;
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
import org.telegram.ui.Components.b10;
public final class r extends c {
    public final boolean f12275a;
    public final int f12276b;
    public final int f12277c;
    public final String d;
    public final n4.s e;
    public final n4.s f12278f;
    public m h;
    public HttpURLConnection f12279n;
    public InputStream f12280r;
    public boolean f12281s;
    public int v;
    public long f12282w;
    public long f12283x;

    public r(String str, int i10, int i11, boolean z10, n4.s sVar) {
        super(true);
        this.d = str;
        this.f12276b = i10;
        this.f12277c = i11;
        this.f12275a = z10;
        this.e = sVar;
        this.f12278f = new n4.s(19);
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f12279n;
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
            InputStream inputStream = this.f12280r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = n0.f9691a;
                    throw new v(e, 2000, 3);
                }
            }
        } finally {
            this.f12280r = null;
            a();
            if (this.f12281s) {
                this.f12281s = false;
                transferEnded();
            }
            this.f12279n = null;
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
                    throw new v(b10.j("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f12275a && !protocol.equals(url.getProtocol())) {
                    throw new v("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e) {
                throw new v(e, 2001, 1);
            }
        }
        throw new v("Null location redirect", 2001);
    }

    public final HttpURLConnection g(m mVar) {
        boolean z10;
        HttpURLConnection k10;
        URL url = new URL(mVar.f12257a.toString());
        int i10 = mVar.f12258b;
        byte[] bArr = mVar.f12259c;
        long j10 = mVar.e;
        long j11 = mVar.f12260f;
        int i11 = 1;
        int i12 = 0;
        if ((mVar.h & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f12275a) {
            return k(url, i10, bArr, j10, j11, z10, true, mVar.d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                k10 = k(url, i10, bArr, j10, j11, z10, false, mVar.d);
                int responseCode = k10.getResponseCode();
                String headerField = k10.getHeaderField("Location");
                if ((i10 != i11 && i10 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    k10.disconnect();
                    url = e(url, headerField);
                    bArr = null;
                    i10 = 1;
                } else {
                    k10.disconnect();
                    url = e(url, headerField);
                }
                i12 = i13;
                i11 = 1;
            } else {
                throw new v(new NoRouteToHostException(ic.a.i(i13, "Too many redirects: ")), 2001, 1);
            }
        }
        return k10;
    }

    @Override
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f12279n;
        if (httpURLConnection == null) {
            return x1.h;
        }
        return new q(httpURLConnection.getHeaderFields());
    }

    @Override
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f12279n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        m mVar = this.h;
        if (mVar != null) {
            return mVar.f12257a;
        }
        return null;
    }

    public final HttpURLConnection k(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        boolean z12;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f12276b);
        httpURLConnection.setReadTimeout(this.f12277c);
        HashMap hashMap = new HashMap();
        n4.s sVar = this.e;
        if (sVar != null) {
            hashMap.putAll(sVar.x());
        }
        hashMap.putAll(this.f12278f.x());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = y.f12289a;
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
        int i11 = m.f12256i;
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
                InputStream inputStream = this.f12280r;
                String str = n0.f9691a;
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
    public final long open(g2.m r27) {
        throw new UnsupportedOperationException("Method not decompiled: g2.r.open(g2.m):long");
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f12282w;
            if (j10 != -1) {
                long j11 = j10 - this.f12283x;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f12280r;
            String str = n0.f9691a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.f12283x += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = n0.f9691a;
            throw v.a(e, 2);
        }
    }
}
