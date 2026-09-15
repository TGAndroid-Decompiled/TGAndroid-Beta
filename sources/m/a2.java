package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f14131a;
    public final d2 f14132b;

    public a2(d2 d2Var, int i10) {
        this.f14131a = i10;
        this.f14132b = d2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14131a;
        d2 d2Var = this.f14132b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.f14154c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f14154c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f41843a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f14154c.getCount() > d2Var.f14154c.getChildCount() && d2Var.f14154c.getChildCount() <= d2Var.f14160x) {
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
