package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f14402a;
    public final d2 f14403b;

    public a2(d2 d2Var, int i10) {
        this.f14402a = i10;
        this.f14403b = d2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14402a;
        d2 d2Var = this.f14403b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.f14425c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f14425c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f42173a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f14425c.getCount() > d2Var.f14425c.getChildCount() && d2Var.f14425c.getChildCount() <= d2Var.f14431x) {
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
