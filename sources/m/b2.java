package m;

import java.util.WeakHashMap;
public final class b2 implements Runnable {
    public final int f16500a;
    public final e2 f16501b;

    public b2(e2 e2Var, int i10) {
        this.f16500a = i10;
        this.f16501b = e2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f16500a;
        e2 e2Var = this.f16501b;
        switch (i10) {
            case 0:
                s1 s1Var = e2Var.f16531c;
                if (s1Var != null) {
                    s1Var.setListSelectionHidden(true);
                    s1Var.requestLayout();
                    return;
                }
                return;
            default:
                s1 s1Var2 = e2Var.f16531c;
                if (s1Var2 != null) {
                    WeakHashMap weakHashMap = r0.j0.f46829a;
                    if (s1Var2.isAttachedToWindow() && e2Var.f16531c.getCount() > e2Var.f16531c.getChildCount() && e2Var.f16531c.getChildCount() <= e2Var.f16538x) {
                        e2Var.K.setInputMethodMode(2);
                        e2Var.h();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
