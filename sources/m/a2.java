package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f12369a;
    public final d2 f12370b;

    public a2(d2 d2Var, int i10) {
        this.f12369a = i10;
        this.f12370b = d2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f12369a;
        d2 d2Var = this.f12370b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.f12392c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f12392c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.h0.f46123a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f12392c.getCount() > d2Var.f12392c.getChildCount() && d2Var.f12392c.getChildCount() <= d2Var.f12399y) {
                        d2Var.O.setInputMethodMode(2);
                        d2Var.h();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
