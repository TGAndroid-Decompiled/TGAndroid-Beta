package defpackage;

import android.util.Pair;
import java.util.List;
public final class uf5 implements s84 {
    public final byte a;
    public final ska b;
    public u84 c;
    public s84 d;
    public Pair e;
    public final s84 f;

    public uf5(int i, byte b) {
        kw5 kw5Var;
        tf5 tf5Var;
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ska(65496, 2, "image/jpeg");
                if ((i & 1) == 0) {
                    kw5Var = new kw5();
                } else {
                    kw5Var = null;
                }
                this.f = kw5Var;
                return;
            default:
                this.b = new ska(-1, -1, "image/heif");
                if ((i & 1) != 0) {
                    tf5Var = null;
                } else {
                    tf5Var = new tf5();
                }
                this.f = tf5Var;
                return;
        }
    }

    @Override
    public final s84 a() {
        byte b = this.a;
        return this;
    }

    @Override
    public final int b(t84 t84Var, u21 u21Var) {
        byte b = this.a;
        s84 s84Var = this.b;
        boolean z = true;
        s84 s84Var2 = this.f;
        switch (b) {
            case 0:
                s84 s84Var3 = this.d;
                if (s84Var3 == null) {
                    s84 s84Var4 = (tf5) s84Var2;
                    if (s84Var3 != null) {
                        z = false;
                    }
                    jte.p(z);
                    s84Var4.getClass();
                    if (s84Var4.c(t84Var)) {
                        s84Var = s84Var4;
                    }
                    this.d = s84Var;
                    ((vb3) t84Var).f = 0;
                    Pair pair = this.e;
                    if (pair != null) {
                        s84Var.d(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    s84 s84Var5 = this.d;
                    u84 u84Var = this.c;
                    u84Var.getClass();
                    s84Var5.f(u84Var);
                }
                return this.d.b(t84Var, u21Var);
            default:
                s84 s84Var6 = this.d;
                if (s84Var6 == null) {
                    s84 s84Var7 = (kw5) s84Var2;
                    if (s84Var6 != null) {
                        z = false;
                    }
                    jte.p(z);
                    s84Var7.getClass();
                    if (s84Var7.c(t84Var)) {
                        s84Var = s84Var7;
                    }
                    this.d = s84Var;
                    ((vb3) t84Var).f = 0;
                    Pair pair2 = this.e;
                    if (pair2 != null) {
                        s84Var.d(((Long) pair2.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    s84 s84Var8 = this.d;
                    u84 u84Var2 = this.c;
                    u84Var2.getClass();
                    s84Var8.f(u84Var2);
                }
                return this.d.b(t84Var, u21Var);
        }
    }

    @Override
    public final boolean c(t84 t84Var) {
        byte b = this.a;
        s84 s84Var = this.f;
        switch (b) {
            case 0:
                if (((tf5) s84Var) != null && ile.a((vb3) t84Var, true)) {
                    return true;
                }
                vb3 vb3Var = (vb3) t84Var;
                vb3Var.f = 0;
                return ile.a(vb3Var, false);
            default:
                kw5 kw5Var = (kw5) s84Var;
                if (kw5Var != null && kw5Var.c(t84Var)) {
                    return true;
                }
                ((vb3) t84Var).f = 0;
                return this.b.c(t84Var);
        }
    }

    @Override
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                s84 s84Var = this.d;
                if (s84Var != null) {
                    s84Var.d(j, j2);
                    return;
                } else {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                    return;
                }
            default:
                s84 s84Var2 = this.d;
                if (s84Var2 != null) {
                    s84Var2.d(j, j2);
                    return;
                } else {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                    return;
                }
        }
    }

    @Override
    public final List e() {
        byte b = this.a;
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        byte b = this.a;
        ska skaVar = this.b;
        s84 s84Var = this.f;
        switch (b) {
            case 0:
                this.c = u84Var;
                if (((tf5) s84Var) == null) {
                    this.d = skaVar;
                    skaVar.f(u84Var);
                    return;
                }
                return;
            default:
                this.c = u84Var;
                if (((kw5) s84Var) == null) {
                    this.d = skaVar;
                    skaVar.f(u84Var);
                    return;
                }
                return;
        }
    }

    @Override
    public final void release() {
        byte b = this.a;
        s84 s84Var = this.f;
        switch (b) {
            case 0:
                tf5 tf5Var = (tf5) s84Var;
                if (tf5Var != null) {
                    tf5Var.release();
                    return;
                }
                return;
            default:
                kw5 kw5Var = (kw5) s84Var;
                if (kw5Var != null) {
                    kw5Var.release();
                    return;
                }
                return;
        }
    }
}
