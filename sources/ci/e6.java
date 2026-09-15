package ci;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
public final class e6 implements org.telegram.ui.ActionBar.e6 {
    public PorterDuffColorFilter f4594a;
    public final org.telegram.ui.ActionBar.e6 f4595b;

    public e6(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f4595b = e6Var;
    }

    @Override
    public final Paint G(String str) {
        return this.f4595b.G(str);
    }

    @Override
    public final int G0(int i10) {
        if (i10 == org.telegram.ui.ActionBar.i6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.f18907h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.f18943j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.f19091r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.Ne || i10 == org.telegram.ui.ActionBar.i6.Re || i10 == org.telegram.ui.ActionBar.i6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.i6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.f18926i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.Fh || i10 == org.telegram.ui.ActionBar.i6.Eh || i10 == org.telegram.ui.ActionBar.i6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.i6.Hh) {
            return 352321535;
        }
        if (i10 != org.telegram.ui.ActionBar.i6.Je && i10 != i11) {
            if (i10 == org.telegram.ui.ActionBar.i6.Ie) {
                return 780633991;
            }
            if (i10 == org.telegram.ui.ActionBar.i6.f18780a7) {
                return -15921907;
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.f4595b;
            if (e6Var != null) {
                return e6Var.G0(i10);
            }
            return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        }
        return -7895161;
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.i6.I.q();
    }

    @Override
    public final int g0(int i10) {
        return G0(i10);
    }

    @Override
    public final int g1(int i10) {
        return G0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        if (this.f4594a == null) {
            this.f4594a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.f4594a;
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
