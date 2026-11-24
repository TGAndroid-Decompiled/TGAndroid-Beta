package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
public final class mh1 implements wjb {
    public final nh1 a;

    public mh1(nh1 nh1Var) {
        this.a = nh1Var;
    }

    @Override
    public final boolean a() {
        return this.a.K;
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        bkb.q(f, f2, i, i2);
    }

    @Override
    public final ColorFilter c() {
        return bkb.u3;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.a.z0;
        }
        return bkb.T0(str);
    }

    @Override
    public final boolean e() {
        return gba.D0;
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
        nh1 nh1Var = this.a;
        Drawable drawable = nh1Var.y0;
        Drawable drawable2 = nh1Var.x0;
        if (str.equals("drawableMsgIn")) {
            return nh1Var.t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return nh1Var.u0;
        }
        if (str.equals("drawableMsgOut")) {
            return nh1Var.v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return nh1Var.w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(bkb.Bb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(bkb.Bb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            wjb wjbVar = nh1Var.r0;
            if (wjbVar != null) {
                return wjbVar.getDrawable(str);
            }
            return bkb.P0(str);
        }
    }

    @Override
    public final int h(int i) {
        nh1 nh1Var = this.a;
        SparseIntArray sparseIntArray = nh1Var.s0;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        wjb wjbVar = nh1Var.r0;
        if (wjbVar != null) {
            return wjbVar.h(i);
        }
        return bkb.w0(null, i, false);
    }

    @Override
    public final int j(int i) {
        return h(i);
    }

    @Override
    public final void i(int i, int i2) {
    }
}
