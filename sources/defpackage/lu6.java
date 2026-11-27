package defpackage;

import android.widget.SeekBar;
import j$.util.DesugarCollections;
public final class lu6 extends ew6 {
    public final byte a;
    public final ep b;

    public lu6(ep epVar, byte b) {
        this.a = b;
        this.b = epVar;
    }

    @Override
    public final void d(jw6 jw6Var) {
        byte b = this.a;
        ep epVar = this.b;
        switch (b) {
            case 0:
                ((ou6) epVar).f();
                return;
            case 1:
            default:
                return;
            case 2:
                ((lv6) epVar).e();
                return;
            case 3:
                ((wv6) epVar).n();
                return;
        }
    }

    @Override
    public final void e(jw6 jw6Var) {
        v34 b;
        yv6 yv6Var;
        byte b2 = this.a;
        ep epVar = this.b;
        switch (b2) {
            case 0:
                ((ou6) epVar).f();
                return;
            case 1:
                ((bv6) epVar).q(true);
                return;
            case 2:
                ((lv6) epVar).e();
                return;
            default:
                wv6 wv6Var = (wv6) epVar;
                if (jw6Var == wv6Var.r && jw6.a() != null) {
                    iw6 iw6Var = jw6Var.a;
                    lw6.b();
                    for (jw6 jw6Var2 : DesugarCollections.unmodifiableList(iw6Var.b)) {
                        if (!DesugarCollections.unmodifiableList(wv6Var.r.v).contains(jw6Var2) && (b = wv6Var.r.b(jw6Var2)) != null && (yv6Var = (yv6) b.b) != null && yv6Var.d && !wv6Var.w.contains(jw6Var2)) {
                            wv6Var.o();
                            wv6Var.l();
                            return;
                        }
                    }
                }
                wv6Var.n();
                return;
        }
    }

    @Override
    public final void f(jw6 jw6Var) {
        byte b = this.a;
        ep epVar = this.b;
        switch (b) {
            case 0:
                ((ou6) epVar).f();
                return;
            case 1:
            default:
                return;
            case 2:
                ((lv6) epVar).e();
                return;
            case 3:
                ((wv6) epVar).n();
                return;
        }
    }

    @Override
    public final void g(jw6 jw6Var) {
        byte b = this.a;
        ep epVar = this.b;
        switch (b) {
            case 0:
                ((ou6) epVar).dismiss();
                return;
            case 1:
            default:
                return;
            case 2:
                ((lv6) epVar).dismiss();
                return;
            case 3:
                wv6 wv6Var = (wv6) epVar;
                wv6Var.r = jw6Var;
                wv6Var.o();
                wv6Var.l();
                return;
        }
    }

    @Override
    public final void i() {
        byte b = this.a;
        ep epVar = this.b;
        switch (b) {
            case 1:
                ((bv6) epVar).q(false);
                return;
            case 2:
            default:
                return;
            case 3:
                ((wv6) epVar).n();
                return;
        }
    }

    @Override
    public final void k(jw6 jw6Var) {
        ov6 ov6Var;
        boolean z;
        byte b = this.a;
        ep epVar = this.b;
        switch (b) {
            case 1:
                bv6 bv6Var = (bv6) epVar;
                SeekBar seekBar = (SeekBar) bv6Var.i0.get(jw6Var);
                int i = jw6Var.p;
                short s = bv6.G0;
                if (seekBar != null && bv6Var.d0 != jw6Var) {
                    seekBar.setProgress(i);
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                int i2 = wv6.k0;
                wv6 wv6Var = (wv6) epVar;
                if (wv6Var.N != jw6Var && (ov6Var = (ov6) wv6Var.M.get(jw6Var.c)) != null) {
                    int i3 = ov6Var.v.p;
                    if (i3 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ov6Var.u(z);
                    ov6Var.x.setProgress(i3);
                    return;
                }
                return;
        }
    }
}
