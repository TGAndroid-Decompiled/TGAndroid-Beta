package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f13139a;
    public final d2 f13140b;

    public a2(d2 d2Var, int i10) {
        this.f13139a = i10;
        this.f13140b = d2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f13139a;
        d2 d2Var = this.f13140b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.f13170c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f13170c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.j0.f46438a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f13170c.getCount() > d2Var.f13170c.getChildCount() && d2Var.f13170c.getChildCount() <= d2Var.f13177x) {
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
