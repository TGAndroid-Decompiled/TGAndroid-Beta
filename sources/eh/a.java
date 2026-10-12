package eh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import dh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public final class a implements d, c6 {
    public final int f8912a;
    public final c6 f8913b;

    public a(int i10, c6 c6Var) {
        this.f8912a = i10;
        this.f8913b = c6Var;
    }

    @Override
    public Paint G(String str) {
        return h6.T0(str);
    }

    @Override
    public boolean a() {
        return h6.I.q();
    }

    @Override
    public int d0(int i10) {
        return x0(i10);
    }

    @Override
    public int f1(int i10) {
        return x0(i10);
    }

    @Override
    public int g(c6 c6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f8912a) {
            case 0:
                if (!b.c(UserConfig.selectedAccount, this.f8913b)) {
                    return i0.a.k(h6.w0(h6.Sd, c6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return h6.m1(f7, h6.w0(h6.Sd, c6Var));
            case 1:
                if (!b.c(UserConfig.selectedAccount, this.f8913b)) {
                    if (z10) {
                        i10 = h6.f20840s8;
                    } else {
                        i10 = h6.f20549ce;
                    }
                    return i0.a.k(h6.w0(i10, c6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return h6.m1(f10, h6.w0(h6.f20549ce, c6Var));
            default:
                if (!b.c(UserConfig.selectedAccount, this.f8913b)) {
                    if (z10) {
                        i11 = h6.f20840s8;
                    } else {
                        i11 = h6.f20549ce;
                    }
                    return i0.a.k(h6.w0(i11, c6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return h6.m1(f11, h6.w0(h6.f20549ce, c6Var));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        h6.q(f7, f10, i10, i11);
    }

    @Override
    public ColorFilter x() {
        return h6.f20890v3;
    }

    @Override
    public int x0(int i10) {
        if (i10 == h6.G8) {
            return -14145495;
        }
        if (i10 != h6.E8) {
            if (i10 == h6.f20631h5) {
                return -14737633;
            }
            if (i10 == h6.f20668j5) {
                return -592138;
            }
            if (i10 == h6.f20818r5) {
                return -8553091;
            }
            if (i10 != h6.He) {
                if (i10 == h6.Ke) {
                    return -1610612736;
                }
                if (i10 == h6.Ne || i10 == h6.Re || i10 == h6.Me) {
                    return -9539985;
                }
                if (i10 != h6.G6) {
                    int i11 = h6.Mh;
                    if (i10 == i11) {
                        return -11754001;
                    }
                    if (i10 == h6.f20651i6) {
                        return 536870911;
                    }
                    if (i10 != h6.Fh && i10 != h6.Eh && i10 != h6.Gh) {
                        if (i10 == h6.Hh) {
                            return 352321535;
                        }
                        if (i10 != h6.Je && i10 != i11) {
                            if (i10 == h6.Ie) {
                                return 780633991;
                            }
                            if (i10 == h6.f20504a7) {
                                return -15921907;
                            }
                            if (i10 == h6.f20726m7) {
                                return -12500671;
                            }
                            if (i10 == h6.f20707l7) {
                                return -13133079;
                            }
                            if (i10 == h6.f20746n7) {
                                return -1;
                            }
                            if (i10 == h6.f20560d6) {
                                return -15198183;
                            }
                            if (i10 == h6.f20561d7) {
                                return -16777216;
                            }
                            c6 c6Var = this.f8913b;
                            if (c6Var != null) {
                                return c6Var.x0(i10);
                            }
                            return h6.x0(null, i10, false);
                        }
                        return -7895161;
                    }
                    return -1;
                }
                return -1;
            }
            return -16777216;
        }
        return -1;
    }

    @Override
    public void J0(int i10, int i11) {
    }
}
