package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class ru8 implements ja6 {
    public final uu8 E;
    public final Uri b;
    public final c0b c;
    public final mx6 d;
    public final uu8 e;
    public final gs2 f;
    public volatile boolean n;
    public long s;
    public yzb x;
    public boolean y;
    public final u21 h = new Object();
    public boolean r = true;
    public final long a = ea6.h.getAndIncrement();
    public g83 w = b(0, null);

    public ru8(uu8 uu8Var, Uri uri, a83 a83Var, mx6 mx6Var, uu8 uu8Var2, gs2 gs2Var) {
        this.E = uu8Var;
        this.b = uri;
        this.c = new c0b(a83Var);
        this.d = mx6Var;
        this.e = uu8Var2;
        this.f = gs2Var;
    }

    @Override
    public final void a() {
        s73 s73Var;
        s84 s84Var;
        int i;
        int i2 = 0;
        String str = null;
        while (i2 == 0 && !this.n) {
            try {
                long j = this.h.a;
                g83 b = b(j, str);
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
                    uu8 uu8Var = this.E;
                    uu8Var.I.post(new ou8(uu8Var, (byte) 0));
                }
                long j2 = open;
                this.E.K = ol5.d(this.c.a.getResponseHeaders());
                c0b c0bVar = this.c;
                ol5 ol5Var = this.E.K;
                if (ol5Var != null && (i = ol5Var.f) != -1) {
                    s73Var = new ml5(c0bVar, i, this);
                    yzb y = this.E.y(new tu8(0, true));
                    this.x = y;
                    y.g(uu8.m0);
                } else {
                    s73Var = c0bVar;
                }
                this.d.W(s73Var, this.b, this.c.a.getResponseHeaders(), j, j2, this.e);
                if (this.E.K != null && (s84Var = (s84) this.d.c) != null) {
                    s84 a = s84Var.a();
                    if (a instanceof kh7) {
                        ((kh7) a).t = true;
                    }
                }
                if (this.r) {
                    mx6 mx6Var = this.d;
                    long j3 = this.s;
                    s84 s84Var2 = (s84) mx6Var.c;
                    s84Var2.getClass();
                    s84Var2.d(j, j3);
                    this.r = false;
                }
                while (i2 == 0 && !this.n) {
                    try {
                        gs2 gs2Var = this.f;
                        synchronized (gs2Var) {
                            while (!gs2Var.b) {
                                gs2Var.a.getClass();
                                gs2Var.wait();
                            }
                        }
                        mx6 mx6Var2 = this.d;
                        u21 u21Var = this.h;
                        s84 s84Var3 = (s84) mx6Var2.c;
                        s84Var3.getClass();
                        vb3 vb3Var = (vb3) mx6Var2.d;
                        vb3Var.getClass();
                        i2 = s84Var3.b(vb3Var, u21Var);
                        long O = this.d.O();
                        if (O > this.E.s + j) {
                            this.f.d();
                            uu8 uu8Var2 = this.E;
                            uu8Var2.I.post(uu8Var2.H);
                            j = O;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.d.O() != -1) {
                    this.h.a = this.d.O();
                }
                wde.a(this.c);
            } finally {
                if (i2 != 1 && this.d.O() != -1) {
                    this.h.a = this.d.O();
                }
                wde.a(this.c);
            }
        }
    }

    public final g83 b(long j, String str) {
        Map map = uu8.l0;
        if (str != null && !str.startsWith("W/")) {
            kq kqVar = new kq(4);
            kqVar.x(map.entrySet());
            kqVar.w("If-Range", str);
            map = kqVar.f();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.E.r;
        Uri uri = this.b;
        jte.l(uri, "The uri must be set.");
        return new g83(uri, 1, null, map, j, -1L, str2, 6);
    }

    @Override
    public final void e() {
        this.n = true;
    }
}
