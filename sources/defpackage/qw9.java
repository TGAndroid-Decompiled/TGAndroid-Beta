package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class qw9 extends cy3 {
    public final int g0;
    public final tx9 h0;

    public qw9(tx9 tx9Var, Context context, wjb wjbVar, boolean z, boolean z2, int i, tj9 tj9Var, int i2, int i3) {
        super(context, wjbVar, z, z2, false, true, i, tj9Var, i2, false);
        this.h0 = tx9Var;
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
        ix9 ix9Var;
        int i4;
        int i5;
        tx9 tx9Var = this.h0;
        SparseIntArray sparseIntArray = tx9Var.y0;
        int i6 = 0;
        if (tx9Var.y1) {
            return false;
        }
        int i7 = this.g0;
        if (i7 == 4 && i == 0) {
            tx9Var.R = !tx9Var.R;
            tx9Var.e0.setVisibility(8);
            cy3 cy3Var = tx9Var.d0[tx9Var.R ? 1 : 0];
            tx9Var.e0 = cy3Var;
            cy3Var.setVisibility(0);
            zx3 zx3Var = tx9Var.e0.x;
            Context context = getContext();
            if (tx9Var.R) {
                i4 = 2131232132;
            } else {
                i4 = 2131232131;
            }
            zx3Var.setDrawable(context.getDrawable(i4));
            zx3 zx3Var2 = tx9Var.e0.x;
            if (tx9Var.R) {
                i5 = 2131754755;
            } else {
                i5 = 2131751184;
            }
            zx3Var2.setContentDescription(k96.M0(i5, null));
            tx9Var.B(true, false, false);
            tx9Var.s0.g1(0, 0);
            return true;
        }
        zx3 zx3Var3 = this.E;
        if (zx3Var3 != null && this.b0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i8 = i2 + 1;
        if (zx3Var3 != null && this.b0 && i == 1) {
            i3 = tx9Var.n;
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
        tx9Var.u(i3, gl.L(i6 - 2));
        tx9Var.e0.j(i, true);
        tx9Var.i0.K1 = true;
        tx9Var.v(null, true, true);
        lw9 lw9Var = tx9Var.g0;
        if (lw9Var != null && (ix9Var = lw9Var.n) != null) {
            ix9Var.I1(null);
        }
        return true;
    }

    @Override
    public final void i(zx3 zx3Var) {
        ValueAnimator valueAnimator = this.h0.W1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        zx3Var.setScaleX(0.0f);
        zx3Var.setScaleY(0.0f);
    }
}
