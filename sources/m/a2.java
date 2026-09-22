package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f14370a;
    public final d2 f14371b;

    public a2(d2 d2Var, int i10) {
        this.f14370a = i10;
        this.f14371b = d2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14370a;
        d2 d2Var = this.f14371b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.f14393c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f14393c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f42163a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f14393c.getCount() > d2Var.f14393c.getChildCount() && d2Var.f14393c.getChildCount() <= d2Var.f14399x) {
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
