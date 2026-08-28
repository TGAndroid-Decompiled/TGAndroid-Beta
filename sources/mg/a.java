package mg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class a implements lg.c, b6 {
    public final int f17685a;
    public final b6 f17686b;

    public a(int i9, b6 b6Var) {
        this.f17685a = i9;
        this.f17686b = b6Var;
    }

    @Override
    public ColorFilter H() {
        return f6.f23317v3;
    }

    @Override
    public int N0(int i9) {
        if (i9 == f6.G8) {
            return -14145495;
        }
        if (i9 != f6.E8) {
            if (i9 == f6.f23072h5) {
                return -14737633;
            }
            if (i9 == f6.f23108j5) {
                return -592138;
            }
            if (i9 == f6.f23247r5) {
                return -8553091;
            }
            if (i9 != f6.He) {
                if (i9 == f6.Ke) {
                    return -1610612736;
                }
                if (i9 == f6.Ne || i9 == f6.Re || i9 == f6.Me) {
                    return -9539985;
                }
                if (i9 != f6.G6) {
                    int i10 = f6.Mh;
                    if (i9 == i10) {
                        return -11754001;
                    }
                    if (i9 == f6.f23092i6) {
                        return 536870911;
                    }
                    if (i9 != f6.Fh && i9 != f6.Eh && i9 != f6.Gh) {
                        if (i9 == f6.Hh) {
                            return 352321535;
                        }
                        if (i9 != f6.Je && i9 != i10) {
                            if (i9 == f6.Ie) {
                                return 780633991;
                            }
                            if (i9 == f6.f22947a7) {
                                return -15921907;
                            }
                            if (i9 == f6.f23163m7) {
                                return -12500671;
                            }
                            if (i9 == f6.f23145l7) {
                                return -13133079;
                            }
                            if (i9 == f6.f23180n7) {
                                return -1;
                            }
                            if (i9 == f6.f23001d6) {
                                return -15198183;
                            }
                            if (i9 == f6.f23002d7) {
                                return -16777216;
                            }
                            b6 b6Var = this.f17686b;
                            if (b6Var != null) {
                                return b6Var.N0(i9);
                            }
                            return f6.w0(null, i9, false);
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
    public Paint O(String str) {
        return f6.S0(str);
    }

    @Override
    public boolean a() {
        return f6.I.q();
    }

    @Override
    public int g(b6 b6Var, boolean z10) {
        float f10;
        float f11;
        int i9;
        float f12;
        int i10;
        switch (this.f17685a) {
            case 0:
                if (!c.c(UserConfig.selectedAccount, this.f17686b)) {
                    return i0.a.k(f6.v0(f6.Sd, b6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return f6.l1(f10, f6.v0(f6.Sd, b6Var));
            case 1:
                if (!c.c(UserConfig.selectedAccount, this.f17686b)) {
                    if (z10) {
                        i9 = f6.f23269s8;
                    } else {
                        i9 = f6.f22991ce;
                    }
                    return i0.a.k(f6.v0(i9, b6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return f6.l1(f11, f6.v0(f6.f22991ce, b6Var));
            default:
                if (!c.c(UserConfig.selectedAccount, this.f17686b)) {
                    if (z10) {
                        i10 = f6.f23269s8;
                    } else {
                        i10 = f6.f22991ce;
                    }
                    return i0.a.k(f6.v0(i10, b6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return f6.l1(f12, f6.v0(f6.f22991ce, b6Var));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void o(float f10, float f11, int i9, int i10) {
        f6.q(f10, f11, i9, i10);
    }

    @Override
    public int p0(int i9) {
        return N0(i9);
    }

    @Override
    public int q1(int i9) {
        return N0(i9);
    }

    @Override
    public boolean t0() {
        return false;
    }

    @Override
    public void c1(int i9, int i10) {
    }
}
