package kh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
public final class u5 implements org.telegram.ui.ActionBar.b6 {
    public PorterDuffColorFilter f16144a;
    public final org.telegram.ui.ActionBar.b6 f16145b;

    public u5(org.telegram.ui.ActionBar.b6 b6Var) {
        this.f16145b = b6Var;
    }

    @Override
    public final ColorFilter H() {
        if (this.f16144a == null) {
            this.f16144a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.f16144a;
    }

    @Override
    public final int N0(int i9) {
        if (i9 == org.telegram.ui.ActionBar.f6.G8) {
            return -14145495;
        }
        if (i9 == org.telegram.ui.ActionBar.f6.E8) {
            return -1;
        }
        if (i9 == org.telegram.ui.ActionBar.f6.f23072h5) {
            return -14737633;
        }
        if (i9 == org.telegram.ui.ActionBar.f6.f23108j5) {
            return -592138;
        }
        if (i9 == org.telegram.ui.ActionBar.f6.f23247r5) {
            return -8553091;
        }
        if (i9 == org.telegram.ui.ActionBar.f6.He) {
            return -16777216;
        }
        if (i9 == org.telegram.ui.ActionBar.f6.Ke) {
            return -1610612736;
        }
        if (i9 == org.telegram.ui.ActionBar.f6.Ne || i9 == org.telegram.ui.ActionBar.f6.Re || i9 == org.telegram.ui.ActionBar.f6.Me) {
            return -9539985;
        }
        if (i9 == org.telegram.ui.ActionBar.f6.G6) {
            return -1;
        }
        int i10 = org.telegram.ui.ActionBar.f6.Mh;
        if (i9 == i10) {
            return -11754001;
        }
        if (i9 == org.telegram.ui.ActionBar.f6.f23092i6) {
            return 536870911;
        }
        if (i9 == org.telegram.ui.ActionBar.f6.Fh || i9 == org.telegram.ui.ActionBar.f6.Eh || i9 == org.telegram.ui.ActionBar.f6.Gh) {
            return -1;
        }
        if (i9 == org.telegram.ui.ActionBar.f6.Hh) {
            return 352321535;
        }
        if (i9 != org.telegram.ui.ActionBar.f6.Je && i9 != i10) {
            if (i9 == org.telegram.ui.ActionBar.f6.Ie) {
                return 780633991;
            }
            if (i9 == org.telegram.ui.ActionBar.f6.f22947a7) {
                return -15921907;
            }
            org.telegram.ui.ActionBar.b6 b6Var = this.f16145b;
            if (b6Var != null) {
                return b6Var.N0(i9);
            }
            return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        }
        return -7895161;
    }

    @Override
    public final Paint O(String str) {
        return this.f16145b.O(str);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.f6.I.q();
    }

    @Override
    public final Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public final void o(float f10, float f11, int i9, int i10) {
        org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
    }

    @Override
    public final int p0(int i9) {
        return N0(i9);
    }

    @Override
    public final int q1(int i9) {
        return N0(i9);
    }

    @Override
    public final boolean t0() {
        return false;
    }

    @Override
    public final void c1(int i9, int i10) {
    }
}
