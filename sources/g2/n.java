package g2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class n implements h {
    public final Context f8513a;
    public final ArrayList f8514b;
    public final h f8515c;
    public t d;
    public b e;
    public e f8516f;
    public h h;
    public e0 f8517n;
    public f f8518r;
    public a0 f8519s;
    public h v;

    public n(Context context, h hVar) {
        this.f8513a = context.getApplicationContext();
        hVar.getClass();
        this.f8515c = hVar;
        this.f8514b = new ArrayList();
    }

    public static void c(h hVar, c0 c0Var) {
        if (hVar != null) {
            hVar.addTransferListener(c0Var);
        }
    }

    public final void a(h hVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8514b;
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
        this.f8515c.addTransferListener(c0Var);
        this.f8514b.add(c0Var);
        c(this.d, c0Var);
        c(this.e, c0Var);
        c(this.f8516f, c0Var);
        c(this.h, c0Var);
        c(this.f8517n, c0Var);
        c(this.f8518r, c0Var);
        c(this.f8519s, c0Var);
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
        Uri uri = mVar.f8508a;
        String scheme = uri.getScheme();
        String str = e2.d0.f7188a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f8513a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.e == null) {
                    b bVar = new b(context);
                    this.e = bVar;
                    a(bVar);
                }
                this.v = this.e;
            } else if ("content".equals(scheme)) {
                if (this.f8516f == null) {
                    e eVar = new e(context);
                    this.f8516f = eVar;
                    a(eVar);
                }
                this.v = this.f8516f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f8515c;
                if (equals) {
                    if (this.h == null) {
                        try {
                            h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.h = hVar2;
                            a(hVar2);
                        } catch (ClassNotFoundException unused) {
                            e2.a.n("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating RTMP extension", e);
                        }
                        if (this.h == null) {
                            this.h = hVar;
                        }
                    }
                    this.v = this.h;
                } else if ("udp".equals(scheme)) {
                    if (this.f8517n == null) {
                        e0 e0Var = new e0();
                        this.f8517n = e0Var;
                        a(e0Var);
                    }
                    this.v = this.f8517n;
                } else if ("data".equals(scheme)) {
                    if (this.f8518r == null) {
                        ?? cVar = new c(false);
                        this.f8518r = cVar;
                        a(cVar);
                    }
                    this.v = this.f8518r;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.v = hVar;
                } else {
                    if (this.f8519s == null) {
                        a0 a0Var = new a0(context);
                        this.f8519s = a0Var;
                        a(a0Var);
                    }
                    this.v = this.f8519s;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.e == null) {
                    b bVar2 = new b(context);
                    this.e = bVar2;
                    a(bVar2);
                }
                this.v = this.e;
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
