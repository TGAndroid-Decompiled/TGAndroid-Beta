package g2;

import android.net.Uri;
import e9.f1;
import hg.k0;
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
import org.telegram.ui.Cells.p6;
public final class r extends c {
    public final boolean f9393a;
    public final int f9394b;
    public final int f9395c;
    public final String d;
    public final n4.y e;
    public final n4.y f9396f;
    public m h;
    public HttpURLConnection f9397n;
    public InputStream f9398r;
    public boolean f9399s;
    public int v;
    public long f9400w;
    public long f9401x;

    public r(String str, int i10, int i11, boolean z10, n4.y yVar) {
        super(true);
        this.d = str;
        this.f9394b = i10;
        this.f9395c = i11;
        this.f9393a = z10;
        this.e = yVar;
        this.f9396f = new n4.y(15);
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.f9397n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e2.a.f("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final URL c(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new v(p6.i("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f9393a && !protocol.equals(url.getProtocol())) {
                    throw new v("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e) {
                throw new v(e, 2001, 1);
            }
        }
        throw new v("Null location redirect", 2001);
    }

    @Override
    public final void close() {
        try {
            InputStream inputStream = this.f9398r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = e2.d0.f7883a;
                    throw new v(e, 2000, 3);
                }
            }
        } finally {
            this.f9398r = null;
            b();
            if (this.f9399s) {
                this.f9399s = false;
                transferEnded();
            }
            this.f9397n = null;
            this.h = null;
        }
    }

    public final HttpURLConnection f(m mVar) {
        boolean z10;
        HttpURLConnection j3;
        URL url = new URL(mVar.f9375a.toString());
        int i10 = mVar.f9376b;
        byte[] bArr = mVar.f9377c;
        long j10 = mVar.e;
        long j11 = mVar.f9378f;
        int i11 = 1;
        int i12 = 0;
        if ((mVar.h & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f9393a) {
            return j(url, i10, bArr, j10, j11, z10, true, mVar.d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                j3 = j(url, i10, bArr, j10, j11, z10, false, mVar.d);
                int responseCode = j3.getResponseCode();
                String headerField = j3.getHeaderField("Location");
                if ((i10 != i11 && i10 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    j3.disconnect();
                    url = c(url, headerField);
                    bArr = null;
                    i10 = 1;
                } else {
                    j3.disconnect();
                    url = c(url, headerField);
                }
                i12 = i13;
                i11 = 1;
            } else {
                throw new v(new NoRouteToHostException(k0.i(i13, "Too many redirects: ")), 2001, 1);
            }
        }
        return j3;
    }

    @Override
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f9397n;
        if (httpURLConnection == null) {
            return f1.h;
        }
        return new q(httpURLConnection.getHeaderFields());
    }

    @Override
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f9397n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        m mVar = this.h;
        if (mVar != null) {
            return mVar.f9375a;
        }
        return null;
    }

    public final HttpURLConnection j(URL url, int i10, byte[] bArr, long j3, long j10, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        boolean z12;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f9394b);
        httpURLConnection.setReadTimeout(this.f9395c);
        HashMap hashMap = new HashMap();
        n4.y yVar = this.e;
        if (yVar != null) {
            hashMap.putAll(yVar.Q());
        }
        hashMap.putAll(this.f9396f.Q());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = y.f9406a;
        if (j3 == 0 && j10 == -1) {
            sb2 = null;
        } else {
            StringBuilder t10 = a4.a.t(j3, "bytes=", "-");
            if (j10 != -1) {
                t10.append((j3 + j10) - 1);
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
        int i11 = m.f9374i;
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

    public final void l(long j3) {
        if (j3 != 0) {
            byte[] bArr = new byte[4096];
            while (j3 > 0) {
                int min = (int) Math.min(j3, 4096);
                InputStream inputStream = this.f9398r;
                String str = e2.d0.f7883a;
                int read = inputStream.read(bArr, 0, min);
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
    public final long open(g2.m r27) {
        throw new UnsupportedOperationException("Method not decompiled: g2.r.open(g2.m):long");
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j3 = this.f9400w;
            if (j3 != -1) {
                long j10 = j3 - this.f9401x;
                if (j10 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j10);
            }
            InputStream inputStream = this.f9398r;
            String str = e2.d0.f7883a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.f9401x += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = e2.d0.f7883a;
            throw v.a(e, 2);
        }
    }
}
