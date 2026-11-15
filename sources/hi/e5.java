package hi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.messenger.gz;
public class e5 implements org.telegram.ui.ActionBar.e6 {
    public final int f14239a;
    public Object f14240b;
    public Object f14241c;

    public e5() {
        this.f14239a = 1;
    }

    @Override
    public final boolean a() {
        switch (this.f14239a) {
            case 0:
                return true;
            case 1:
            default:
                return org.telegram.ui.ActionBar.j6.I.q();
        }
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.f14239a) {
            case 0:
                org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
                return;
            case 1:
                org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
                return;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f14241c;
                if (e6Var == null) {
                    org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
                    return;
                } else {
                    e6Var.b(f10, f11, i7, i10);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f14239a) {
            case 0:
                if (((PorterDuffColorFilter) this.f14240b) == null) {
                    this.f14240b = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return (PorterDuffColorFilter) this.f14240b;
            case 1:
                return org.telegram.ui.ActionBar.j6.f29181v3;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f14241c;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.j6.f29181v3;
                }
                return e6Var.c();
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f14239a) {
            case 0:
                return ((org.telegram.ui.ActionBar.e6) this.f14241c).d(str);
            case 1:
                return org.telegram.ui.ActionBar.j6.V0(str);
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f14241c;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.j6.V0(str);
                }
                return e6Var.d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f14239a) {
            case 0:
                return gz.H0;
            case 1:
                return gz.H0;
            default:
                return gz.H0;
        }
    }

    @Override
    public final int f(int i7) {
        switch (this.f14239a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f14241c;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.j6.x0(null, i7, false);
                }
                return e6Var.f(i7);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f14239a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f14241c;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.j6.d1();
                }
                return e6Var.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f14239a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f14241c;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.j6.R0(str);
                }
                return e6Var.getDrawable(str);
        }
    }

    @Override
    public final int h(int i7) {
        switch (this.f14239a) {
            case 0:
                if (i7 == org.telegram.ui.ActionBar.j6.G8) {
                    return -14145495;
                }
                if (i7 != org.telegram.ui.ActionBar.j6.E8) {
                    if (i7 == org.telegram.ui.ActionBar.j6.f28922h5) {
                        return -14737633;
                    }
                    if (i7 == org.telegram.ui.ActionBar.j6.f28957j5) {
                        return -592138;
                    }
                    if (i7 == org.telegram.ui.ActionBar.j6.f29107r5) {
                        return -8553091;
                    }
                    if (i7 == org.telegram.ui.ActionBar.j6.f29269zf) {
                        return -16777216;
                    }
                    if (i7 == org.telegram.ui.ActionBar.j6.Cf) {
                        return -1610612736;
                    }
                    if (i7 == org.telegram.ui.ActionBar.j6.Ff || i7 == org.telegram.ui.ActionBar.j6.Jf || i7 == org.telegram.ui.ActionBar.j6.Ef) {
                        return -9539985;
                    }
                    if (i7 != org.telegram.ui.ActionBar.j6.G6) {
                        int i10 = org.telegram.ui.ActionBar.j6.Di;
                        if (i7 == i10) {
                            return -11754001;
                        }
                        if (i7 == org.telegram.ui.ActionBar.j6.f28941i6) {
                            return 536870911;
                        }
                        if (i7 != org.telegram.ui.ActionBar.j6.f29214wi && i7 != org.telegram.ui.ActionBar.j6.f29195vi && i7 != org.telegram.ui.ActionBar.j6.f29233xi) {
                            if (i7 == org.telegram.ui.ActionBar.j6.f29252yi) {
                                return 352321535;
                            }
                            if (i7 != org.telegram.ui.ActionBar.j6.Bf && i7 != i10) {
                                if (i7 == org.telegram.ui.ActionBar.j6.Af) {
                                    return 780633991;
                                }
                                if (i7 == org.telegram.ui.ActionBar.j6.f28792a7) {
                                    return -15921907;
                                }
                                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f14241c;
                                if (e6Var != null) {
                                    return e6Var.h(i7);
                                }
                                return org.telegram.ui.ActionBar.j6.v0(i7);
                            }
                            return -7895161;
                        }
                    }
                }
                return -1;
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f14240b;
                int indexOfKey = sparseIntArray.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return org.telegram.ui.ActionBar.j6.v0(i7);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f14240b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i7);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.f14241c;
                if (e6Var2 == null) {
                    return org.telegram.ui.ActionBar.j6.v0(i7);
                }
                return e6Var2.h(i7);
        }
    }

    @Override
    public final void i(int i7, int i10) {
        switch (this.f14239a) {
            case 0:
            case 1:
                return;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f14241c;
                if (e6Var != null) {
                    e6Var.i(i7, i10);
                    return;
                }
                return;
        }
    }

    @Override
    public final int j(int i7) {
        switch (this.f14239a) {
            case 0:
                return h(i7);
            case 1:
                return ((SparseIntArray) this.f14240b).get(i7);
            default:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f14241c;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.j6.x0(null, i7, false);
                }
                return e6Var.j(i7);
        }
    }

    public e5(int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f14239a = i7;
        switch (i7) {
            case 2:
                this.f14240b = new SparseIntArray();
                this.f14241c = e6Var;
                k();
                return;
            default:
                this.f14241c = e6Var;
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
