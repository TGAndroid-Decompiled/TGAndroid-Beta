package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
public final class ui1 implements ylb {
    public final vi1 a;

    public ui1(vi1 vi1Var) {
        this.a = vi1Var;
    }

    @Override
    public final boolean a() {
        return this.a.K;
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        cmb.q(f, f2, i, i2);
    }

    @Override
    public final ColorFilter c() {
        return cmb.u3;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.a.z0;
        }
        return cmb.T0(str);
    }

    @Override
    public final boolean e() {
        return gda.D0;
    }

    @Override
    public final int f(int i) {
        return h(i);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        vi1 vi1Var = this.a;
        Drawable drawable = vi1Var.y0;
        Drawable drawable2 = vi1Var.x0;
        if (str.equals("drawableMsgIn")) {
            return vi1Var.t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return vi1Var.u0;
        }
        if (str.equals("drawableMsgOut")) {
            return vi1Var.v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return vi1Var.w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(cmb.Bb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(cmb.Bb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            ylb ylbVar = vi1Var.r0;
            if (ylbVar != null) {
                return ylbVar.getDrawable(str);
            }
            return cmb.P0(str);
        }
    }

    @Override
    public final int h(int i) {
        vi1 vi1Var = this.a;
        SparseIntArray sparseIntArray = vi1Var.s0;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        ylb ylbVar = vi1Var.r0;
        if (ylbVar != null) {
            return ylbVar.h(i);
        }
        return cmb.w0(null, i, false);
    }

    @Override
    public final int j(int i) {
        return h(i);
    }

    @Override
    public final void i(int i, int i2) {
    }
}
