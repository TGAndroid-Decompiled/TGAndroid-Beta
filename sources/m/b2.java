package m;

import java.util.WeakHashMap;
public final class b2 implements Runnable {
    public final int f19076a;
    public final e2 f19077b;

    public b2(e2 e2Var, int i7) {
        this.f19076a = i7;
        this.f19077b = e2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f19076a;
        e2 e2Var = this.f19077b;
        switch (i7) {
            case 0:
                s1 s1Var = e2Var.f19095c;
                if (s1Var != null) {
                    s1Var.setListSelectionHidden(true);
                    s1Var.requestLayout();
                    return;
                }
                return;
            default:
                s1 s1Var2 = e2Var.f19095c;
                if (s1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f54202a;
                    if (s1Var2.isAttachedToWindow() && e2Var.f19095c.getCount() > e2Var.f19095c.getChildCount() && e2Var.f19095c.getChildCount() <= e2Var.f19103y) {
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
