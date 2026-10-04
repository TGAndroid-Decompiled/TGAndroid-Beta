package g2;

import android.net.Uri;
import e9.f1;
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
    public final boolean f10215a;
    public final int f10216b;
    public final int f10217c;
    public final String d;
    public final n4.y f10218e;
    public final n4.y f10219f;
    public m h;
    public HttpURLConnection f10220n;
    public InputStream f10221r;
    public boolean f10222s;
    public int v;
    public long f10223w;
    public long f10224x;

    public r(String str, int i10, int i11, boolean z10, n4.y yVar) {
        super(true);
        this.d = str;
        this.f10216b = i10;
        this.f10217c = i11;
        this.f10215a = z10;
        this.f10218e = yVar;
        this.f10219f = new n4.y(15);
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f10220n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                e2.a.f("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
        }
    }

    @Override
    public final void close() {
        try {
            InputStream inputStream = this.f10221r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    String str = e2.d0.f8538a;
                    throw new v(e7, 2000, 3);
                }
            }
        } finally {
            this.f10221r = null;
            a();
            if (this.f10222s) {
                this.f10222s = false;
                transferEnded();
            }
            this.f10220n = null;
            this.h = null;
        }
    }

    @Override
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f10220n;
        if (httpURLConnection == null) {
            return f1.h;
        }
        return new q(httpURLConnection.getHeaderFields());
    }

    @Override
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f10220n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        m mVar = this.h;
        if (mVar != null) {
            return mVar.f10194a;
        }
        return null;
    }

    public final URL i(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new v(sa.e.i("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f10215a && !protocol.equals(url.getProtocol())) {
                    throw new v("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e7) {
                throw new v(e7, 2001, 1);
            }
        }
        throw new v("Null location redirect", 2001);
    }

    public final HttpURLConnection j(m mVar) {
        boolean z10;
        HttpURLConnection k10;
        URL url = new URL(mVar.f10194a.toString());
        int i10 = mVar.f10195b;
        byte[] bArr = mVar.f10196c;
        long j3 = mVar.f10197e;
        long j10 = mVar.f10198f;
        int i11 = 1;
        int i12 = 0;
        if ((mVar.h & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f10215a) {
            return k(url, i10, bArr, j3, j10, z10, true, mVar.d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                k10 = k(url, i10, bArr, j3, j10, z10, false, mVar.d);
                int responseCode = k10.getResponseCode();
                String headerField = k10.getHeaderField("Location");
                if ((i10 != i11 && i10 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    k10.disconnect();
                    url = i(url, headerField);
                    bArr = null;
                    i10 = 1;
                } else {
                    k10.disconnect();
                    url = i(url, headerField);
                }
                i12 = i13;
                i11 = 1;
            } else {
                throw new v(new NoRouteToHostException(hg.c.h(i13, "Too many redirects: ")), 2001, 1);
            }
        }
        return k10;
    }

    public final HttpURLConnection k(URL url, int i10, byte[] bArr, long j3, long j10, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        boolean z12;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f10216b);
        httpURLConnection.setReadTimeout(this.f10217c);
        HashMap hashMap = new HashMap();
        n4.y yVar = this.f10218e;
        if (yVar != null) {
            hashMap.putAll(yVar.S());
        }
        hashMap.putAll(this.f10219f.S());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = y.f10230a;
        if (j3 == 0 && j10 == -1) {
            sb2 = null;
        } else {
            StringBuilder u10 = a4.a.u(j3, "bytes=", "-");
            if (j10 != -1) {
                u10.append((j3 + j10) - 1);
            }
            sb2 = u10.toString();
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
        int i11 = m.f10193i;
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
                InputStream inputStream = this.f10221r;
                String str = e2.d0.f8538a;
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
            long j3 = this.f10223w;
            if (j3 != -1) {
                long j10 = j3 - this.f10224x;
                if (j10 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j10);
            }
            InputStream inputStream = this.f10221r;
            String str = e2.d0.f8538a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.f10224x += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e7) {
            String str2 = e2.d0.f8538a;
            throw v.a(e7, 2);
        }
    }
}
