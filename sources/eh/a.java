package eh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import dh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class a implements d, e6 {
    public final int f8209a;
    public final e6 f8210b;

    public a(int i10, e6 e6Var) {
        this.f8209a = i10;
        this.f8210b = e6Var;
    }

    @Override
    public Paint G(String str) {
        return j6.S0(str);
    }

    @Override
    public int G0(int i10) {
        if (i10 == j6.G8) {
            return -14145495;
        }
        if (i10 != j6.E8) {
            if (i10 == j6.f19133h5) {
                return -14737633;
            }
            if (i10 == j6.f19169j5) {
                return -592138;
            }
            if (i10 == j6.f19318r5) {
                return -8553091;
            }
            if (i10 != j6.He) {
                if (i10 == j6.Ke) {
                    return -1610612736;
                }
                if (i10 == j6.Ne || i10 == j6.Re || i10 == j6.Me) {
                    return -9539985;
                }
                if (i10 != j6.G6) {
                    int i11 = j6.Mh;
                    if (i10 == i11) {
                        return -11754001;
                    }
                    if (i10 == j6.f19152i6) {
                        return 536870911;
                    }
                    if (i10 != j6.Fh && i10 != j6.Eh && i10 != j6.Gh) {
                        if (i10 == j6.Hh) {
                            return 352321535;
                        }
                        if (i10 != j6.Je && i10 != i11) {
                            if (i10 == j6.Ie) {
                                return 780633991;
                            }
                            if (i10 == j6.f19006a7) {
                                return -15921907;
                            }
                            if (i10 == j6.f19228m7) {
                                return -12500671;
                            }
                            if (i10 == j6.f19209l7) {
                                return -13133079;
                            }
                            if (i10 == j6.f19248n7) {
                                return -1;
                            }
                            if (i10 == j6.f19062d6) {
                                return -15198183;
                            }
                            if (i10 == j6.f19063d7) {
                                return -16777216;
                            }
                            e6 e6Var = this.f8210b;
                            if (e6Var != null) {
                                return e6Var.G0(i10);
                            }
                            return j6.w0(null, i10, false);
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
    public boolean a() {
        return j6.I.q();
    }

    @Override
    public int g(e6 e6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f8209a) {
            case 0:
                if (!b.c(UserConfig.selectedAccount, this.f8210b)) {
                    return i0.a.k(j6.v0(j6.Sd, e6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return j6.l1(f7, j6.v0(j6.Sd, e6Var));
            case 1:
                if (!b.c(UserConfig.selectedAccount, this.f8210b)) {
                    if (z10) {
                        i10 = j6.f19340s8;
                    } else {
                        i10 = j6.f19051ce;
                    }
                    return i0.a.k(j6.v0(i10, e6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return j6.l1(f10, j6.v0(j6.f19051ce, e6Var));
            default:
                if (!b.c(UserConfig.selectedAccount, this.f8210b)) {
                    if (z10) {
                        i11 = j6.f19340s8;
                    } else {
                        i11 = j6.f19051ce;
                    }
                    return i0.a.k(j6.v0(i11, e6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return j6.l1(f11, j6.v0(j6.f19051ce, e6Var));
        }
    }

    @Override
    public int g0(int i10) {
        return G0(i10);
    }

    @Override
    public int g1(int i10) {
        return G0(i10);
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        j6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public ColorFilter x() {
        return j6.f19390v3;
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
