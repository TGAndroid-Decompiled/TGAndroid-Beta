package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
public final class j0a extends xy3 {
    public final int g0;
    public final n1a h0;

    public j0a(n1a n1aVar, Context context, vnb vnbVar, boolean z, boolean z2, int i, en9 en9Var, int i2, int i3) {
        super(context, vnbVar, z, z2, false, true, i, en9Var, i2, false);
        this.h0 = n1aVar;
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
        b1a b1aVar;
        int i4;
        int i5;
        n1a n1aVar = this.h0;
        SparseIntArray sparseIntArray = n1aVar.y0;
        int i6 = 0;
        if (n1aVar.y1) {
            return false;
        }
        int i7 = this.g0;
        if (i7 == 4 && i == 0) {
            n1aVar.R = !n1aVar.R;
            n1aVar.e0.setVisibility(8);
            xy3 xy3Var = n1aVar.d0[n1aVar.R ? 1 : 0];
            n1aVar.e0 = xy3Var;
            xy3Var.setVisibility(0);
            uy3 uy3Var = n1aVar.e0.x;
            Context context = getContext();
            if (n1aVar.R) {
                i4 = 2131232132;
            } else {
                i4 = 2131232131;
            }
            uy3Var.setDrawable(context.getDrawable(i4));
            uy3 uy3Var2 = n1aVar.e0.x;
            if (n1aVar.R) {
                i5 = 2131754751;
            } else {
                i5 = 2131751161;
            }
            uy3Var2.setContentDescription(ob6.M0(i5, null));
            n1aVar.B(true, false, false);
            n1aVar.s0.g1(0, 0);
            return true;
        }
        uy3 uy3Var3 = this.E;
        if (uy3Var3 != null && this.b0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i8 = i2 + 1;
        if (uy3Var3 != null && this.b0 && i == 1) {
            i3 = n1aVar.n;
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
        n1aVar.u(i3, hl.L(i6 - 2));
        n1aVar.e0.j(i, true);
        n1aVar.i0.K1 = true;
        n1aVar.v(null, true, true);
        e0a e0aVar = n1aVar.g0;
        if (e0aVar != null && (b1aVar = e0aVar.n) != null) {
            b1aVar.J1(null);
        }
        return true;
    }

    @Override
    public final void i(uy3 uy3Var) {
        ValueAnimator valueAnimator = this.h0.W1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        uy3Var.setScaleX(0.0f);
        uy3Var.setScaleY(0.0f);
    }
}
