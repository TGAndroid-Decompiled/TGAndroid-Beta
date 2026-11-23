package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f20014a;
    public final d2 f20015b;

    public a2(d2 d2Var, int i7) {
        this.f20014a = i7;
        this.f20015b = d2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f20014a;
        d2 d2Var = this.f20015b;
        switch (i7) {
            case 0:
                r1 r1Var = d2Var.f20033c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f20033c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f56254a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f20033c.getCount() > d2Var.f20033c.getChildCount() && d2Var.f20033c.getChildCount() <= d2Var.f20041y) {
                        d2Var.P.setInputMethodMode(2);
                        d2Var.g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
