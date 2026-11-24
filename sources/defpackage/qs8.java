package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class qs8 implements k86 {
    public final ts8 E;
    public final Uri b;
    public final zxa c;
    public final mv6 d;
    public final ts8 e;
    public final vq2 f;
    public volatile boolean n;
    public long s;
    public wxb x;
    public boolean y;
    public final m11 h = new Object();
    public boolean r = true;
    public final long a = f86.h.getAndIncrement();
    public u63 w = b(0, null);

    public qs8(ts8 ts8Var, Uri uri, o63 o63Var, mv6 mv6Var, ts8 ts8Var2, vq2 vq2Var) {
        this.E = ts8Var;
        this.b = uri;
        this.c = new zxa(o63Var);
        this.d = mv6Var;
        this.e = ts8Var2;
        this.f = vq2Var;
    }

    @Override
    public final void a() {
        g63 g63Var;
        j74 j74Var;
        int i;
        int i2 = 0;
        String str = null;
        while (i2 == 0 && !this.n) {
            try {
                long j = this.h.a;
                u63 b = b(j, str);
                this.w = b;
                long open = this.c.open(b);
                if (this.n) {
                    return;
                }
                List list = (List) this.c.a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j;
                    ts8 ts8Var = this.E;
                    ts8Var.I.post(new ns8(ts8Var, (byte) 0));
                }
                long j2 = open;
                this.E.K = pj5.d(this.c.a.getResponseHeaders());
                zxa zxaVar = this.c;
                pj5 pj5Var = this.E.K;
                if (pj5Var != null && (i = pj5Var.f) != -1) {
                    g63Var = new nj5(zxaVar, i, this);
                    wxb y = this.E.y(new ss8(0, true));
                    this.x = y;
                    y.g(ts8.m0);
                } else {
                    g63Var = zxaVar;
                }
                this.d.U(g63Var, this.b, this.c.a.getResponseHeaders(), j, j2, this.e);
                if (this.E.K != null && (j74Var = (j74) this.d.c) != null) {
                    j74 a = j74Var.a();
                    if (a instanceof hf7) {
                        ((hf7) a).t = true;
                    }
                }
                if (this.r) {
                    mv6 mv6Var = this.d;
                    long j3 = this.s;
                    j74 j74Var2 = (j74) mv6Var.c;
                    j74Var2.getClass();
                    j74Var2.d(j, j3);
                    this.r = false;
                }
                while (i2 == 0 && !this.n) {
                    try {
                        vq2 vq2Var = this.f;
                        synchronized (vq2Var) {
                            while (!vq2Var.b) {
                                vq2Var.a.getClass();
                                vq2Var.wait();
                            }
                        }
                        mv6 mv6Var2 = this.d;
                        m11 m11Var = this.h;
                        j74 j74Var3 = (j74) mv6Var2.c;
                        j74Var3.getClass();
                        ja3 ja3Var = (ja3) mv6Var2.d;
                        ja3Var.getClass();
                        i2 = j74Var3.b(ja3Var, m11Var);
                        long M = this.d.M();
                        if (M > this.E.s + j) {
                            this.f.d();
                            ts8 ts8Var2 = this.E;
                            ts8Var2.I.post(ts8Var2.H);
                            j = M;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.d.M() != -1) {
                    this.h.a = this.d.M();
                }
                vbe.a(this.c);
            } finally {
                if (i2 != 1 && this.d.M() != -1) {
                    this.h.a = this.d.M();
                }
                vbe.a(this.c);
            }
        }
    }

    public final u63 b(long j, String str) {
        Map map = ts8.l0;
        if (str != null && !str.startsWith("W/")) {
            kp kpVar = new kp(4);
            kpVar.x(map.entrySet());
            kpVar.w("If-Range", str);
            map = kpVar.e();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.E.r;
        Uri uri = this.b;
        gre.l(uri, "The uri must be set.");
        return new u63(uri, 1, null, map, j, -1L, str2, 6);
    }

    @Override
    public final void d() {
        this.n = true;
    }
}
