package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f14122a;
    public final d2 f14123b;

    public a2(d2 d2Var, int i10) {
        this.f14122a = i10;
        this.f14123b = d2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14122a;
        d2 d2Var = this.f14123b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.f14145c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f14145c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f41795a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f14145c.getCount() > d2Var.f14145c.getChildCount() && d2Var.f14145c.getChildCount() <= d2Var.f14151x) {
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
