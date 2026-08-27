package lh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

public final class t5 implements org.telegram.ui.ActionBar.c6 {

    public PorterDuffColorFilter f16851a;

    public final org.telegram.ui.ActionBar.c6 f16852b;

    public t5(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f16852b = c6Var;
    }

    @Override
    public final ColorFilter F() {
        if (this.f16851a == null) {
            this.f16851a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.f16851a;
    }

    @Override
    public final Paint N(String str) {
        return this.f16852b.N(str);
    }

    @Override
    public final int N0(int i10) {
        if (i10 == org.telegram.ui.ActionBar.g6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.f23124h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.f23161j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.f23300r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Ne || i10 == org.telegram.ui.ActionBar.g6.Re || i10 == org.telegram.ui.ActionBar.g6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.g6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.f23144i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Fh || i10 == org.telegram.ui.ActionBar.g6.Eh || i10 == org.telegram.ui.ActionBar.g6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Hh) {
            return 352321535;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Je || i10 == i11) {
            return -7895161;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Ie) {
            return 780633991;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.f22999a7) {
            return -15921907;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f16852b;
        return c6Var != null ? c6Var.N0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override
    public final Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public final void m(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
    }

    @Override
    public final int o1(int i10) {
        return N0(i10);
    }

    @Override
    public final int q0(int i10) {
        return N0(i10);
    }

    @Override
    public final boolean u0() {
        return false;
    }

    @Override
    public final void c1(int i10, int i11) {
    }
}
