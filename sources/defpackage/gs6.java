package defpackage;

import android.widget.SeekBar;
import j$.util.DesugarCollections;
public final class gs6 extends zt6 {
    public final byte a;
    public final dp b;

    public gs6(dp dpVar, byte b) {
        this.a = b;
        this.b = dpVar;
    }

    @Override
    public final void d(eu6 eu6Var) {
        byte b = this.a;
        dp dpVar = this.b;
        switch (b) {
            case 0:
                ((js6) dpVar).f();
                return;
            case 1:
            default:
                return;
            case 2:
                ((gt6) dpVar).e();
                return;
            case 3:
                ((rt6) dpVar).n();
                return;
        }
    }

    @Override
    public final void e(eu6 eu6Var) {
        pj4 b;
        tt6 tt6Var;
        byte b2 = this.a;
        dp dpVar = this.b;
        switch (b2) {
            case 0:
                ((js6) dpVar).f();
                return;
            case 1:
                ((ws6) dpVar).q(true);
                return;
            case 2:
                ((gt6) dpVar).e();
                return;
            default:
                rt6 rt6Var = (rt6) dpVar;
                if (eu6Var == rt6Var.r && eu6.a() != null) {
                    du6 du6Var = eu6Var.a;
                    gu6.b();
                    for (eu6 eu6Var2 : DesugarCollections.unmodifiableList(du6Var.b)) {
                        if (!DesugarCollections.unmodifiableList(rt6Var.r.v).contains(eu6Var2) && (b = rt6Var.r.b(eu6Var2)) != null && (tt6Var = (tt6) b.b) != null && tt6Var.d && !rt6Var.w.contains(eu6Var2)) {
                            rt6Var.o();
                            rt6Var.l();
                            return;
                        }
                    }
                }
                rt6Var.n();
                return;
        }
    }

    @Override
    public final void f(eu6 eu6Var) {
        byte b = this.a;
        dp dpVar = this.b;
        switch (b) {
            case 0:
                ((js6) dpVar).f();
                return;
            case 1:
            default:
                return;
            case 2:
                ((gt6) dpVar).e();
                return;
            case 3:
                ((rt6) dpVar).n();
                return;
        }
    }

    @Override
    public final void g(eu6 eu6Var) {
        byte b = this.a;
        dp dpVar = this.b;
        switch (b) {
            case 0:
                ((js6) dpVar).dismiss();
                return;
            case 1:
            default:
                return;
            case 2:
                ((gt6) dpVar).dismiss();
                return;
            case 3:
                rt6 rt6Var = (rt6) dpVar;
                rt6Var.r = eu6Var;
                rt6Var.o();
                rt6Var.l();
                return;
        }
    }

    @Override
    public final void i() {
        byte b = this.a;
        dp dpVar = this.b;
        switch (b) {
            case 1:
                ((ws6) dpVar).q(false);
                return;
            case 2:
            default:
                return;
            case 3:
                ((rt6) dpVar).n();
                return;
        }
    }

    @Override
    public final void k(eu6 eu6Var) {
        jt6 jt6Var;
        boolean z;
        byte b = this.a;
        dp dpVar = this.b;
        switch (b) {
            case 1:
                ws6 ws6Var = (ws6) dpVar;
                SeekBar seekBar = (SeekBar) ws6Var.i0.get(eu6Var);
                int i = eu6Var.p;
                short s = ws6.G0;
                if (seekBar != null && ws6Var.d0 != eu6Var) {
                    seekBar.setProgress(i);
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                int i2 = rt6.k0;
                rt6 rt6Var = (rt6) dpVar;
                if (rt6Var.N != eu6Var && (jt6Var = (jt6) rt6Var.M.get(eu6Var.c)) != null) {
                    int i3 = jt6Var.v.p;
                    if (i3 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jt6Var.u(z);
                    jt6Var.x.setProgress(i3);
                    return;
                }
                return;
        }
    }
}
