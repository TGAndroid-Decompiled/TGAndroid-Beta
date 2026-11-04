package gi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.messenger.az;
public class e5 implements org.telegram.ui.ActionBar.e6 {
    public final int f12661a;
    public Object f12662b;
    public Object f12663c;

    public e5() {
        this.f12661a = 1;
    }

    @Override
    public final boolean a() {
        switch (this.f12661a) {
            case 0:
                return true;
            case 1:
            default:
                return org.telegram.ui.ActionBar.k6.I.q();
        }
    }

    @Override
    public final void b(float f10, float f11, int i3, int i10) {
        switch (this.f12661a) {
            case 0:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
                return;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f12663c;
                if (e6Var == null) {
                    org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
                    return;
                } else {
                    e6Var.b(f10, f11, i3, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f12661a) {
            case 0:
                if (((PorterDuffColorFilter) this.f12662b) == null) {
                    this.f12662b = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return (PorterDuffColorFilter) this.f12662b;
            case 1:
                return org.telegram.ui.ActionBar.k6.f28211v3;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f12663c;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.k6.f28211v3;
                }
                return e6Var.c();
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f12661a) {
            case 0:
                return ((org.telegram.ui.ActionBar.e6) this.f12663c).d(str);
            case 1:
                return org.telegram.ui.ActionBar.k6.V0(str);
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f12663c;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.k6.V0(str);
                }
                return e6Var.d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f12661a) {
            case 0:
                return az.H0;
            case 1:
                return az.H0;
            default:
                return az.H0;
        }
    }

    @Override
    public final int f(int i3) {
        switch (this.f12661a) {
            case 0:
                return h(i3);
            case 1:
                return h(i3);
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f12663c;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.k6.x0(null, i3, false);
                }
                return e6Var.f(i3);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f12661a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f12663c;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.k6.d1();
                }
                return e6Var.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f12661a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f12663c;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.k6.R0(str);
                }
                return e6Var.getDrawable(str);
        }
    }

    @Override
    public final int h(int i3) {
        switch (this.f12661a) {
            case 0:
                if (i3 == org.telegram.ui.ActionBar.k6.G8) {
                    return -14145495;
                }
                if (i3 != org.telegram.ui.ActionBar.k6.E8) {
                    if (i3 == org.telegram.ui.ActionBar.k6.f27954h5) {
                        return -14737633;
                    }
                    if (i3 == org.telegram.ui.ActionBar.k6.f27988j5) {
                        return -592138;
                    }
                    if (i3 == org.telegram.ui.ActionBar.k6.r5) {
                        return -8553091;
                    }
                    if (i3 == org.telegram.ui.ActionBar.k6.f28243wf) {
                        return -16777216;
                    }
                    if (i3 == org.telegram.ui.ActionBar.k6.f28299zf) {
                        return -1610612736;
                    }
                    if (i3 == org.telegram.ui.ActionBar.k6.Cf || i3 == org.telegram.ui.ActionBar.k6.Gf || i3 == org.telegram.ui.ActionBar.k6.Bf) {
                        return -9539985;
                    }
                    if (i3 != org.telegram.ui.ActionBar.k6.G6) {
                        int i10 = org.telegram.ui.ActionBar.k6.Ai;
                        if (i3 == i10) {
                            return -11754001;
                        }
                        if (i3 == org.telegram.ui.ActionBar.k6.f27972i6) {
                            return 536870911;
                        }
                        if (i3 != org.telegram.ui.ActionBar.k6.f28188ti && i3 != org.telegram.ui.ActionBar.k6.f28169si && i3 != org.telegram.ui.ActionBar.k6.f28207ui) {
                            if (i3 == org.telegram.ui.ActionBar.k6.f28226vi) {
                                return 352321535;
                            }
                            if (i3 != org.telegram.ui.ActionBar.k6.f28280yf && i3 != i10) {
                                if (i3 == org.telegram.ui.ActionBar.k6.f28262xf) {
                                    return 780633991;
                                }
                                if (i3 == org.telegram.ui.ActionBar.k6.f27824a7) {
                                    return -15921907;
                                }
                                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f12663c;
                                if (e6Var != null) {
                                    return e6Var.h(i3);
                                }
                                return org.telegram.ui.ActionBar.k6.v0(i3);
                            }
                            return -7895161;
                        }
                    }
                }
                return -1;
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f12662b;
                int indexOfKey = sparseIntArray.indexOfKey(i3);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return org.telegram.ui.ActionBar.k6.v0(i3);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f12662b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i3);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.f12663c;
                if (e6Var2 == null) {
                    return org.telegram.ui.ActionBar.k6.v0(i3);
                }
                return e6Var2.h(i3);
        }
    }

    @Override
    public final void i(int i3, int i10) {
        switch (this.f12661a) {
            case 0:
            case 1:
                return;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f12663c;
                if (e6Var != null) {
                    e6Var.i(i3, i10);
                    return;
                }
                return;
        }
    }

    @Override
    public final int j(int i3) {
        switch (this.f12661a) {
            case 0:
                return h(i3);
            case 1:
                return ((SparseIntArray) this.f12662b).get(i3);
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f12663c;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.k6.x0(null, i3, false);
                }
                return e6Var.j(i3);
        }
    }

    public e5(int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f12661a = i3;
        switch (i3) {
            case 2:
                this.f12662b = new SparseIntArray();
                this.f12663c = e6Var;
                k();
                return;
            default:
                this.f12663c = e6Var;
                return;
        }
    }

    public void k() {
    }

    private final void l(int i3, int i10) {
    }

    private final void m(int i3, int i10) {
    }
}
