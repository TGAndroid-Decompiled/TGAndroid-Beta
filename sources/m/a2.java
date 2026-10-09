package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f15627a;
    public final d2 f15628b;

    public a2(d2 d2Var, int i10) {
        this.f15627a = i10;
        this.f15628b = d2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f15627a;
        d2 d2Var = this.f15628b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.f15652c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f15652c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f46766a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f15652c.getCount() > d2Var.f15652c.getChildCount() && d2Var.f15652c.getChildCount() <= d2Var.f15659x) {
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
