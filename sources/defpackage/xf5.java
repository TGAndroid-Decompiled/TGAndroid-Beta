package defpackage;

import android.util.Pair;
import java.util.List;
public final class xf5 implements e84 {
    public final byte a;
    public final lma b;
    public g84 c;
    public e84 d;
    public Pair e;
    public final e84 f;

    public xf5(int i, byte b) {
        pw5 pw5Var;
        wf5 wf5Var;
        this.a = b;
        switch (b) {
            case 1:
                this.b = new lma(65496, 2, "image/jpeg");
                if ((i & 1) == 0) {
                    pw5Var = new pw5();
                } else {
                    pw5Var = null;
                }
                this.f = pw5Var;
                return;
            default:
                this.b = new lma(-1, -1, "image/heif");
                if ((i & 1) != 0) {
                    wf5Var = null;
                } else {
                    wf5Var = new wf5();
                }
                this.f = wf5Var;
                return;
        }
    }

    @Override
    public final e84 a() {
        byte b = this.a;
        return this;
    }

    @Override
    public final int b(f84 f84Var, v11 v11Var) {
        byte b = this.a;
        e84 e84Var = this.b;
        boolean z = true;
        e84 e84Var2 = this.f;
        switch (b) {
            case 0:
                e84 e84Var3 = this.d;
                if (e84Var3 == null) {
                    e84 e84Var4 = (wf5) e84Var2;
                    if (e84Var3 != null) {
                        z = false;
                    }
                    yve.p(z);
                    e84Var4.getClass();
                    if (e84Var4.c(f84Var)) {
                        e84Var = e84Var4;
                    }
                    this.d = e84Var;
                    ((cb3) f84Var).f = 0;
                    Pair pair = this.e;
                    if (pair != null) {
                        e84Var.d(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    e84 e84Var5 = this.d;
                    g84 g84Var = this.c;
                    g84Var.getClass();
                    e84Var5.f(g84Var);
                }
                return this.d.b(f84Var, v11Var);
            default:
                e84 e84Var6 = this.d;
                if (e84Var6 == null) {
                    e84 e84Var7 = (pw5) e84Var2;
                    if (e84Var6 != null) {
                        z = false;
                    }
                    yve.p(z);
                    e84Var7.getClass();
                    if (e84Var7.c(f84Var)) {
                        e84Var = e84Var7;
                    }
                    this.d = e84Var;
                    ((cb3) f84Var).f = 0;
                    Pair pair2 = this.e;
                    if (pair2 != null) {
                        e84Var.d(((Long) pair2.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    e84 e84Var8 = this.d;
                    g84 g84Var2 = this.c;
                    g84Var2.getClass();
                    e84Var8.f(g84Var2);
                }
                return this.d.b(f84Var, v11Var);
        }
    }

    @Override
    public final boolean c(f84 f84Var) {
        byte b = this.a;
        e84 e84Var = this.f;
        switch (b) {
            case 0:
                if (((wf5) e84Var) != null && boe.a((cb3) f84Var, true)) {
                    return true;
                }
                cb3 cb3Var = (cb3) f84Var;
                cb3Var.f = 0;
                return boe.a(cb3Var, false);
            default:
                pw5 pw5Var = (pw5) e84Var;
                if (pw5Var != null && pw5Var.c(f84Var)) {
                    return true;
                }
                ((cb3) f84Var).f = 0;
                return this.b.c(f84Var);
        }
    }

    @Override
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                e84 e84Var = this.d;
                if (e84Var != null) {
                    e84Var.d(j, j2);
                    return;
                } else {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                    return;
                }
            default:
                e84 e84Var2 = this.d;
                if (e84Var2 != null) {
                    e84Var2.d(j, j2);
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
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        byte b = this.a;
        lma lmaVar = this.b;
        e84 e84Var = this.f;
        switch (b) {
            case 0:
                this.c = g84Var;
                if (((wf5) e84Var) == null) {
                    this.d = lmaVar;
                    lmaVar.f(g84Var);
                    return;
                }
                return;
            default:
                this.c = g84Var;
                if (((pw5) e84Var) == null) {
                    this.d = lmaVar;
                    lmaVar.f(g84Var);
                    return;
                }
                return;
        }
    }

    @Override
    public final void release() {
        byte b = this.a;
        e84 e84Var = this.f;
        switch (b) {
            case 0:
                wf5 wf5Var = (wf5) e84Var;
                if (wf5Var != null) {
                    wf5Var.release();
                    return;
                }
                return;
            default:
                pw5 pw5Var = (pw5) e84Var;
                if (pw5Var != null) {
                    pw5Var.release();
                    return;
                }
                return;
        }
    }
}
