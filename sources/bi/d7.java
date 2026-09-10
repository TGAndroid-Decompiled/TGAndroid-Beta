package bi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
public final class d7 implements org.telegram.ui.ActionBar.f6 {
    public PorterDuffColorFilter f2549a;
    public final org.telegram.ui.ActionBar.f6 f2550b;

    public d7(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f2550b = f6Var;
    }

    @Override
    public final Paint F(String str) {
        return this.f2550b.F(str);
    }

    @Override
    public final int F0(int i10) {
        if (i10 == org.telegram.ui.ActionBar.j6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.f17998h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.f18034j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.f18179r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Ne || i10 == org.telegram.ui.ActionBar.j6.Re || i10 == org.telegram.ui.ActionBar.j6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.j6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.f18017i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Fh || i10 == org.telegram.ui.ActionBar.j6.Eh || i10 == org.telegram.ui.ActionBar.j6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Hh) {
            return 352321535;
        }
        if (i10 != org.telegram.ui.ActionBar.j6.Je && i10 != i11) {
            if (i10 == org.telegram.ui.ActionBar.j6.Ie) {
                return 780633991;
            }
            if (i10 == org.telegram.ui.ActionBar.j6.f17872a7) {
                return -15921907;
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.f2550b;
            if (f6Var != null) {
                return f6Var.F0(i10);
            }
            return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        return -7895161;
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public final int e0(int i10) {
        return F0(i10);
    }

    @Override
    public final int f1(int i10) {
        return F0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public final void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean m0() {
        return false;
    }

    @Override
    public final ColorFilter w() {
        if (this.f2549a == null) {
            this.f2549a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.f2549a;
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
