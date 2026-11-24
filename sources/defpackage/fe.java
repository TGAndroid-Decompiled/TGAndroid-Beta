package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.ui.ActionBar.d;
public final class fe implements ylb {
    public final byte a;
    public final Object b;

    public fe(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            default:
                return cmb.I.o();
            case 3:
                return ((d38) obj).T;
            case 4:
                return ((nob) obj).f.a.a();
        }
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                cmb.q(f, f2, i, i2);
                return;
            case 4:
                tnb tnbVar = ((nob) this.b).f.a;
                if (tnbVar != null) {
                    tnbVar.b(f, f2, i, i2);
                    return;
                } else {
                    cmb.q(f, f2, i, i2);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        byte b = this.a;
        return cmb.u3;
    }

    @Override
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            default:
                return cmb.T0(str);
            case 3:
                return cmb.T0(str);
            case 4:
                return ((nob) this.b).f.a.d(str);
        }
    }

    @Override
    public final boolean e() {
        byte b = this.a;
        return gda.D0;
    }

    @Override
    public final int f(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((he) obj).e(i);
            case 1:
                return ((d) obj).getThemedColor(i);
            case 2:
                return ((yv1) obj).getThemedColor(i);
            case 3:
                return h(i);
            case 4:
                return ((nob) obj).f.a.h(i);
            default:
                return ((l7c) obj).I(i);
        }
    }

    @Override
    public final boolean g() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return false;
            case 4:
                return ((nob) this.b).f.a.g();
            default:
                return false;
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
                return null;
            case 3:
                d38 d38Var = (d38) obj;
                if (str.equals("drawableMsgIn")) {
                    return d38Var.x;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return d38Var.y;
                }
                ylb ylbVar = d38Var.s;
                if (ylbVar != null) {
                    return ylbVar.getDrawable(str);
                }
                return cmb.P0(str);
            case 4:
                rob robVar = ((nob) obj).f;
                if (str.equals("drawableMsgOut")) {
                    return robVar.T;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return robVar.U;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return robVar.V;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return robVar.W;
                }
                tnb tnbVar = robVar.a;
                if (tnbVar != null) {
                    return tnbVar.getDrawable(str);
                }
                return cmb.P0(str);
            default:
                return null;
        }
    }

    @Override
    public final int h(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((he) obj).e(i);
            case 1:
                return ((d) obj).getThemedColor(i);
            case 2:
                return ((yv1) obj).getThemedColor(i);
            case 3:
                d38 d38Var = (d38) obj;
                SparseIntArray sparseIntArray = d38Var.w;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                ylb ylbVar = d38Var.s;
                if (ylbVar != null) {
                    return ylbVar.h(i);
                }
                return cmb.w0(null, i, false);
            case 4:
                return ((nob) obj).f.a.h(i);
            default:
                return ((l7c) obj).I(i);
        }
    }

    @Override
    public final void i(int i, int i2) {
        byte b = this.a;
    }

    @Override
    public final int j(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((he) obj).e(i);
            case 1:
                return ((d) obj).getThemedColor(i);
            case 2:
                return ((yv1) obj).getThemedColor(i);
            case 3:
                return h(i);
            case 4:
                return ((nob) obj).f.a.j(i);
            default:
                return ((l7c) obj).I(i);
        }
    }

    private final void k(int i, int i2) {
    }

    private final void l(int i, int i2) {
    }

    private final void m(int i, int i2) {
    }

    private final void n(int i, int i2) {
    }

    private final void o(int i, int i2) {
    }

    private final void p(int i, int i2) {
    }
}
