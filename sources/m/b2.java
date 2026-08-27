package m;

import java.util.WeakHashMap;

public final class b2 implements Runnable {

    public final int f17276a;

    public final e2 f17277b;

    public b2(e2 e2Var, int i10) {
        this.f17276a = i10;
        this.f17277b = e2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f17276a;
        e2 e2Var = this.f17277b;
        switch (i10) {
            case 0:
                s1 s1Var = e2Var.f17307c;
                if (s1Var != null) {
                    s1Var.setListSelectionHidden(true);
                    s1Var.requestLayout();
                }
                break;
            default:
                s1 s1Var2 = e2Var.f17307c;
                if (s1Var2 != null) {
                    WeakHashMap weakHashMap = r0.j0.f46605a;
                    if (s1Var2.isAttachedToWindow() && e2Var.f17307c.getCount() > e2Var.f17307c.getChildCount() && e2Var.f17307c.getChildCount() <= e2Var.f17314x) {
                        e2Var.K.setInputMethodMode(2);
                        e2Var.g();
                        break;
                    }
                }
                break;
        }
    }
}
