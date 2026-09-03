package m;

import java.util.WeakHashMap;
public final class b2 implements Runnable {
    public final int f13446a;
    public final e2 f13447b;

    public b2(e2 e2Var, int i10) {
        this.f13446a = i10;
        this.f13447b = e2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f13446a;
        e2 e2Var = this.f13447b;
        switch (i10) {
            case 0:
                s1 s1Var = e2Var.f13476c;
                if (s1Var != null) {
                    s1Var.setListSelectionHidden(true);
                    s1Var.requestLayout();
                    return;
                }
                return;
            default:
                s1 s1Var2 = e2Var.f13476c;
                if (s1Var2 != null) {
                    WeakHashMap weakHashMap = r0.j0.f43142a;
                    if (s1Var2.isAttachedToWindow() && e2Var.f13476c.getCount() > e2Var.f13476c.getChildCount() && e2Var.f13476c.getChildCount() <= e2Var.f13482x) {
                        e2Var.L.setInputMethodMode(2);
                        e2Var.g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
