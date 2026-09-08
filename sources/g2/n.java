package g2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class n implements h {
    public final Context f10364a;
    public final ArrayList f10365b;
    public final h f10366c;
    public t d;
    public b f10367e;
    public e f10368f;
    public h h;
    public e0 f10369n;
    public f f10370r;
    public a0 f10371s;
    public h v;

    public n(Context context, h hVar) {
        this.f10364a = context.getApplicationContext();
        hVar.getClass();
        this.f10366c = hVar;
        this.f10365b = new ArrayList();
    }

    public static void c(h hVar, c0 c0Var) {
        if (hVar != null) {
            hVar.addTransferListener(c0Var);
        }
    }

    public final void a(h hVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f10365b;
            if (i10 < arrayList.size()) {
                hVar.addTransferListener((c0) arrayList.get(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f10366c.addTransferListener(c0Var);
        this.f10365b.add(c0Var);
        c(this.d, c0Var);
        c(this.f10367e, c0Var);
        c(this.f10368f, c0Var);
        c(this.h, c0Var);
        c(this.f10369n, c0Var);
        c(this.f10370r, c0Var);
        c(this.f10371s, c0Var);
    }

    @Override
    public final void close() {
        h hVar = this.v;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.v = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        h hVar = this.v;
        if (hVar == null) {
            return Collections.EMPTY_MAP;
        }
        return hVar.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        h hVar = this.v;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override
    public final long open(m mVar) {
        boolean z10;
        if (this.v == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        Uri uri = mVar.f10358a;
        String scheme = uri.getScheme();
        String str = e2.d0.f8765a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f10364a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.f10367e == null) {
                    b bVar = new b(context);
                    this.f10367e = bVar;
                    a(bVar);
                }
                this.v = this.f10367e;
            } else if ("content".equals(scheme)) {
                if (this.f10368f == null) {
                    e eVar = new e(context);
                    this.f10368f = eVar;
                    a(eVar);
                }
                this.v = this.f10368f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f10366c;
                if (equals) {
                    if (this.h == null) {
                        try {
                            h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.h = hVar2;
                            a(hVar2);
                        } catch (ClassNotFoundException unused) {
                            e2.a.n("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e7) {
                            throw new RuntimeException("Error instantiating RTMP extension", e7);
                        }
                        if (this.h == null) {
                            this.h = hVar;
                        }
                    }
                    this.v = this.h;
                } else if ("udp".equals(scheme)) {
                    if (this.f10369n == null) {
                        e0 e0Var = new e0();
                        this.f10369n = e0Var;
                        a(e0Var);
                    }
                    this.v = this.f10369n;
                } else if ("data".equals(scheme)) {
                    if (this.f10370r == null) {
                        ?? cVar = new c(false);
                        this.f10370r = cVar;
                        a(cVar);
                    }
                    this.v = this.f10370r;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.v = hVar;
                } else {
                    if (this.f10371s == null) {
                        a0 a0Var = new a0(context);
                        this.f10371s = a0Var;
                        a(a0Var);
                    }
                    this.v = this.f10371s;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f10367e == null) {
                    b bVar2 = new b(context);
                    this.f10367e = bVar2;
                    a(bVar2);
                }
                this.v = this.f10367e;
            } else {
                if (this.d == null) {
                    ?? cVar2 = new c(false);
                    this.d = cVar2;
                    a(cVar2);
                }
                this.v = this.d;
            }
        }
        return this.v.open(mVar);
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        h hVar = this.v;
        hVar.getClass();
        return hVar.read(bArr, i10, i11);
    }
}
