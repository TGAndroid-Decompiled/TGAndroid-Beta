package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
public class uk5 implements vnb {
    public final byte a;
    public Object b;
    public Object c;

    public uk5(vnb vnbVar) {
        this.a = (byte) 2;
        this.b = new SparseIntArray();
        this.c = vnbVar;
        k();
    }

    @Override
    public final boolean a() {
        switch (this.a) {
            case 0:
            default:
                return aob.I.o();
            case 1:
                return true;
        }
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
                aob.q(f, f2, i, i2);
                return;
            default:
                vnb vnbVar = (vnb) this.c;
                if (vnbVar == null) {
                    aob.q(f, f2, i, i2);
                    return;
                } else {
                    vnbVar.b(f, f2, i, i2);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.a) {
            case 0:
                return aob.v3;
            case 1:
                PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) this.b;
                if (porterDuffColorFilter == null) {
                    PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                    this.b = porterDuffColorFilter2;
                    return porterDuffColorFilter2;
                }
                return porterDuffColorFilter;
            default:
                vnb vnbVar = (vnb) this.c;
                if (vnbVar == null) {
                    return aob.v3;
                }
                return vnbVar.c();
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return aob.T0(str);
            case 1:
                return ((x53) this.c).d(str);
            default:
                vnb vnbVar = (vnb) this.c;
                if (vnbVar == null) {
                    return aob.T0(str);
                }
                return vnbVar.d(str);
        }
    }

    @Override
    public final boolean e() {
        byte b = this.a;
        return xea.D0;
    }

    @Override
    public final int f(int i) {
        switch (this.a) {
            case 0:
            case 1:
                return h(i);
            default:
                vnb vnbVar = (vnb) this.c;
                if (vnbVar == null) {
                    return aob.w0(null, i, false);
                }
                return vnbVar.f(i);
        }
    }

    @Override
    public final boolean g() {
        switch (this.a) {
            case 0:
            case 1:
                return false;
            default:
                vnb vnbVar = (vnb) this.c;
                if (vnbVar == null) {
                    return aob.b1();
                }
                return vnbVar.g();
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
            case 1:
                return null;
            default:
                vnb vnbVar = (vnb) this.c;
                if (vnbVar == null) {
                    return aob.P0(str);
                }
                return vnbVar.getDrawable(str);
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
                return aob.u0(i);
            case 1:
                if (i == aob.G8) {
                    return -14145495;
                }
                if (i != aob.E8) {
                    if (i == aob.h5) {
                        return -14737633;
                    }
                    if (i == aob.j5) {
                        return -592138;
                    }
                    if (i == aob.r5) {
                        return -8553091;
                    }
                    if (i == aob.zf) {
                        return -16777216;
                    }
                    if (i == aob.Cf) {
                        return -1610612736;
                    }
                    if (i == aob.Ff || i == aob.Jf || i == aob.Ef) {
                        return -9539985;
                    }
                    if (i != aob.G6) {
                        int i2 = aob.Di;
                        if (i == i2) {
                            return -11754001;
                        }
                        if (i == aob.i6) {
                            return 536870911;
                        }
                        if (i != aob.wi && i != aob.vi && i != aob.xi) {
                            if (i == aob.yi) {
                                return 352321535;
                            }
                            if (i != aob.Bf && i != i2) {
                                if (i == aob.Af) {
                                    return 780633991;
                                }
                                if (i == aob.a7) {
                                    return -15921907;
                                }
                                x53 x53Var = (x53) this.c;
                                if (x53Var != null) {
                                    return x53Var.h(i);
                                }
                                return aob.w0(null, i, false);
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
                vnb vnbVar = (vnb) this.c;
                if (vnbVar == null) {
                    return aob.w0(null, i, false);
                }
                return vnbVar.h(i);
        }
    }

    @Override
    public final void i(int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
                return;
            default:
                vnb vnbVar = (vnb) this.c;
                if (vnbVar != null) {
                    vnbVar.i(i, i2);
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
                vnb vnbVar = (vnb) this.c;
                if (vnbVar == null) {
                    return aob.w0(null, i, false);
                }
                return vnbVar.j(i);
        }
    }

    public uk5() {
        this.a = (byte) 0;
    }

    public uk5(x53 x53Var) {
        this.a = (byte) 1;
        this.c = x53Var;
    }

    public void k() {
    }

    private final void l(int i, int i2) {
    }

    private final void m(int i, int i2) {
    }
}
