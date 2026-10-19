package ei;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
public final class t5 implements org.telegram.ui.ActionBar.d6 {
    public PorterDuffColorFilter f9849a;
    public final org.telegram.ui.ActionBar.d6 f9850b;

    public t5(org.telegram.ui.ActionBar.d6 d6Var) {
        this.f9850b = d6Var;
    }

    @Override
    public final int G(int i10) {
        return w(i10);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override
    public final void d(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public final Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public final ColorFilter j() {
        if (this.f9849a == null) {
            this.f9849a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.f9849a;
    }

    @Override
    public final Paint n(String str) {
        return this.f9850b.n(str);
    }

    @Override
    public final int r(int i10) {
        return w(i10);
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final int w(int i10) {
        if (i10 == org.telegram.ui.ActionBar.h6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.h6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.h6.f21058h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.h6.f21093j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.h6.f21243r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.h6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.h6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.h6.Ne || i10 == org.telegram.ui.ActionBar.h6.Re || i10 == org.telegram.ui.ActionBar.h6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.h6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.h6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.h6.f21076i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.h6.Fh || i10 == org.telegram.ui.ActionBar.h6.Eh || i10 == org.telegram.ui.ActionBar.h6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.h6.Hh) {
            return 352321535;
        }
        if (i10 != org.telegram.ui.ActionBar.h6.Je && i10 != i11) {
            if (i10 == org.telegram.ui.ActionBar.h6.Ie) {
                return 780633991;
            }
            if (i10 == org.telegram.ui.ActionBar.h6.f20929a7) {
                return -15921907;
            }
            org.telegram.ui.ActionBar.d6 d6Var = this.f9850b;
            if (d6Var != null) {
                return d6Var.w(i10);
            }
            return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        return -7895161;
    }

    @Override
    public final void B(int i10, int i11) {
    }
}
