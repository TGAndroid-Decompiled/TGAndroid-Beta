package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f17671a;
    public final d2 f17672b;

    public a2(d2 d2Var, int i10) {
        this.f17671a = i10;
        this.f17672b = d2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f17671a;
        d2 d2Var = this.f17672b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.f17697c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f17697c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f47105a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f17697c.getCount() > d2Var.f17697c.getChildCount() && d2Var.f17697c.getChildCount() <= d2Var.f17703x) {
                        d2Var.O.setInputMethodMode(2);
                        d2Var.h();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
