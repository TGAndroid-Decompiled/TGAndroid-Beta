package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f13141a;
    public final d2 f13142b;

    public a2(d2 d2Var, int i10) {
        this.f13141a = i10;
        this.f13142b = d2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f13141a;
        d2 d2Var = this.f13142b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.f13172c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f13172c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.j0.f46469a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f13172c.getCount() > d2Var.f13172c.getChildCount() && d2Var.f13172c.getChildCount() <= d2Var.f13179x) {
                        d2Var.L.setInputMethodMode(2);
                        d2Var.g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
