package fh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import eh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class a implements d, c6 {
    public final int f9154a;
    public final c6 f9155b;

    public a(int i10, c6 c6Var) {
        this.f9154a = i10;
        this.f9155b = c6Var;
    }

    @Override
    public int E0(int i10) {
        if (i10 == g6.G8) {
            return -14145495;
        }
        if (i10 != g6.E8) {
            if (i10 == g6.f19672h5) {
                return -14737633;
            }
            if (i10 == g6.f19707j5) {
                return -592138;
            }
            if (i10 == g6.f19857r5) {
                return -8553091;
            }
            if (i10 != g6.He) {
                if (i10 == g6.Ke) {
                    return -1610612736;
                }
                if (i10 == g6.Ne || i10 == g6.Re || i10 == g6.Me) {
                    return -9539985;
                }
                if (i10 != g6.G6) {
                    int i11 = g6.Mh;
                    if (i10 == i11) {
                        return -11754001;
                    }
                    if (i10 == g6.f19690i6) {
                        return 536870911;
                    }
                    if (i10 != g6.Fh && i10 != g6.Eh && i10 != g6.Gh) {
                        if (i10 == g6.Hh) {
                            return 352321535;
                        }
                        if (i10 != g6.Je && i10 != i11) {
                            if (i10 == g6.Ie) {
                                return 780633991;
                            }
                            if (i10 == g6.f19543a7) {
                                return -15921907;
                            }
                            if (i10 == g6.f19765m7) {
                                return -12500671;
                            }
                            if (i10 == g6.f19746l7) {
                                return -13133079;
                            }
                            if (i10 == g6.f19785n7) {
                                return -1;
                            }
                            if (i10 == g6.f19601d6) {
                                return -15198183;
                            }
                            if (i10 == g6.f19602d7) {
                                return -16777216;
                            }
                            c6 c6Var = this.f9155b;
                            if (c6Var != null) {
                                return c6Var.E0(i10);
                            }
                            return g6.x0(null, i10, false);
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
    public Paint F(String str) {
        return g6.T0(str);
    }

    @Override
    public boolean a() {
        return g6.I.q();
    }

    @Override
    public int b0(int i10) {
        return E0(i10);
    }

    @Override
    public int f(c6 c6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f9154a) {
            case 0:
                if (!b.c(UserConfig.selectedAccount, this.f9155b)) {
                    return i0.a.k(g6.w0(g6.Sd, c6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return g6.m1(f7, g6.w0(g6.Sd, c6Var));
            case 1:
                if (!b.c(UserConfig.selectedAccount, this.f9155b)) {
                    if (z10) {
                        i10 = g6.f19880s8;
                    } else {
                        i10 = g6.f19590ce;
                    }
                    return i0.a.k(g6.w0(i10, c6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return g6.m1(f10, g6.w0(g6.f19590ce, c6Var));
            default:
                if (!b.c(UserConfig.selectedAccount, this.f9155b)) {
                    if (z10) {
                        i11 = g6.f19880s8;
                    } else {
                        i11 = g6.f19590ce;
                    }
                    return i0.a.k(g6.w0(i11, c6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return g6.m1(f11, g6.w0(g6.f19590ce, c6Var));
        }
    }

    @Override
    public int f1(int i10) {
        return E0(i10);
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        g6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public ColorFilter w() {
        return g6.f19930v3;
    }

    @Override
    public void M0(int i10, int i11) {
    }
}
