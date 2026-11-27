package defpackage;

import android.app.Activity;
public final class q10 extends d79 {
    public boolean f3;
    public final j20 g3;

    public q10(j20 j20Var, Activity activity) {
        super(activity, null);
        this.g3 = j20Var;
    }

    @Override
    public final boolean G0(float f) {
        j20 j20Var = this.g3;
        if (f < j20Var.x1.getY() - j20Var.r1.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        j20 j20Var = this.g3;
        int i5 = j20Var.l2;
        if (i5 != -1 && !j20Var.m1.o0) {
            this.f3 = true;
            j20Var.s1.g1(i5, j20Var.m2 - j20Var.r1.getPaddingTop());
            super.onLayout(false, i, i2, i3, i4);
            this.f3 = false;
            j20Var.l2 = -1;
        } else if (j20Var.k2) {
            j20Var.k2 = false;
            this.f3 = true;
            if (j20Var.N0(true)) {
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
