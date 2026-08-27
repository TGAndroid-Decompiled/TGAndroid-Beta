package ng;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class b implements mg.c, c6 {

    public final int f18522a;

    public final c6 f18523b;

    public b(int i10, c6 c6Var) {
        this.f18522a = i10;
        this.f18523b = c6Var;
    }

    @Override
    public ColorFilter F() {
        return g6.f23371v3;
    }

    @Override
    public Paint N(String str) {
        return g6.S0(str);
    }

    @Override
    public int N0(int i10) {
        if (i10 == g6.G8) {
            return -14145495;
        }
        if (i10 == g6.E8) {
            return -1;
        }
        if (i10 == g6.f23124h5) {
            return -14737633;
        }
        if (i10 == g6.f23161j5) {
            return -592138;
        }
        if (i10 == g6.f23300r5) {
            return -8553091;
        }
        if (i10 == g6.He) {
            return -16777216;
        }
        if (i10 == g6.Ke) {
            return -1610612736;
        }
        if (i10 == g6.Ne || i10 == g6.Re || i10 == g6.Me) {
            return -9539985;
        }
        if (i10 == g6.G6) {
            return -1;
        }
        int i11 = g6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == g6.f23144i6) {
            return 536870911;
        }
        if (i10 == g6.Fh || i10 == g6.Eh || i10 == g6.Gh) {
            return -1;
        }
        if (i10 == g6.Hh) {
            return 352321535;
        }
        if (i10 == g6.Je || i10 == i11) {
            return -7895161;
        }
        if (i10 == g6.Ie) {
            return 780633991;
        }
        if (i10 == g6.f22999a7) {
            return -15921907;
        }
        if (i10 == g6.f23216m7) {
            return -12500671;
        }
        if (i10 == g6.f23199l7) {
            return -13133079;
        }
        if (i10 == g6.f23235n7) {
            return -1;
        }
        if (i10 == g6.f23053d6) {
            return -15198183;
        }
        if (i10 == g6.f23054d7) {
            return -16777216;
        }
        c6 c6Var = this.f18523b;
        return c6Var != null ? c6Var.N0(i10) : g6.w0(null, i10, false);
    }

    @Override
    public boolean a() {
        return g6.I.q();
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public int i(c6 c6Var, boolean z10) {
        switch (this.f18522a) {
            case 0:
                if (c.c(UserConfig.selectedAccount, this.f18523b)) {
                    return g6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.v0(g6.Sd, c6Var));
                }
                return i0.b.k(g6.v0(g6.Sd, c6Var), 255);
            case 1:
                if (c.c(UserConfig.selectedAccount, this.f18523b)) {
                    return g6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.v0(g6.f23043ce, c6Var));
                }
                return i0.b.k(g6.v0(z10 ? g6.f23322s8 : g6.f23043ce, c6Var), 255);
            default:
                if (c.c(UserConfig.selectedAccount, this.f18523b)) {
                    return g6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, g6.v0(g6.f23043ce, c6Var));
                }
                return i0.b.k(g6.v0(z10 ? g6.f23322s8 : g6.f23043ce, c6Var), 255);
        }
    }

    @Override
    public void m(float f10, float f11, int i10, int i11) {
        g6.q(f10, f11, i10, i11);
    }

    @Override
    public int o1(int i10) {
        return N0(i10);
    }

    @Override
    public int q0(int i10) {
        return N0(i10);
    }

    @Override
    public boolean u0() {
        return false;
    }

    @Override
    public void c1(int i10, int i11) {
    }
}
