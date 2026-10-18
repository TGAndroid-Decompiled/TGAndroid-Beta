package fh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import eh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class a implements d, d6 {
    public final int f10595a;
    public final d6 f10596b;

    public a(int i10, d6 d6Var) {
        this.f10595a = i10;
        this.f10596b = d6Var;
    }

    @Override
    public int I(int i10) {
        return u(i10);
    }

    @Override
    public boolean a() {
        return h6.I.q();
    }

    @Override
    public void d(float f7, float f10, int i10, int i11) {
        h6.q(f7, f10, i10, i11);
    }

    @Override
    public int f(d6 d6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f10595a) {
            case 0:
                if (!c.c(UserConfig.selectedAccount, this.f10596b)) {
                    return i0.a.o(h6.w0(h6.Sd, d6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return h6.m1(f7, h6.w0(h6.Sd, d6Var));
            case 1:
                if (!c.c(UserConfig.selectedAccount, this.f10596b)) {
                    if (z10) {
                        i10 = h6.f21265s8;
                    } else {
                        i10 = h6.f20975ce;
                    }
                    return i0.a.o(h6.w0(i10, d6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return h6.m1(f10, h6.w0(h6.f20975ce, d6Var));
            default:
                if (!c.c(UserConfig.selectedAccount, this.f10596b)) {
                    if (z10) {
                        i11 = h6.f21265s8;
                    } else {
                        i11 = h6.f20975ce;
                    }
                    return i0.a.o(h6.w0(i11, d6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return h6.m1(f11, h6.w0(h6.f20975ce, d6Var));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public ColorFilter j() {
        return h6.f21316v3;
    }

    @Override
    public Paint n(String str) {
        return h6.T0(str);
    }

    @Override
    public int r(int i10) {
        return u(i10);
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public int u(int i10) {
        if (i10 == h6.G8) {
            return -14145495;
        }
        if (i10 != h6.E8) {
            if (i10 == h6.f21057h5) {
                return -14737633;
            }
            if (i10 == h6.f21092j5) {
                return -592138;
            }
            if (i10 == h6.f21242r5) {
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
                    if (i10 == h6.f21075i6) {
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
                            if (i10 == h6.f20928a7) {
                                return -15921907;
                            }
                            if (i10 == h6.f21150m7) {
                                return -12500671;
                            }
                            if (i10 == h6.f21131l7) {
                                return -13133079;
                            }
                            if (i10 == h6.f21170n7) {
                                return -1;
                            }
                            if (i10 == h6.f20986d6) {
                                return -15198183;
                            }
                            if (i10 == h6.f20987d7) {
                                return -16777216;
                            }
                            d6 d6Var = this.f10596b;
                            if (d6Var != null) {
                                return d6Var.u(i10);
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
    public void B(int i10, int i11) {
    }
}
