package g2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import e2.l0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import v7.t6;
public final class o implements h {
    public final Context f7319a;
    public final ArrayList f7320b;
    public final h f7321c;
    public u d;
    public b e;
    public e f7322f;
    public h h;
    public f0 f7323n;
    public f f7324r;
    public b0 f7325s;
    public h f7326w;

    public o(Context context, h hVar) {
        this.f7319a = context.getApplicationContext();
        hVar.getClass();
        this.f7321c = hVar;
        this.f7320b = new ArrayList();
    }

    public static void c(h hVar, d0 d0Var) {
        if (hVar != null) {
            hVar.addTransferListener(d0Var);
        }
    }

    public final void a(h hVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f7320b;
            if (i10 < arrayList.size()) {
                hVar.addTransferListener((d0) arrayList.get(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.f7321c.addTransferListener(d0Var);
        this.f7320b.add(d0Var);
        c(this.d, d0Var);
        c(this.e, d0Var);
        c(this.f7322f, d0Var);
        c(this.h, d0Var);
        c(this.f7323n, d0Var);
        c(this.f7324r, d0Var);
        c(this.f7325s, d0Var);
    }

    @Override
    public final void close() {
        h hVar = this.f7326w;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f7326w = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        h hVar = this.f7326w;
        if (hVar == null) {
            return Collections.EMPTY_MAP;
        }
        return hVar.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        h hVar = this.f7326w;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override
    public final long open(n nVar) {
        boolean z10;
        if (this.f7326w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        Uri uri = nVar.f7314a;
        String scheme = uri.getScheme();
        String str = l0.f6165a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f7319a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.e == null) {
                    b bVar = new b(context);
                    this.e = bVar;
                    a(bVar);
                }
                this.f7326w = this.e;
            } else if ("content".equals(scheme)) {
                if (this.f7322f == null) {
                    e eVar = new e(context);
                    this.f7322f = eVar;
                    a(eVar);
                }
                this.f7326w = this.f7322f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f7321c;
                if (equals) {
                    if (this.h == null) {
                        try {
                            h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.h = hVar2;
                            a(hVar2);
                        } catch (ClassNotFoundException unused) {
                            e2.a.l("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating RTMP extension", e);
                        }
                        if (this.h == null) {
                            this.h = hVar;
                        }
                    }
                    this.f7326w = this.h;
                } else if ("udp".equals(scheme)) {
                    if (this.f7323n == null) {
                        f0 f0Var = new f0();
                        this.f7323n = f0Var;
                        a(f0Var);
                    }
                    this.f7326w = this.f7323n;
                } else if ("data".equals(scheme)) {
                    if (this.f7324r == null) {
                        ?? cVar = new c(false);
                        this.f7324r = cVar;
                        a(cVar);
                    }
                    this.f7326w = this.f7324r;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f7326w = hVar;
                } else {
                    if (this.f7325s == null) {
                        b0 b0Var = new b0(context);
                        this.f7325s = b0Var;
                        a(b0Var);
                    }
                    this.f7326w = this.f7325s;
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
                this.f7326w = this.e;
            } else {
                if (this.d == null) {
                    ?? cVar2 = new c(false);
                    this.d = cVar2;
                    a(cVar2);
                }
                this.f7326w = this.d;
            }
        }
        return this.f7326w.open(nVar);
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        h hVar = this.f7326w;
        hVar.getClass();
        return hVar.read(bArr, i10, i11);
    }
}
