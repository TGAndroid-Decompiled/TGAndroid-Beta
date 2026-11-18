package hi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.messenger.bz;
public class d5 implements org.telegram.ui.ActionBar.i6 {
    public final int f14382a;
    public Object f14383b;
    public Object f14384c;

    public d5() {
        this.f14382a = 1;
    }

    @Override
    public final boolean d() {
        switch (this.f14382a) {
            case 0:
                return true;
            case 1:
            default:
                return org.telegram.ui.ActionBar.n6.I.q();
        }
    }

    @Override
    public final void e(float f10, float f11, int i7, int i10) {
        switch (this.f14382a) {
            case 0:
                org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
                return;
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f14384c;
                if (i6Var == null) {
                    org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
                    return;
                } else {
                    i6Var.e(f10, f11, i7, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter f() {
        switch (this.f14382a) {
            case 0:
                if (((PorterDuffColorFilter) this.f14383b) == null) {
                    this.f14383b = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return (PorterDuffColorFilter) this.f14383b;
            case 1:
                return org.telegram.ui.ActionBar.n6.f29728v3;
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f14384c;
                if (i6Var == null) {
                    return org.telegram.ui.ActionBar.n6.f29728v3;
                }
                return i6Var.f();
        }
    }

    @Override
    public final Paint g(String str) {
        switch (this.f14382a) {
            case 0:
                return ((org.telegram.ui.ActionBar.i6) this.f14384c).g(str);
            case 1:
                return org.telegram.ui.ActionBar.n6.V0(str);
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f14384c;
                if (i6Var == null) {
                    return org.telegram.ui.ActionBar.n6.V0(str);
                }
                return i6Var.g(str);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f14382a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f14384c;
                if (i6Var == null) {
                    return org.telegram.ui.ActionBar.n6.R0(str);
                }
                return i6Var.getDrawable(str);
        }
    }

    @Override
    public final boolean h() {
        switch (this.f14382a) {
            case 0:
                return bz.H0;
            case 1:
                return bz.H0;
            default:
                return bz.H0;
        }
    }

    @Override
    public final int i(int i7) {
        switch (this.f14382a) {
            case 0:
                return k(i7);
            case 1:
                return k(i7);
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f14384c;
                if (i6Var == null) {
                    return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
                }
                return i6Var.i(i7);
        }
    }

    @Override
    public final boolean j() {
        switch (this.f14382a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f14384c;
                if (i6Var == null) {
                    return org.telegram.ui.ActionBar.n6.d1();
                }
                return i6Var.j();
        }
    }

    @Override
    public final int k(int i7) {
        switch (this.f14382a) {
            case 0:
                if (i7 == org.telegram.ui.ActionBar.n6.G8) {
                    return -14145495;
                }
                if (i7 != org.telegram.ui.ActionBar.n6.E8) {
                    if (i7 == org.telegram.ui.ActionBar.n6.f29469h5) {
                        return -14737633;
                    }
                    if (i7 == org.telegram.ui.ActionBar.n6.f29504j5) {
                        return -592138;
                    }
                    if (i7 == org.telegram.ui.ActionBar.n6.f29654r5) {
                        return -8553091;
                    }
                    if (i7 == org.telegram.ui.ActionBar.n6.f29816zf) {
                        return -16777216;
                    }
                    if (i7 == org.telegram.ui.ActionBar.n6.Cf) {
                        return -1610612736;
                    }
                    if (i7 == org.telegram.ui.ActionBar.n6.Ff || i7 == org.telegram.ui.ActionBar.n6.Jf || i7 == org.telegram.ui.ActionBar.n6.Ef) {
                        return -9539985;
                    }
                    if (i7 != org.telegram.ui.ActionBar.n6.G6) {
                        int i10 = org.telegram.ui.ActionBar.n6.Di;
                        if (i7 == i10) {
                            return -11754001;
                        }
                        if (i7 == org.telegram.ui.ActionBar.n6.f29488i6) {
                            return 536870911;
                        }
                        if (i7 != org.telegram.ui.ActionBar.n6.f29761wi && i7 != org.telegram.ui.ActionBar.n6.f29742vi && i7 != org.telegram.ui.ActionBar.n6.f29780xi) {
                            if (i7 == org.telegram.ui.ActionBar.n6.f29799yi) {
                                return 352321535;
                            }
                            if (i7 != org.telegram.ui.ActionBar.n6.Bf && i7 != i10) {
                                if (i7 == org.telegram.ui.ActionBar.n6.Af) {
                                    return 780633991;
                                }
                                if (i7 == org.telegram.ui.ActionBar.n6.f29339a7) {
                                    return -15921907;
                                }
                                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f14384c;
                                if (i6Var != null) {
                                    return i6Var.k(i7);
                                }
                                return org.telegram.ui.ActionBar.n6.v0(i7);
                            }
                            return -7895161;
                        }
                    }
                }
                return -1;
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f14383b;
                int indexOfKey = sparseIntArray.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return org.telegram.ui.ActionBar.n6.v0(i7);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f14383b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i7);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) this.f14384c;
                if (i6Var2 == null) {
                    return org.telegram.ui.ActionBar.n6.v0(i7);
                }
                return i6Var2.k(i7);
        }
    }

    @Override
    public final void l(int i7, int i10) {
        switch (this.f14382a) {
            case 0:
            case 1:
                return;
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f14384c;
                if (i6Var != null) {
                    i6Var.l(i7, i10);
                    return;
                }
                return;
        }
    }

    @Override
    public final int m(int i7) {
        switch (this.f14382a) {
            case 0:
                return k(i7);
            case 1:
                return ((SparseIntArray) this.f14383b).get(i7);
            default:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f14384c;
                if (i6Var == null) {
                    return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
                }
                return i6Var.m(i7);
        }
    }

    public d5(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f14382a = i7;
        switch (i7) {
            case 2:
                this.f14383b = new SparseIntArray();
                this.f14384c = i6Var;
                a();
                return;
            default:
                this.f14384c = i6Var;
                return;
        }
    }

    public void a() {
    }

    private final void b(int i7, int i10) {
    }

    private final void c(int i7, int i10) {
    }
}
