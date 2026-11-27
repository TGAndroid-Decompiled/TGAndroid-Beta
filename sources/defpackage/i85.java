package defpackage;

import android.view.ViewTreeObserver;
public final class i85 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final j95 b;

    public i85(j95 j95Var, byte b) {
        this.a = b;
        this.b = j95Var;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        j95 j95Var = this.b;
        switch (b) {
            case 0:
                j95Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                j95Var.T3.h(null);
                hl.V3(j95Var.e4);
                j95Var.b.requestLayout();
                return false;
            default:
                j95Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                j95Var.T3.h(null);
                hl.V3(j95Var.e4);
                j95Var.b.requestLayout();
                return false;
        }
    }
}
