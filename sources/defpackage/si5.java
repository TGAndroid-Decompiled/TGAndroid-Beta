package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
public class si5 implements wjb {
    public final byte a;
    public Object b;
    public Object c;

    public si5(wjb wjbVar) {
        this.a = (byte) 2;
        this.b = new SparseIntArray();
        this.c = wjbVar;
        k();
    }

    @Override
    public final boolean a() {
        switch (this.a) {
            case 0:
            default:
                return bkb.I.o();
            case 1:
                return true;
        }
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
                bkb.q(f, f2, i, i2);
                return;
            default:
                wjb wjbVar = (wjb) this.c;
                if (wjbVar == null) {
                    bkb.q(f, f2, i, i2);
                    return;
                } else {
                    wjbVar.b(f, f2, i, i2);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.a) {
            case 0:
                return bkb.u3;
            case 1:
                PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) this.b;
                if (porterDuffColorFilter == null) {
                    PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                    this.b = porterDuffColorFilter2;
                    return porterDuffColorFilter2;
                }
                return porterDuffColorFilter;
            default:
                wjb wjbVar = (wjb) this.c;
                if (wjbVar == null) {
                    return bkb.u3;
                }
                return wjbVar.c();
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return bkb.T0(str);
            case 1:
                return ((f53) this.c).d(str);
            default:
                wjb wjbVar = (wjb) this.c;
                if (wjbVar == null) {
                    return bkb.T0(str);
                }
                return wjbVar.d(str);
        }
    }

    @Override
    public final boolean e() {
        byte b = this.a;
        return gba.D0;
    }

    @Override
    public final int f(int i) {
        switch (this.a) {
            case 0:
            case 1:
                return h(i);
            default:
                wjb wjbVar = (wjb) this.c;
                if (wjbVar == null) {
                    return bkb.w0(null, i, false);
                }
                return wjbVar.f(i);
        }
    }

    @Override
    public final boolean g() {
        switch (this.a) {
            case 0:
            case 1:
                return false;
            default:
                wjb wjbVar = (wjb) this.c;
                if (wjbVar == null) {
                    return bkb.b1();
                }
                return wjbVar.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
            case 1:
                return null;
            default:
                wjb wjbVar = (wjb) this.c;
                if (wjbVar == null) {
                    return bkb.P0(str);
                }
                return wjbVar.getDrawable(str);
        }
    }

    @Override
    public final int h(int i) {
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return bkb.u0(i);
            case 1:
                if (i == bkb.F8) {
                    return -14145495;
                }
                if (i != bkb.D8) {
                    if (i == bkb.g5) {
                        return -14737633;
                    }
                    if (i == bkb.i5) {
                        return -592138;
                    }
                    if (i == bkb.q5) {
                        return -8553091;
                    }
                    if (i == bkb.yf) {
                        return -16777216;
                    }
                    if (i == bkb.Bf) {
                        return -1610612736;
                    }
                    if (i == bkb.Ef || i == bkb.If || i == bkb.Df) {
                        return -9539985;
                    }
                    if (i != bkb.F6) {
                        int i2 = bkb.Ci;
                        if (i == i2) {
                            return -11754001;
                        }
                        if (i == bkb.h6) {
                            return 536870911;
                        }
                        if (i != bkb.vi && i != bkb.ui && i != bkb.wi) {
                            if (i == bkb.xi) {
                                return 352321535;
                            }
                            if (i != bkb.Af && i != i2) {
                                if (i == bkb.zf) {
                                    return 780633991;
                                }
                                if (i == bkb.Z6) {
                                    return -15921907;
                                }
                                f53 f53Var = (f53) this.c;
                                if (f53Var != null) {
                                    return f53Var.h(i);
                                }
                                return bkb.w0(null, i, false);
                            }
                            return -7895161;
                        }
                    }
                }
                return -1;
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                wjb wjbVar = (wjb) this.c;
                if (wjbVar == null) {
                    return bkb.w0(null, i, false);
                }
                return wjbVar.h(i);
        }
    }

    @Override
    public final void i(int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
                return;
            default:
                wjb wjbVar = (wjb) this.c;
                if (wjbVar != null) {
                    wjbVar.i(i, i2);
                    return;
                }
                return;
        }
    }

    @Override
    public final int j(int i) {
        switch (this.a) {
            case 0:
                return ((SparseIntArray) this.b).get(i);
            case 1:
                return h(i);
            default:
                wjb wjbVar = (wjb) this.c;
                if (wjbVar == null) {
                    return bkb.w0(null, i, false);
                }
                return wjbVar.j(i);
        }
    }

    public si5() {
        this.a = (byte) 0;
    }

    public si5(f53 f53Var) {
        this.a = (byte) 1;
        this.c = f53Var;
    }

    public void k() {
    }

    private final void l(int i, int i2) {
    }

    private final void m(int i, int i2) {
    }
}
