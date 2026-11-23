package j2;

import a8.la;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import h2.l0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class n implements h {
    public final Context f17219a;
    public final ArrayList f17220b;
    public final h f17221c;
    public t d;
    public b f17222e;
    public e f17223f;
    public h h;
    public e0 f17224n;
    public f f17225r;
    public a0 f17226s;
    public h f17227w;

    public n(Context context, h hVar) {
        this.f17219a = context.getApplicationContext();
        hVar.getClass();
        this.f17221c = hVar;
        this.f17220b = new ArrayList();
    }

    public static void e(h hVar, c0 c0Var) {
        if (hVar != null) {
            hVar.addTransferListener(c0Var);
        }
    }

    public final void a(h hVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f17220b;
            if (i7 < arrayList.size()) {
                hVar.addTransferListener((c0) arrayList.get(i7));
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f17221c.addTransferListener(c0Var);
        this.f17220b.add(c0Var);
        e(this.d, c0Var);
        e(this.f17222e, c0Var);
        e(this.f17223f, c0Var);
        e(this.h, c0Var);
        e(this.f17224n, c0Var);
        e(this.f17225r, c0Var);
        e(this.f17226s, c0Var);
    }

    @Override
    public final void close() {
        h hVar = this.f17227w;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f17227w = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        h hVar = this.f17227w;
        if (hVar == null) {
            return Collections.EMPTY_MAP;
        }
        return hVar.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        h hVar = this.f17227w;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override
    public final long open(m mVar) {
        boolean z10;
        if (this.f17227w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        Uri uri = mVar.f17213a;
        String scheme = uri.getScheme();
        String str = l0.f13815a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f17219a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.f17222e == null) {
                    b bVar = new b(context);
                    this.f17222e = bVar;
                    a(bVar);
                }
                this.f17227w = this.f17222e;
            } else if ("content".equals(scheme)) {
                if (this.f17223f == null) {
                    e eVar = new e(context);
                    this.f17223f = eVar;
                    a(eVar);
                }
                this.f17227w = this.f17223f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f17221c;
                if (equals) {
                    if (this.h == null) {
                        try {
                            h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.h = hVar2;
                            a(hVar2);
                        } catch (ClassNotFoundException unused) {
                            h2.a.l("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating RTMP extension", e10);
                        }
                        if (this.h == null) {
                            this.h = hVar;
                        }
                    }
                    this.f17227w = this.h;
                } else if ("udp".equals(scheme)) {
                    if (this.f17224n == null) {
                        e0 e0Var = new e0();
                        this.f17224n = e0Var;
                        a(e0Var);
                    }
                    this.f17227w = this.f17224n;
                } else if ("data".equals(scheme)) {
                    if (this.f17225r == null) {
                        ?? cVar = new c(false);
                        this.f17225r = cVar;
                        a(cVar);
                    }
                    this.f17227w = this.f17225r;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f17227w = hVar;
                } else {
                    if (this.f17226s == null) {
                        a0 a0Var = new a0(context);
                        this.f17226s = a0Var;
                        a(a0Var);
                    }
                    this.f17227w = this.f17226s;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f17222e == null) {
                    b bVar2 = new b(context);
                    this.f17222e = bVar2;
                    a(bVar2);
                }
                this.f17227w = this.f17222e;
            } else {
                if (this.d == null) {
                    ?? cVar2 = new c(false);
                    this.d = cVar2;
                    a(cVar2);
                }
                this.f17227w = this.d;
            }
        }
        return this.f17227w.open(mVar);
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        h hVar = this.f17227w;
        hVar.getClass();
        return hVar.read(bArr, i7, i10);
    }
}
