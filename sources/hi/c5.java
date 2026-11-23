package hi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.messenger.cz;
public class c5 implements org.telegram.ui.ActionBar.h6 {
    public final int f14332a;
    public Object f14333b;
    public Object f14334c;

    public c5() {
        this.f14332a = 1;
    }

    @Override
    public final boolean d() {
        switch (this.f14332a) {
            case 0:
                return true;
            case 1:
            default:
                return org.telegram.ui.ActionBar.m6.I.q();
        }
    }

    @Override
    public final void e(float f10, float f11, int i7, int i10) {
        switch (this.f14332a) {
            case 0:
                org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                return;
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f14334c;
                if (h6Var == null) {
                    org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                    return;
                } else {
                    h6Var.e(f10, f11, i7, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter f() {
        switch (this.f14332a) {
            case 0:
                if (((PorterDuffColorFilter) this.f14333b) == null) {
                    this.f14333b = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return (PorterDuffColorFilter) this.f14333b;
            case 1:
                return org.telegram.ui.ActionBar.m6.f29713v3;
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f14334c;
                if (h6Var == null) {
                    return org.telegram.ui.ActionBar.m6.f29713v3;
                }
                return h6Var.f();
        }
    }

    @Override
    public final Paint g(String str) {
        switch (this.f14332a) {
            case 0:
                return ((org.telegram.ui.ActionBar.h6) this.f14334c).g(str);
            case 1:
                return org.telegram.ui.ActionBar.m6.V0(str);
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f14334c;
                if (h6Var == null) {
                    return org.telegram.ui.ActionBar.m6.V0(str);
                }
                return h6Var.g(str);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f14332a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f14334c;
                if (h6Var == null) {
                    return org.telegram.ui.ActionBar.m6.R0(str);
                }
                return h6Var.getDrawable(str);
        }
    }

    @Override
    public final boolean h() {
        switch (this.f14332a) {
            case 0:
                return cz.H0;
            case 1:
                return cz.H0;
            default:
                return cz.H0;
        }
    }

    @Override
    public final int i(int i7) {
        switch (this.f14332a) {
            case 0:
                return k(i7);
            case 1:
                return k(i7);
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f14334c;
                if (h6Var == null) {
                    return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
                }
                return h6Var.i(i7);
        }
    }

    @Override
    public final boolean j() {
        switch (this.f14332a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f14334c;
                if (h6Var == null) {
                    return org.telegram.ui.ActionBar.m6.d1();
                }
                return h6Var.j();
        }
    }

    @Override
    public final int k(int i7) {
        switch (this.f14332a) {
            case 0:
                if (i7 == org.telegram.ui.ActionBar.m6.G8) {
                    return -14145495;
                }
                if (i7 != org.telegram.ui.ActionBar.m6.E8) {
                    if (i7 == org.telegram.ui.ActionBar.m6.f29454h5) {
                        return -14737633;
                    }
                    if (i7 == org.telegram.ui.ActionBar.m6.f29489j5) {
                        return -592138;
                    }
                    if (i7 == org.telegram.ui.ActionBar.m6.f29639r5) {
                        return -8553091;
                    }
                    if (i7 == org.telegram.ui.ActionBar.m6.f29801zf) {
                        return -16777216;
                    }
                    if (i7 == org.telegram.ui.ActionBar.m6.Cf) {
                        return -1610612736;
                    }
                    if (i7 == org.telegram.ui.ActionBar.m6.Ff || i7 == org.telegram.ui.ActionBar.m6.Jf || i7 == org.telegram.ui.ActionBar.m6.Ef) {
                        return -9539985;
                    }
                    if (i7 != org.telegram.ui.ActionBar.m6.G6) {
                        int i10 = org.telegram.ui.ActionBar.m6.Di;
                        if (i7 == i10) {
                            return -11754001;
                        }
                        if (i7 == org.telegram.ui.ActionBar.m6.f29473i6) {
                            return 536870911;
                        }
                        if (i7 != org.telegram.ui.ActionBar.m6.f29746wi && i7 != org.telegram.ui.ActionBar.m6.f29727vi && i7 != org.telegram.ui.ActionBar.m6.f29765xi) {
                            if (i7 == org.telegram.ui.ActionBar.m6.f29784yi) {
                                return 352321535;
                            }
                            if (i7 != org.telegram.ui.ActionBar.m6.Bf && i7 != i10) {
                                if (i7 == org.telegram.ui.ActionBar.m6.Af) {
                                    return 780633991;
                                }
                                if (i7 == org.telegram.ui.ActionBar.m6.f29324a7) {
                                    return -15921907;
                                }
                                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f14334c;
                                if (h6Var != null) {
                                    return h6Var.k(i7);
                                }
                                return org.telegram.ui.ActionBar.m6.v0(i7);
                            }
                            return -7895161;
                        }
                    }
                }
                return -1;
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f14333b;
                int indexOfKey = sparseIntArray.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return org.telegram.ui.ActionBar.m6.v0(i7);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f14333b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i7);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) this.f14334c;
                if (h6Var2 == null) {
                    return org.telegram.ui.ActionBar.m6.v0(i7);
                }
                return h6Var2.k(i7);
        }
    }

    @Override
    public final void l(int i7, int i10) {
        switch (this.f14332a) {
            case 0:
            case 1:
                return;
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f14334c;
                if (h6Var != null) {
                    h6Var.l(i7, i10);
                    return;
                }
                return;
        }
    }

    @Override
    public final int m(int i7) {
        switch (this.f14332a) {
            case 0:
                return k(i7);
            case 1:
                return ((SparseIntArray) this.f14333b).get(i7);
            default:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f14334c;
                if (h6Var == null) {
                    return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
                }
                return h6Var.m(i7);
        }
    }

    public c5(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f14332a = i7;
        switch (i7) {
            case 2:
                this.f14333b = new SparseIntArray();
                this.f14334c = h6Var;
                a();
                return;
            default:
                this.f14334c = h6Var;
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
