package fi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
public final class s5 implements org.telegram.ui.ActionBar.u6 {
    public PorterDuffColorFilter f11585a;
    public final org.telegram.ui.ActionBar.u6 f11586b;

    public s5(org.telegram.ui.ActionBar.u6 u6Var) {
        this.f11586b = u6Var;
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.y6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        if (this.f11585a == null) {
            this.f11585a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.f11585a;
    }

    @Override
    public final Paint d(String str) {
        return this.f11586b.d(str);
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
        if (i10 == org.telegram.ui.ActionBar.y6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.f23428h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.f23465j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.f23615r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.Ne || i10 == org.telegram.ui.ActionBar.y6.Re || i10 == org.telegram.ui.ActionBar.y6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.y6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.f23449i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.Fh || i10 == org.telegram.ui.ActionBar.y6.Eh || i10 == org.telegram.ui.ActionBar.y6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.y6.Hh) {
            return 352321535;
        }
        if (i10 != org.telegram.ui.ActionBar.y6.Je && i10 != i11) {
            if (i10 == org.telegram.ui.ActionBar.y6.Ie) {
                return 780633991;
            }
            if (i10 == org.telegram.ui.ActionBar.y6.f23300a7) {
                return -15921907;
            }
            org.telegram.ui.ActionBar.u6 u6Var = this.f11586b;
            if (u6Var != null) {
                return u6Var.g(i10);
            }
            return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
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
