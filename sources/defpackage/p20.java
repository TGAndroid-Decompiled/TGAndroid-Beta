package defpackage;

import android.app.Activity;
public final class p20 extends r59 {
    public boolean f3;
    public final i30 g3;

    public p20(i30 i30Var, Activity activity) {
        super(activity, null);
        this.g3 = i30Var;
    }

    @Override
    public final boolean F0(float f) {
        i30 i30Var = this.g3;
        if (f < i30Var.x1.getY() - i30Var.r1.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i30 i30Var = this.g3;
        int i5 = i30Var.l2;
        if (i5 != -1 && !i30Var.m1.o0) {
            this.f3 = true;
            i30Var.s1.g1(i5, i30Var.m2 - i30Var.r1.getPaddingTop());
            super.onLayout(false, i, i2, i3, i4);
            this.f3 = false;
            i30Var.l2 = -1;
        } else if (i30Var.k2) {
            i30Var.k2 = false;
            this.f3 = true;
            if (i30Var.M0(true)) {
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
