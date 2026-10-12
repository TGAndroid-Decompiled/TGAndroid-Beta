package m;

import java.util.WeakHashMap;
public final class b2 implements Runnable {
    public final int f15385a;
    public final e2 f15386b;

    public b2(e2 e2Var, int i10) {
        this.f15385a = i10;
        this.f15386b = e2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f15385a;
        e2 e2Var = this.f15386b;
        switch (i10) {
            case 0:
                s1 s1Var = e2Var.f15412c;
                if (s1Var != null) {
                    s1Var.setListSelectionHidden(true);
                    s1Var.requestLayout();
                    return;
                }
                return;
            default:
                s1 s1Var2 = e2Var.f15412c;
                if (s1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f46989a;
                    if (s1Var2.isAttachedToWindow() && e2Var.f15412c.getCount() > e2Var.f15412c.getChildCount() && e2Var.f15412c.getChildCount() <= e2Var.f15419x) {
                        e2Var.O.setInputMethodMode(2);
                        e2Var.g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
