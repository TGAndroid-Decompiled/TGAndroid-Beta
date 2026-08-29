package bg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class i0 implements c6, og.c {
    public final int f2293a;
    public final c6 f2294b;

    public i0(int i10, c6 c6Var) {
        this.f2293a = i10;
        this.f2294b = c6Var;
    }

    @Override
    public ColorFilter B() {
        return g6.f23380v3;
    }

    @Override
    public int C0(int i10) {
        if (i10 == g6.G8) {
            return -14145495;
        }
        if (i10 != g6.E8) {
            if (i10 == g6.f23133h5) {
                return -14737633;
            }
            if (i10 == g6.f23169j5) {
                return -592138;
            }
            if (i10 == g6.f23310r5) {
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
                    if (i10 == g6.f23152i6) {
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
                            if (i10 == g6.f23009a7) {
                                return -15921907;
                            }
                            if (i10 == g6.f23224m7) {
                                return -12500671;
                            }
                            if (i10 == g6.f23207l7) {
                                return -13133079;
                            }
                            if (i10 == g6.f23242n7) {
                                return -1;
                            }
                            if (i10 == g6.f23062d6) {
                                return -15198183;
                            }
                            if (i10 == g6.f23063d7) {
                                return -16777216;
                            }
                            c6 c6Var = this.f2294b;
                            if (c6Var != null) {
                                return c6Var.C0(i10);
                            }
                            return g6.w0(null, i10, false);
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
    public Paint G(String str) {
        return g6.S0(str);
    }

    @Override
    public boolean a() {
        return g6.I.q();
    }

    @Override
    public int f(c6 c6Var, boolean z10) {
        float f9;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f2293a) {
            case 1:
                if (!pg.a.c(UserConfig.selectedAccount, this.f2294b)) {
                    return i0.a.k(g6.v0(g6.Sd, c6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f9 = 0.85f;
                } else {
                    f9 = 0.76f;
                }
                return g6.l1(f9, g6.v0(g6.Sd, c6Var));
            case 2:
                if (!pg.a.c(UserConfig.selectedAccount, this.f2294b)) {
                    if (z10) {
                        i10 = g6.f23329s8;
                    } else {
                        i10 = g6.f23052ce;
                    }
                    return i0.a.k(g6.v0(i10, c6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return g6.l1(f10, g6.v0(g6.f23052ce, c6Var));
            default:
                if (!pg.a.c(UserConfig.selectedAccount, this.f2294b)) {
                    if (z10) {
                        i11 = g6.f23329s8;
                    } else {
                        i11 = g6.f23052ce;
                    }
                    return i0.a.k(g6.v0(i11, c6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return g6.l1(f11, g6.v0(g6.f23052ce, c6Var));
        }
    }

    @Override
    public int g1(int i10) {
        return C0(i10);
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public int h0(int i10) {
        return C0(i10);
    }

    @Override
    public void l(float f9, float f10, int i10, int i11) {
        g6.q(f9, f10, i10, i11);
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
