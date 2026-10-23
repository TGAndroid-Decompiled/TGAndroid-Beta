package ei;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
public final class t5 implements org.telegram.ui.ActionBar.g6 {
    public PorterDuffColorFilter f9865a;
    public final org.telegram.ui.ActionBar.g6 f9866b;

    public t5(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f9866b = g6Var;
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        if (this.f9865a == null) {
            this.f9865a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.f9865a;
    }

    @Override
    public final Paint d(String str) {
        return this.f9866b.d(str);
    }

    @Override
    public final int e(int i10) {
        return g(i10);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final int g(int i10) {
        if (i10 == org.telegram.ui.ActionBar.k6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.f21254h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.f21289j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.f21439r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Ne || i10 == org.telegram.ui.ActionBar.k6.Re || i10 == org.telegram.ui.ActionBar.k6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.k6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.f21272i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Fh || i10 == org.telegram.ui.ActionBar.k6.Eh || i10 == org.telegram.ui.ActionBar.k6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Hh) {
            return 352321535;
        }
        if (i10 != org.telegram.ui.ActionBar.k6.Je && i10 != i11) {
            if (i10 == org.telegram.ui.ActionBar.k6.Ie) {
                return 780633991;
            }
            if (i10 == org.telegram.ui.ActionBar.k6.f21125a7) {
                return -15921907;
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.f9866b;
            if (g6Var != null) {
                return g6Var.g(i10);
            }
            return org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        return -7895161;
    }

    @Override
    public final Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public final int i(int i10) {
        return g(i10);
    }

    @Override
    public final void h(int i10, int i11) {
    }
}
