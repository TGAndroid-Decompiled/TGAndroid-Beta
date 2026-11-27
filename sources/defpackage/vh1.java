package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
public final class vh1 implements vnb {
    public final wh1 a;

    public vh1(wh1 wh1Var) {
        this.a = wh1Var;
    }

    @Override
    public final boolean a() {
        return this.a.K;
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        aob.q(f, f2, i, i2);
    }

    @Override
    public final ColorFilter c() {
        return aob.v3;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.a.z0;
        }
        return aob.T0(str);
    }

    @Override
    public final boolean e() {
        return xea.D0;
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
        wh1 wh1Var = this.a;
        Drawable drawable = wh1Var.y0;
        Drawable drawable2 = wh1Var.x0;
        if (str.equals("drawableMsgIn")) {
            return wh1Var.t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return wh1Var.u0;
        }
        if (str.equals("drawableMsgOut")) {
            return wh1Var.v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return wh1Var.w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(aob.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        } else if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(aob.Cb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        } else {
            vnb vnbVar = wh1Var.r0;
            if (vnbVar != null) {
                return vnbVar.getDrawable(str);
            }
            return aob.P0(str);
        }
    }

    @Override
    public final int h(int i) {
        wh1 wh1Var = this.a;
        SparseIntArray sparseIntArray = wh1Var.s0;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        vnb vnbVar = wh1Var.r0;
        if (vnbVar != null) {
            return vnbVar.h(i);
        }
        return aob.w0(null, i, false);
    }

    @Override
    public final int j(int i) {
        return h(i);
    }

    @Override
    public final void i(int i, int i2) {
    }
}
