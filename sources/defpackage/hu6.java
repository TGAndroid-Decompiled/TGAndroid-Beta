package defpackage;

import android.widget.SeekBar;
import j$.util.DesugarCollections;
public final class hu6 extends zv6 {
    public final byte a;
    public final dq b;

    public hu6(dq dqVar, byte b) {
        this.a = b;
        this.b = dqVar;
    }

    @Override
    public final void d(ew6 ew6Var) {
        byte b = this.a;
        dq dqVar = this.b;
        switch (b) {
            case 0:
                ((ku6) dqVar).f();
                return;
            case 1:
            default:
                return;
            case 2:
                ((gv6) dqVar).e();
                return;
            case 3:
                ((rv6) dqVar).n();
                return;
        }
    }

    @Override
    public final void e(ew6 ew6Var) {
        k44 b;
        tv6 tv6Var;
        byte b2 = this.a;
        dq dqVar = this.b;
        switch (b2) {
            case 0:
                ((ku6) dqVar).f();
                return;
            case 1:
                ((wu6) dqVar).q(true);
                return;
            case 2:
                ((gv6) dqVar).e();
                return;
            default:
                rv6 rv6Var = (rv6) dqVar;
                if (ew6Var == rv6Var.r && ew6.a() != null) {
                    dw6 dw6Var = ew6Var.a;
                    gw6.b();
                    for (ew6 ew6Var2 : DesugarCollections.unmodifiableList(dw6Var.b)) {
                        if (!DesugarCollections.unmodifiableList(rv6Var.r.v).contains(ew6Var2) && (b = rv6Var.r.b(ew6Var2)) != null && (tv6Var = (tv6) b.b) != null && tv6Var.d && !rv6Var.w.contains(ew6Var2)) {
                            rv6Var.o();
                            rv6Var.l();
                            return;
                        }
                    }
                }
                rv6Var.n();
                return;
        }
    }

    @Override
    public final void f(ew6 ew6Var) {
        byte b = this.a;
        dq dqVar = this.b;
        switch (b) {
            case 0:
                ((ku6) dqVar).f();
                return;
            case 1:
            default:
                return;
            case 2:
                ((gv6) dqVar).e();
                return;
            case 3:
                ((rv6) dqVar).n();
                return;
        }
    }

    @Override
    public final void g(ew6 ew6Var) {
        byte b = this.a;
        dq dqVar = this.b;
        switch (b) {
            case 0:
                ((ku6) dqVar).dismiss();
                return;
            case 1:
            default:
                return;
            case 2:
                ((gv6) dqVar).dismiss();
                return;
            case 3:
                rv6 rv6Var = (rv6) dqVar;
                rv6Var.r = ew6Var;
                rv6Var.o();
                rv6Var.l();
                return;
        }
    }

    @Override
    public final void i() {
        byte b = this.a;
        dq dqVar = this.b;
        switch (b) {
            case 1:
                ((wu6) dqVar).q(false);
                return;
            case 2:
            default:
                return;
            case 3:
                ((rv6) dqVar).n();
                return;
        }
    }

    @Override
    public final void k(ew6 ew6Var) {
        jv6 jv6Var;
        boolean z;
        byte b = this.a;
        dq dqVar = this.b;
        switch (b) {
            case 1:
                wu6 wu6Var = (wu6) dqVar;
                SeekBar seekBar = (SeekBar) wu6Var.i0.get(ew6Var);
                int i = ew6Var.p;
                short s = wu6.G0;
                if (seekBar != null && wu6Var.d0 != ew6Var) {
                    seekBar.setProgress(i);
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                int i2 = rv6.k0;
                rv6 rv6Var = (rv6) dqVar;
                if (rv6Var.N != ew6Var && (jv6Var = (jv6) rv6Var.M.get(ew6Var.c)) != null) {
                    int i3 = jv6Var.v.p;
                    if (i3 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jv6Var.u(z);
                    jv6Var.x.setProgress(i3);
                    return;
                }
                return;
        }
    }
}
