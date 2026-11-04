package i2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import b8.zb;
import g2.n0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
public final class o implements h {
    public final Context f14570a;
    public final ArrayList f14571b;
    public final h f14572c;
    public u d;
    public b f14573e;
    public e f14574f;
    public h h;
    public f0 f14575n;
    public f f14576r;
    public b0 f14577s;
    public h f14578w;

    public o(Context context, h hVar) {
        this.f14570a = context.getApplicationContext();
        hVar.getClass();
        this.f14572c = hVar;
        this.f14571b = new ArrayList();
    }

    public static void b(h hVar, d0 d0Var) {
        if (hVar != null) {
            hVar.addTransferListener(d0Var);
        }
    }

    public final void a(h hVar) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f14571b;
            if (i3 < arrayList.size()) {
                hVar.addTransferListener((d0) arrayList.get(i3));
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.f14572c.addTransferListener(d0Var);
        this.f14571b.add(d0Var);
        b(this.d, d0Var);
        b(this.f14573e, d0Var);
        b(this.f14574f, d0Var);
        b(this.h, d0Var);
        b(this.f14575n, d0Var);
        b(this.f14576r, d0Var);
        b(this.f14577s, d0Var);
    }

    @Override
    public final void close() {
        h hVar = this.f14578w;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f14578w = null;
            }
        }
    }

    @Override
    public final Map getResponseHeaders() {
        h hVar = this.f14578w;
        if (hVar == null) {
            return Collections.EMPTY_MAP;
        }
        return hVar.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        h hVar = this.f14578w;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override
    public final long open(n nVar) {
        boolean z10;
        if (this.f14578w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        Uri uri = nVar.f14564a;
        String scheme = uri.getScheme();
        String str = n0.f11873a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f14570a;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.f14573e == null) {
                    b bVar = new b(context);
                    this.f14573e = bVar;
                    a(bVar);
                }
                this.f14578w = this.f14573e;
            } else if ("content".equals(scheme)) {
                if (this.f14574f == null) {
                    e eVar = new e(context);
                    this.f14574f = eVar;
                    a(eVar);
                }
                this.f14578w = this.f14574f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f14572c;
                if (equals) {
                    if (this.h == null) {
                        try {
                            h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.h = hVar2;
                            a(hVar2);
                        } catch (ClassNotFoundException unused) {
                            g2.a.l("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating RTMP extension", e10);
                        }
                        if (this.h == null) {
                            this.h = hVar;
                        }
                    }
                    this.f14578w = this.h;
                } else if ("udp".equals(scheme)) {
                    if (this.f14575n == null) {
                        f0 f0Var = new f0();
                        this.f14575n = f0Var;
                        a(f0Var);
                    }
                    this.f14578w = this.f14575n;
                } else if ("data".equals(scheme)) {
                    if (this.f14576r == null) {
                        ?? cVar = new c(false);
                        this.f14576r = cVar;
                        a(cVar);
                    }
                    this.f14578w = this.f14576r;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f14578w = hVar;
                } else {
                    if (this.f14577s == null) {
                        b0 b0Var = new b0(context);
                        this.f14577s = b0Var;
                        a(b0Var);
                    }
                    this.f14578w = this.f14577s;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f14573e == null) {
                    b bVar2 = new b(context);
                    this.f14573e = bVar2;
                    a(bVar2);
                }
                this.f14578w = this.f14573e;
            } else {
                if (this.d == null) {
                    ?? cVar2 = new c(false);
                    this.d = cVar2;
                    a(cVar2);
                }
                this.f14578w = this.d;
            }
        }
        return this.f14578w.open(nVar);
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        h hVar = this.f14578w;
        hVar.getClass();
        return hVar.read(bArr, i3, i10);
    }
}
