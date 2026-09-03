package eg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class f0 implements g6, rg.c {
    public final int f5202a;
    public final g6 f5203b;

    public f0(int i10, g6 g6Var) {
        this.f5202a = i10;
        this.f5203b = g6Var;
    }

    @Override
    public int B0(int i10) {
        if (i10 == k6.G8) {
            return -14145495;
        }
        if (i10 != k6.E8) {
            if (i10 == k6.f21733h5) {
                return -14737633;
            }
            if (i10 == k6.f21768j5) {
                return -592138;
            }
            if (i10 == k6.f21913r5) {
                return -8553091;
            }
            if (i10 != k6.He) {
                if (i10 == k6.Ke) {
                    return -1610612736;
                }
                if (i10 == k6.Ne || i10 == k6.Re || i10 == k6.Me) {
                    return -9539985;
                }
                if (i10 != k6.G6) {
                    int i11 = k6.Mh;
                    if (i10 == i11) {
                        return -11754001;
                    }
                    if (i10 == k6.f21752i6) {
                        return 536870911;
                    }
                    if (i10 != k6.Fh && i10 != k6.Eh && i10 != k6.Gh) {
                        if (i10 == k6.Hh) {
                            return 352321535;
                        }
                        if (i10 != k6.Je && i10 != i11) {
                            if (i10 == k6.Ie) {
                                return 780633991;
                            }
                            if (i10 == k6.f21607a7) {
                                return -15921907;
                            }
                            if (i10 == k6.f21824m7) {
                                return -12500671;
                            }
                            if (i10 == k6.f21806l7) {
                                return -13133079;
                            }
                            if (i10 == k6.f21842n7) {
                                return -1;
                            }
                            if (i10 == k6.f21661d6) {
                                return -15198183;
                            }
                            if (i10 == k6.f21662d7) {
                                return -16777216;
                            }
                            g6 g6Var = this.f5203b;
                            if (g6Var != null) {
                                return g6Var.B0(i10);
                            }
                            return k6.w0(null, i10, false);
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
        return k6.S0(str);
    }

    @Override
    public int Z0(int i10) {
        return B0(i10);
    }

    @Override
    public boolean a() {
        return k6.I.q();
    }

    @Override
    public int e0(int i10) {
        return B0(i10);
    }

    @Override
    public int g(g6 g6Var, boolean z4) {
        float f10;
        float f11;
        int i10;
        float f12;
        int i11;
        switch (this.f5202a) {
            case 1:
                if (!sg.b.c(UserConfig.selectedAccount, this.f5203b)) {
                    return i0.a.k(k6.v0(k6.Sd, g6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return k6.l1(f10, k6.v0(k6.Sd, g6Var));
            case 2:
                if (!sg.b.c(UserConfig.selectedAccount, this.f5203b)) {
                    if (z4) {
                        i10 = k6.f21932s8;
                    } else {
                        i10 = k6.f21651ce;
                    }
                    return i0.a.k(k6.v0(i10, g6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return k6.l1(f11, k6.v0(k6.f21651ce, g6Var));
            default:
                if (!sg.b.c(UserConfig.selectedAccount, this.f5203b)) {
                    if (z4) {
                        i11 = k6.f21932s8;
                    } else {
                        i11 = k6.f21651ce;
                    }
                    return i0.a.k(k6.v0(i11, g6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return k6.l1(f12, k6.v0(k6.f21651ce, g6Var));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        k6.q(f10, f11, i10, i11);
    }

    @Override
    public boolean o0() {
        return false;
    }

    @Override
    public ColorFilter w() {
        return k6.f21978v3;
    }

    @Override
    public void J0(int i10, int i11) {
    }
}
