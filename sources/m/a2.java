package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f14355a;
    public final d2 f14356b;

    public a2(d2 d2Var, int i10) {
        this.f14355a = i10;
        this.f14356b = d2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14355a;
        d2 d2Var = this.f14356b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.f14378c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f14378c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f42142a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f14378c.getCount() > d2Var.f14378c.getChildCount() && d2Var.f14378c.getChildCount() <= d2Var.f14384x) {
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
