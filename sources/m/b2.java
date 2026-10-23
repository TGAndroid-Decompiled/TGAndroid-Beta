package m;

import java.util.WeakHashMap;
public final class b2 implements Runnable {
    public final int f16223a;
    public final e2 f16224b;

    public b2(e2 e2Var, int i10) {
        this.f16223a = i10;
        this.f16224b = e2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f16223a;
        e2 e2Var = this.f16224b;
        switch (i10) {
            case 0:
                s1 s1Var = e2Var.f16249c;
                if (s1Var != null) {
                    s1Var.setListSelectionHidden(true);
                    s1Var.requestLayout();
                    return;
                }
                return;
            default:
                s1 s1Var2 = e2Var.f16249c;
                if (s1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f45242a;
                    if (s1Var2.isAttachedToWindow() && e2Var.f16249c.getCount() > e2Var.f16249c.getChildCount() && e2Var.f16249c.getChildCount() <= e2Var.f16255x) {
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
