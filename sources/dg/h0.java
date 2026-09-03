package dg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class h0 implements f6, qg.c {
    public final int f4557a;
    public final f6 f4558b;

    public h0(int i10, f6 f6Var) {
        this.f4557a = i10;
        this.f4558b = f6Var;
    }

    @Override
    public Paint G(String str) {
        return j6.S0(str);
    }

    @Override
    public boolean a() {
        return j6.I.q();
    }

    @Override
    public int d0(int i10) {
        return x0(i10);
    }

    @Override
    public int f(f6 f6Var, boolean z4) {
        float f10;
        float f11;
        int i10;
        float f12;
        int i11;
        switch (this.f4557a) {
            case 1:
                if (!rg.b.c(UserConfig.selectedAccount, this.f4558b)) {
                    return i0.a.k(j6.v0(j6.Sd, f6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return j6.l1(f10, j6.v0(j6.Sd, f6Var));
            case 2:
                if (!rg.b.c(UserConfig.selectedAccount, this.f4558b)) {
                    if (z4) {
                        i10 = j6.f20151s8;
                    } else {
                        i10 = j6.f19871ce;
                    }
                    return i0.a.k(j6.v0(i10, f6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return j6.l1(f11, j6.v0(j6.f19871ce, f6Var));
            default:
                if (!rg.b.c(UserConfig.selectedAccount, this.f4558b)) {
                    if (z4) {
                        i11 = j6.f20151s8;
                    } else {
                        i11 = j6.f19871ce;
                    }
                    return i0.a.k(j6.v0(i11, f6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return j6.l1(f12, j6.v0(j6.f19871ce, f6Var));
        }
    }

    @Override
    public int f1(int i10) {
        return x0(i10);
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        j6.q(f10, f11, i10, i11);
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public ColorFilter x() {
        return j6.f20197v3;
    }

    @Override
    public int x0(int i10) {
        if (i10 == j6.G8) {
            return -14145495;
        }
        if (i10 != j6.E8) {
            if (i10 == j6.f19952h5) {
                return -14737633;
            }
            if (i10 == j6.f19987j5) {
                return -592138;
            }
            if (i10 == j6.f20131r5) {
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
                    if (i10 == j6.f19971i6) {
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
                            if (i10 == j6.f19827a7) {
                                return -15921907;
                            }
                            if (i10 == j6.f20043m7) {
                                return -12500671;
                            }
                            if (i10 == j6.f20025l7) {
                                return -13133079;
                            }
                            if (i10 == j6.f20061n7) {
                                return -1;
                            }
                            if (i10 == j6.f19881d6) {
                                return -15198183;
                            }
                            if (i10 == j6.f19882d7) {
                                return -16777216;
                            }
                            f6 f6Var = this.f4558b;
                            if (f6Var != null) {
                                return f6Var.x0(i10);
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
    public void J0(int i10, int i11) {
    }
}
