package fi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.messenger.iz;
public class g5 implements org.telegram.ui.ActionBar.g6 {
    public final int f12068a;
    public Object f12069b;
    public Object f12070c;

    public g5() {
        this.f12068a = 1;
    }

    @Override
    public final boolean a() {
        switch (this.f12068a) {
            case 0:
                return true;
            case 1:
            default:
                return org.telegram.ui.ActionBar.l6.I.q();
        }
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.f12068a) {
            case 0:
                org.telegram.ui.ActionBar.l6.r(f10, f11, i7, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.l6.r(f10, f11, i7, i10);
                return;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f12070c;
                if (g6Var == null) {
                    org.telegram.ui.ActionBar.l6.r(f10, f11, i7, i10);
                    return;
                } else {
                    g6Var.b(f10, f11, i7, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f12068a) {
            case 0:
                if (((PorterDuffColorFilter) this.f12069b) == null) {
                    this.f12069b = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return (PorterDuffColorFilter) this.f12069b;
            case 1:
                return org.telegram.ui.ActionBar.l6.f28197v3;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f12070c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.l6.f28197v3;
                }
                return g6Var.c();
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f12068a) {
            case 0:
                return ((org.telegram.ui.ActionBar.g6) this.f12070c).d(str);
            case 1:
                return org.telegram.ui.ActionBar.l6.V0(str);
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f12070c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.l6.V0(str);
                }
                return g6Var.d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f12068a) {
            case 0:
                return iz.H0;
            case 1:
                return iz.H0;
            default:
                return iz.H0;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f12068a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f12070c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.l6.x0(null, i7, false);
                }
                return g6Var.f(i7);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f12068a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f12070c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.l6.d1();
                }
                return g6Var.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f12068a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f12070c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.l6.R0(str);
                }
                return g6Var.getDrawable(str);
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f12068a) {
            case 0:
                if (i7 == org.telegram.ui.ActionBar.l6.G8) {
                    return -14145495;
                }
                if (i7 != org.telegram.ui.ActionBar.l6.E8) {
                    if (i7 == org.telegram.ui.ActionBar.l6.f27938h5) {
                        return -14737633;
                    }
                    if (i7 == org.telegram.ui.ActionBar.l6.f27973j5) {
                        return -592138;
                    }
                    if (i7 == org.telegram.ui.ActionBar.l6.f28123r5) {
                        return -8553091;
                    }
                    if (i7 == org.telegram.ui.ActionBar.l6.f28227wf) {
                        return -16777216;
                    }
                    if (i7 == org.telegram.ui.ActionBar.l6.f28283zf) {
                        return -1610612736;
                    }
                    if (i7 == org.telegram.ui.ActionBar.l6.Cf || i7 == org.telegram.ui.ActionBar.l6.Gf || i7 == org.telegram.ui.ActionBar.l6.Bf) {
                        return -9539985;
                    }
                    if (i7 != org.telegram.ui.ActionBar.l6.G6) {
                        int i10 = org.telegram.ui.ActionBar.l6.Ai;
                        if (i7 == i10) {
                            return -11754001;
                        }
                        if (i7 == org.telegram.ui.ActionBar.l6.f27957i6) {
                            return 536870911;
                        }
                        if (i7 != org.telegram.ui.ActionBar.l6.f28173ti && i7 != org.telegram.ui.ActionBar.l6.f28154si && i7 != org.telegram.ui.ActionBar.l6.f28193ui) {
                            if (i7 == org.telegram.ui.ActionBar.l6.f28211vi) {
                                return 352321535;
                            }
                            if (i7 != org.telegram.ui.ActionBar.l6.f28265yf && i7 != i10) {
                                if (i7 == org.telegram.ui.ActionBar.l6.f28246xf) {
                                    return 780633991;
                                }
                                if (i7 == org.telegram.ui.ActionBar.l6.f27809a7) {
                                    return -15921907;
                                }
                                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f12070c;
                                if (g6Var != null) {
                                    return g6Var.h(i7);
                                }
                                return org.telegram.ui.ActionBar.l6.v0(i7);
                            }
                            return -7895161;
                        }
                    }
                }
                return -1;
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f12069b;
                int indexOfKey = sparseIntArray.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return org.telegram.ui.ActionBar.l6.v0(i7);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f12069b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i7);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.f12070c;
                if (g6Var2 == null) {
                    return org.telegram.ui.ActionBar.l6.v0(i7);
                }
                return g6Var2.h(i7);
        }
    }

    @Override
    public final void i(int i7, int i10) {
        switch (this.f12068a) {
            case 0:
            case 1:
                return;
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f12070c;
                if (g6Var != null) {
                    g6Var.i(i7, i10);
                    return;
                }
                return;
        }
    }

    @Override
    public final int j(int i7) {
        switch (this.f12068a) {
            case 0:
                return h(i7);
            case 1:
                return ((SparseIntArray) this.f12069b).get(i7);
            default:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f12070c;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.l6.x0(null, i7, false);
                }
                return g6Var.j(i7);
        }
    }

    public g5(int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f12068a = i7;
        switch (i7) {
            case 2:
                this.f12069b = new SparseIntArray();
                this.f12070c = g6Var;
                k();
                return;
            default:
                this.f12070c = g6Var;
                return;
        }
    }

    public void k() {
    }

    private final void l(int i7, int i10) {
    }

    private final void m(int i7, int i10) {
    }
}
