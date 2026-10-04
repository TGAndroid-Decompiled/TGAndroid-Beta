package eh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import dh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
public final class a implements d, d6 {
    public final int f8902a;
    public final d6 f8903b;

    public a(int i10, d6 d6Var) {
        this.f8902a = i10;
        this.f8903b = d6Var;
    }

    @Override
    public Paint H(String str) {
        return i6.S0(str);
    }

    @Override
    public int H0(int i10) {
        if (i10 == i6.G8) {
            return -14145495;
        }
        if (i10 != i6.E8) {
            if (i10 == i6.f20890h5) {
                return -14737633;
            }
            if (i10 == i6.f20926j5) {
                return -592138;
            }
            if (i10 == i6.f21077r5) {
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
                    if (i10 == i6.f20909i6) {
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
                            if (i10 == i6.f20762a7) {
                                return -15921907;
                            }
                            if (i10 == i6.f20985m7) {
                                return -12500671;
                            }
                            if (i10 == i6.f20966l7) {
                                return -13133079;
                            }
                            if (i10 == i6.f21005n7) {
                                return -1;
                            }
                            if (i10 == i6.f20818d6) {
                                return -15198183;
                            }
                            if (i10 == i6.f20819d7) {
                                return -16777216;
                            }
                            d6 d6Var = this.f8903b;
                            if (d6Var != null) {
                                return d6Var.H0(i10);
                            }
                            return i6.w0(null, i10, false);
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
        return i6.I.q();
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public int h(d6 d6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f8902a) {
            case 0:
                if (!b.c(UserConfig.selectedAccount, this.f8903b)) {
                    return i0.a.k(i6.v0(i6.Sd, d6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return i6.l1(f7, i6.v0(i6.Sd, d6Var));
            case 1:
                if (!b.c(UserConfig.selectedAccount, this.f8903b)) {
                    if (z10) {
                        i10 = i6.f21100s8;
                    } else {
                        i10 = i6.f20807ce;
                    }
                    return i0.a.k(i6.v0(i10, d6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return i6.l1(f10, i6.v0(i6.f20807ce, d6Var));
            default:
                if (!b.c(UserConfig.selectedAccount, this.f8903b)) {
                    if (z10) {
                        i11 = i6.f21100s8;
                    } else {
                        i11 = i6.f20807ce;
                    }
                    return i0.a.k(i6.v0(i11, d6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return i6.l1(f11, i6.v0(i6.f20807ce, d6Var));
        }
    }

    @Override
    public int j0(int i10) {
        return H0(i10);
    }

    @Override
    public int j1(int i10) {
        return H0(i10);
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        i6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean r0() {
        return false;
    }

    @Override
    public ColorFilter x() {
        return i6.f21150v3;
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
