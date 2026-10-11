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
    public final int f8914a;
    public final d6 f8915b;

    public a(int i10, d6 d6Var) {
        this.f8914a = i10;
        this.f8915b = d6Var;
    }

    @Override
    public Paint F(String str) {
        return h6.T0(str);
    }

    @Override
    public boolean a() {
        return h6.I.q();
    }

    @Override
    public int a1(int i10) {
        return x0(i10);
    }

    @Override
    public int c0(int i10) {
        return x0(i10);
    }

    @Override
    public int g(d6 d6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f8914a) {
            case 0:
                if (!b.c(UserConfig.selectedAccount, this.f8915b)) {
                    return i0.a.k(h6.w0(h6.Sd, d6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return h6.m1(f7, h6.w0(h6.Sd, d6Var));
            case 1:
                if (!b.c(UserConfig.selectedAccount, this.f8915b)) {
                    if (z10) {
                        i10 = h6.f21065s8;
                    } else {
                        i10 = h6.f20775ce;
                    }
                    return i0.a.k(h6.w0(i10, d6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return h6.m1(f10, h6.w0(h6.f20775ce, d6Var));
            default:
                if (!b.c(UserConfig.selectedAccount, this.f8915b)) {
                    if (z10) {
                        i11 = h6.f21065s8;
                    } else {
                        i11 = h6.f20775ce;
                    }
                    return i0.a.k(h6.w0(i11, d6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return h6.m1(f11, h6.w0(h6.f20775ce, d6Var));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public boolean k0() {
        return false;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        h6.q(f7, f10, i10, i11);
    }

    @Override
    public ColorFilter x() {
        return h6.f21115v3;
    }

    @Override
    public int x0(int i10) {
        if (i10 == h6.G8) {
            return -14145495;
        }
        if (i10 != h6.E8) {
            if (i10 == h6.f20857h5) {
                return -14737633;
            }
            if (i10 == h6.f20894j5) {
                return -592138;
            }
            if (i10 == h6.f21044r5) {
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
                    if (i10 == h6.f20877i6) {
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
                            if (i10 == h6.f20730a7) {
                                return -15921907;
                            }
                            if (i10 == h6.f20952m7) {
                                return -12500671;
                            }
                            if (i10 == h6.f20933l7) {
                                return -13133079;
                            }
                            if (i10 == h6.f20972n7) {
                                return -1;
                            }
                            if (i10 == h6.f20786d6) {
                                return -15198183;
                            }
                            if (i10 == h6.f20787d7) {
                                return -16777216;
                            }
                            d6 d6Var = this.f8915b;
                            if (d6Var != null) {
                                return d6Var.x0(i10);
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
    public void I0(int i10, int i11) {
    }
}
