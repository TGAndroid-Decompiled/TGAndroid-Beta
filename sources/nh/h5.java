package nh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
public final class h5 implements org.telegram.ui.ActionBar.c6 {
    public PorterDuffColorFilter f17842a;
    public final org.telegram.ui.ActionBar.c6 f17843b;

    public h5(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f17843b = c6Var;
    }

    @Override
    public final ColorFilter B() {
        if (this.f17842a == null) {
            this.f17842a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.f17842a;
    }

    @Override
    public final int C0(int i10) {
        if (i10 == org.telegram.ui.ActionBar.g6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.f23133h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.f23169j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.f23310r5) {
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
        if (i10 == org.telegram.ui.ActionBar.g6.f23152i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Fh || i10 == org.telegram.ui.ActionBar.g6.Eh || i10 == org.telegram.ui.ActionBar.g6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.g6.Hh) {
            return 352321535;
        }
        if (i10 != org.telegram.ui.ActionBar.g6.Je && i10 != i11) {
            if (i10 == org.telegram.ui.ActionBar.g6.Ie) {
                return 780633991;
            }
            if (i10 == org.telegram.ui.ActionBar.g6.f23009a7) {
                return -15921907;
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.f17843b;
            if (c6Var != null) {
                return c6Var.C0(i10);
            }
            return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        }
        return -7895161;
    }

    @Override
    public final Paint G(String str) {
        return this.f17843b.G(str);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override
    public final int g1(int i10) {
        return C0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public final int h0(int i10) {
        return C0(i10);
    }

    @Override
    public final void l(float f9, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f9, f10, i10, i11);
    }

    @Override
    public final boolean l0() {
        return false;
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
