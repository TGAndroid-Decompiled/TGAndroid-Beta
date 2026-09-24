package eh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import dh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class a implements d, d6 {
    public final int f8192a;
    public final d6 f8193b;

    public a(int i10, d6 d6Var) {
        this.f8192a = i10;
        this.f8193b = d6Var;
    }

    @Override
    public Paint G(String str) {
        return h6.S0(str);
    }

    @Override
    public int G0(int i10) {
        if (i10 == h6.G8) {
            return -14145495;
        }
        if (i10 != h6.E8) {
            if (i10 == h6.f19115h5) {
                return -14737633;
            }
            if (i10 == h6.f19151j5) {
                return -592138;
            }
            if (i10 == h6.f19301r5) {
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
                    if (i10 == h6.f19134i6) {
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
                            if (i10 == h6.f18989a7) {
                                return -15921907;
                            }
                            if (i10 == h6.f19210m7) {
                                return -12500671;
                            }
                            if (i10 == h6.f19191l7) {
                                return -13133079;
                            }
                            if (i10 == h6.f19230n7) {
                                return -1;
                            }
                            if (i10 == h6.f19045d6) {
                                return -15198183;
                            }
                            if (i10 == h6.f19046d7) {
                                return -16777216;
                            }
                            d6 d6Var = this.f8193b;
                            if (d6Var != null) {
                                return d6Var.G0(i10);
                            }
                            return h6.w0(null, i10, false);
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
        return h6.I.q();
    }

    @Override
    public int g(d6 d6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f8192a) {
            case 0:
                if (!b.c(UserConfig.selectedAccount, this.f8193b)) {
                    return i0.a.k(h6.v0(h6.Sd, d6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return h6.l1(f7, h6.v0(h6.Sd, d6Var));
            case 1:
                if (!b.c(UserConfig.selectedAccount, this.f8193b)) {
                    if (z10) {
                        i10 = h6.f19323s8;
                    } else {
                        i10 = h6.f19034ce;
                    }
                    return i0.a.k(h6.v0(i10, d6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return h6.l1(f10, h6.v0(h6.f19034ce, d6Var));
            default:
                if (!b.c(UserConfig.selectedAccount, this.f8193b)) {
                    if (z10) {
                        i11 = h6.f19323s8;
                    } else {
                        i11 = h6.f19034ce;
                    }
                    return i0.a.k(h6.v0(i11, d6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return h6.l1(f11, h6.v0(h6.f19034ce, d6Var));
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
        h6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public ColorFilter x() {
        return h6.f19373v3;
    }

    @Override
    public void L0(int i10, int i11) {
    }
}
