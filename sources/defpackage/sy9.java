package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class sy9 extends mz3 {
    public final int g0;
    public final vz9 h0;

    public sy9(vz9 vz9Var, Context context, ylb ylbVar, boolean z, boolean z2, int i, il9 il9Var, int i2, int i3) {
        super(context, ylbVar, z, z2, false, true, i, il9Var, i2, false);
        this.h0 = vz9Var;
        this.g0 = i3;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.l1;
    }

    @Override
    public final boolean h(int i) {
        int i2;
        int i3;
        kz9 kz9Var;
        int i4;
        int i5;
        vz9 vz9Var = this.h0;
        SparseIntArray sparseIntArray = vz9Var.y0;
        int i6 = 0;
        if (vz9Var.y1) {
            return false;
        }
        int i7 = this.g0;
        if (i7 == 4 && i == 0) {
            vz9Var.R = !vz9Var.R;
            vz9Var.e0.setVisibility(8);
            mz3 mz3Var = vz9Var.d0[vz9Var.R ? 1 : 0];
            vz9Var.e0 = mz3Var;
            mz3Var.setVisibility(0);
            jz3 jz3Var = vz9Var.e0.x;
            Context context = getContext();
            if (vz9Var.R) {
                i4 = 2131232133;
            } else {
                i4 = 2131232132;
            }
            jz3Var.setDrawable(context.getDrawable(i4));
            jz3 jz3Var2 = vz9Var.e0.x;
            if (vz9Var.R) {
                i5 = 2131754755;
            } else {
                i5 = 2131751133;
            }
            jz3Var2.setContentDescription(jb6.M0(i5, null));
            vz9Var.B(true, false, false);
            vz9Var.s0.g1(0, 0);
            return true;
        }
        jz3 jz3Var3 = this.E;
        if (jz3Var3 != null && this.b0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i8 = i2 + 1;
        if (jz3Var3 != null && this.b0 && i == 1) {
            i3 = vz9Var.n;
        } else {
            if ((i7 != 4 || i != 0) && i > 0) {
                int i9 = i - i8;
                if (sparseIntArray.indexOfKey(i9) >= 0) {
                    i3 = sparseIntArray.get(i9);
                }
            }
            i3 = 0;
        }
        if (i7 == 6) {
            i6 = 7;
        }
        vz9Var.u(i3, gm.L(i6 - 2));
        vz9Var.e0.j(i, true);
        vz9Var.i0.K1 = true;
        vz9Var.v(null, true, true);
        ny9 ny9Var = vz9Var.g0;
        if (ny9Var != null && (kz9Var = ny9Var.n) != null) {
            kz9Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(jz3 jz3Var) {
        ValueAnimator valueAnimator = this.h0.W1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        jz3Var.setScaleX(0.0f);
        jz3Var.setScaleY(0.0f);
    }
}
