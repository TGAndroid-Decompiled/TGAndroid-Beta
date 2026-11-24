package defpackage;

import android.app.Activity;
public final class p10 extends o39 {
    public boolean f3;
    public final i20 g3;

    public p10(i20 i20Var, Activity activity) {
        super(activity, null);
        this.g3 = i20Var;
    }

    @Override
    public final boolean F0(float f) {
        i20 i20Var = this.g3;
        if (f < i20Var.x1.getY() - i20Var.r1.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i20 i20Var = this.g3;
        int i5 = i20Var.l2;
        if (i5 != -1 && !i20Var.m1.o0) {
            this.f3 = true;
            i20Var.s1.g1(i5, i20Var.m2 - i20Var.r1.getPaddingTop());
            super.onLayout(false, i, i2, i3, i4);
            this.f3 = false;
            i20Var.l2 = -1;
        } else if (i20Var.k2) {
            i20Var.k2 = false;
            this.f3 = true;
            if (i20Var.M0(true)) {
                super.onLayout(false, i, i2, i3, i4);
            }
            this.f3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
