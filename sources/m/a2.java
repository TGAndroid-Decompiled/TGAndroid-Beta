package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f15699a;
    public final d2 f15700b;

    public a2(d2 d2Var, int i10) {
        this.f15699a = i10;
        this.f15700b = d2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f15699a;
        d2 d2Var = this.f15700b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.f15724c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f15724c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f45610a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f15724c.getCount() > d2Var.f15724c.getChildCount() && d2Var.f15724c.getChildCount() <= d2Var.f15731x) {
                        d2Var.O.setInputMethodMode(2);
                        d2Var.g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
