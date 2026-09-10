package dh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import ch.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class b implements d, f6 {
    public final int f6498a;
    public final f6 f6499b;

    public b(int i10, f6 f6Var) {
        this.f6498a = i10;
        this.f6499b = f6Var;
    }

    @Override
    public Paint F(String str) {
        return j6.S0(str);
    }

    @Override
    public int F0(int i10) {
        if (i10 == j6.G8) {
            return -14145495;
        }
        if (i10 != j6.E8) {
            if (i10 == j6.f17998h5) {
                return -14737633;
            }
            if (i10 == j6.f18034j5) {
                return -592138;
            }
            if (i10 == j6.f18179r5) {
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
                    if (i10 == j6.f18017i6) {
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
                            if (i10 == j6.f17872a7) {
                                return -15921907;
                            }
                            if (i10 == j6.f18092m7) {
                                return -12500671;
                            }
                            if (i10 == j6.f18074l7) {
                                return -13133079;
                            }
                            if (i10 == j6.f18111n7) {
                                return -1;
                            }
                            if (i10 == j6.f17928d6) {
                                return -15198183;
                            }
                            if (i10 == j6.f17929d7) {
                                return -16777216;
                            }
                            f6 f6Var = this.f6499b;
                            if (f6Var != null) {
                                return f6Var.F0(i10);
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
    public int e0(int i10) {
        return F0(i10);
    }

    @Override
    public int f1(int i10) {
        return F0(i10);
    }

    @Override
    public int g(f6 f6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f6498a) {
            case 0:
                if (!c.c(UserConfig.selectedAccount, this.f6499b)) {
                    return i0.a.k(j6.v0(j6.Sd, f6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return j6.l1(f7, j6.v0(j6.Sd, f6Var));
            case 1:
                if (!c.c(UserConfig.selectedAccount, this.f6499b)) {
                    if (z10) {
                        i10 = j6.f18201s8;
                    } else {
                        i10 = j6.f17917ce;
                    }
                    return i0.a.k(j6.v0(i10, f6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return j6.l1(f10, j6.v0(j6.f17917ce, f6Var));
            default:
                if (!c.c(UserConfig.selectedAccount, this.f6499b)) {
                    if (z10) {
                        i11 = j6.f18201s8;
                    } else {
                        i11 = j6.f17917ce;
                    }
                    return i0.a.k(j6.v0(i11, f6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return j6.l1(f11, j6.v0(j6.f17917ce, f6Var));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        j6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public ColorFilter w() {
        return j6.f18251v3;
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
