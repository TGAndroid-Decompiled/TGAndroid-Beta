package eh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import dh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class a implements d, e6 {
    public final int f8915a;
    public final e6 f8916b;

    public a(int i10, e6 e6Var) {
        this.f8915a = i10;
        this.f8916b = e6Var;
    }

    @Override
    public Paint F(String str) {
        return i6.T0(str);
    }

    @Override
    public boolean a() {
        return i6.I.q();
    }

    @Override
    public int a1(int i10) {
        return x0(i10);
    }

    @Override
    public int c0(int i10) {
        return x0(i10);
    }

    @Override
    public int g(e6 e6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f8915a) {
            case 0:
                if (!b.c(UserConfig.selectedAccount, this.f8916b)) {
                    return i0.a.k(i6.w0(i6.Sd, e6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return i6.m1(f7, i6.w0(i6.Sd, e6Var));
            case 1:
                if (!b.c(UserConfig.selectedAccount, this.f8916b)) {
                    if (z10) {
                        i10 = i6.f21079s8;
                    } else {
                        i10 = i6.f20790ce;
                    }
                    return i0.a.k(i6.w0(i10, e6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return i6.m1(f10, i6.w0(i6.f20790ce, e6Var));
            default:
                if (!b.c(UserConfig.selectedAccount, this.f8916b)) {
                    if (z10) {
                        i11 = i6.f21079s8;
                    } else {
                        i11 = i6.f20790ce;
                    }
                    return i0.a.k(i6.w0(i11, e6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return i6.m1(f11, i6.w0(i6.f20790ce, e6Var));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public boolean k0() {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        i6.q(f7, f10, i10, i11);
    }

    @Override
    public ColorFilter x() {
        return i6.f21129v3;
    }

    @Override
    public int x0(int i10) {
        if (i10 == i6.G8) {
            return -14145495;
        }
        if (i10 != i6.E8) {
            if (i10 == i6.f20872h5) {
                return -14737633;
            }
            if (i10 == i6.f20909j5) {
                return -592138;
            }
            if (i10 == i6.f21058r5) {
                return -8553091;
            }
            if (i10 != i6.He) {
                if (i10 == i6.Ke) {
                    return -1610612736;
                }
                if (i10 == i6.Ne || i10 == i6.Re || i10 == i6.Me) {
                    return -9539985;
                }
                if (i10 != i6.G6) {
                    int i11 = i6.Mh;
                    if (i10 == i11) {
                        return -11754001;
                    }
                    if (i10 == i6.f20892i6) {
                        return 536870911;
                    }
                    if (i10 != i6.Fh && i10 != i6.Eh && i10 != i6.Gh) {
                        if (i10 == i6.Hh) {
                            return 352321535;
                        }
                        if (i10 != i6.Je && i10 != i11) {
                            if (i10 == i6.Ie) {
                                return 780633991;
                            }
                            if (i10 == i6.f20745a7) {
                                return -15921907;
                            }
                            if (i10 == i6.f20967m7) {
                                return -12500671;
                            }
                            if (i10 == i6.f20948l7) {
                                return -13133079;
                            }
                            if (i10 == i6.f20987n7) {
                                return -1;
                            }
                            if (i10 == i6.f20801d6) {
                                return -15198183;
                            }
                            if (i10 == i6.f20802d7) {
                                return -16777216;
                            }
                            e6 e6Var = this.f8916b;
                            if (e6Var != null) {
                                return e6Var.x0(i10);
                            }
                            return i6.x0(null, i10, false);
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
    public void I0(int i10, int i11) {
    }
}
