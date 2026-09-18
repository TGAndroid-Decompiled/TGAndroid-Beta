package eh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import dh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class a implements d, f6 {
    public final int f8210a;
    public final f6 f8211b;

    public a(int i10, f6 f6Var) {
        this.f8210a = i10;
        this.f8211b = f6Var;
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
            if (i10 == j6.f18934h5) {
                return -14737633;
            }
            if (i10 == j6.f18970j5) {
                return -592138;
            }
            if (i10 == j6.f19118r5) {
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
                    if (i10 == j6.f18953i6) {
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
                            if (i10 == j6.f18807a7) {
                                return -15921907;
                            }
                            if (i10 == j6.f19029m7) {
                                return -12500671;
                            }
                            if (i10 == j6.f19010l7) {
                                return -13133079;
                            }
                            if (i10 == j6.f19049n7) {
                                return -1;
                            }
                            if (i10 == j6.f18863d6) {
                                return -15198183;
                            }
                            if (i10 == j6.f18864d7) {
                                return -16777216;
                            }
                            f6 f6Var = this.f8211b;
                            if (f6Var != null) {
                                return f6Var.G0(i10);
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
    public int g(f6 f6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f8210a) {
            case 0:
                if (!b.c(UserConfig.selectedAccount, this.f8211b)) {
                    return i0.a.k(j6.v0(j6.Sd, f6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return j6.l1(f7, j6.v0(j6.Sd, f6Var));
            case 1:
                if (!b.c(UserConfig.selectedAccount, this.f8211b)) {
                    if (z10) {
                        i10 = j6.f19140s8;
                    } else {
                        i10 = j6.f18852ce;
                    }
                    return i0.a.k(j6.v0(i10, f6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return j6.l1(f10, j6.v0(j6.f18852ce, f6Var));
            default:
                if (!b.c(UserConfig.selectedAccount, this.f8211b)) {
                    if (z10) {
                        i11 = j6.f19140s8;
                    } else {
                        i11 = j6.f18852ce;
                    }
                    return i0.a.k(j6.v0(i11, f6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return j6.l1(f11, j6.v0(j6.f18852ce, f6Var));
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
        return j6.f19190v3;
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
