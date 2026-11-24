package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
public class rk5 implements ylb {
    public final byte a;
    public Object b;
    public Object c;

    public rk5(ylb ylbVar) {
        this.a = (byte) 2;
        this.b = new SparseIntArray();
        this.c = ylbVar;
        k();
    }

    @Override
    public final boolean a() {
        switch (this.a) {
            case 0:
            default:
                return cmb.I.o();
            case 1:
                return true;
        }
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
                cmb.q(f, f2, i, i2);
                return;
            default:
                ylb ylbVar = (ylb) this.c;
                if (ylbVar == null) {
                    cmb.q(f, f2, i, i2);
                    return;
                } else {
                    ylbVar.b(f, f2, i, i2);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.a) {
            case 0:
                return cmb.u3;
            case 1:
                PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) this.b;
                if (porterDuffColorFilter == null) {
                    PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                    this.b = porterDuffColorFilter2;
                    return porterDuffColorFilter2;
                }
                return porterDuffColorFilter;
            default:
                ylb ylbVar = (ylb) this.c;
                if (ylbVar == null) {
                    return cmb.u3;
                }
                return ylbVar.c();
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return cmb.T0(str);
            case 1:
                return ((r63) this.c).d(str);
            default:
                ylb ylbVar = (ylb) this.c;
                if (ylbVar == null) {
                    return cmb.T0(str);
                }
                return ylbVar.d(str);
        }
    }

    @Override
    public final boolean e() {
        byte b = this.a;
        return gda.D0;
    }

    @Override
    public final int f(int i) {
        switch (this.a) {
            case 0:
            case 1:
                return h(i);
            default:
                ylb ylbVar = (ylb) this.c;
                if (ylbVar == null) {
                    return cmb.w0(null, i, false);
                }
                return ylbVar.f(i);
        }
    }

    @Override
    public final boolean g() {
        switch (this.a) {
            case 0:
            case 1:
                return false;
            default:
                ylb ylbVar = (ylb) this.c;
                if (ylbVar == null) {
                    return cmb.b1();
                }
                return ylbVar.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
            case 1:
                return null;
            default:
                ylb ylbVar = (ylb) this.c;
                if (ylbVar == null) {
                    return cmb.P0(str);
                }
                return ylbVar.getDrawable(str);
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
                return cmb.u0(i);
            case 1:
                if (i == cmb.F8) {
                    return -14145495;
                }
                if (i != cmb.D8) {
                    if (i == cmb.g5) {
                        return -14737633;
                    }
                    if (i == cmb.i5) {
                        return -592138;
                    }
                    if (i == cmb.q5) {
                        return -8553091;
                    }
                    if (i == cmb.yf) {
                        return -16777216;
                    }
                    if (i == cmb.Bf) {
                        return -1610612736;
                    }
                    if (i == cmb.Ef || i == cmb.If || i == cmb.Df) {
                        return -9539985;
                    }
                    if (i != cmb.F6) {
                        int i2 = cmb.Ci;
                        if (i == i2) {
                            return -11754001;
                        }
                        if (i == cmb.h6) {
                            return 536870911;
                        }
                        if (i != cmb.vi && i != cmb.ui && i != cmb.wi) {
                            if (i == cmb.xi) {
                                return 352321535;
                            }
                            if (i != cmb.Af && i != i2) {
                                if (i == cmb.zf) {
                                    return 780633991;
                                }
                                if (i == cmb.Z6) {
                                    return -15921907;
                                }
                                r63 r63Var = (r63) this.c;
                                if (r63Var != null) {
                                    return r63Var.h(i);
                                }
                                return cmb.w0(null, i, false);
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
                ylb ylbVar = (ylb) this.c;
                if (ylbVar == null) {
                    return cmb.w0(null, i, false);
                }
                return ylbVar.h(i);
        }
    }

    @Override
    public final void i(int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
                return;
            default:
                ylb ylbVar = (ylb) this.c;
                if (ylbVar != null) {
                    ylbVar.i(i, i2);
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
                ylb ylbVar = (ylb) this.c;
                if (ylbVar == null) {
                    return cmb.w0(null, i, false);
                }
                return ylbVar.j(i);
        }
    }

    public rk5() {
        this.a = (byte) 0;
    }

    public rk5(r63 r63Var) {
        this.a = (byte) 1;
        this.c = r63Var;
    }

    public void k() {
    }

    private final void l(int i, int i2) {
    }

    private final void m(int i, int i2) {
    }
}
