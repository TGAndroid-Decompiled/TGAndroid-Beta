package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f14375a;
    public final d2 f14376b;

    public a2(d2 d2Var, int i10) {
        this.f14375a = i10;
        this.f14376b = d2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14375a;
        d2 d2Var = this.f14376b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.f14398c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f14398c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f42128a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f14398c.getCount() > d2Var.f14398c.getChildCount() && d2Var.f14398c.getChildCount() <= d2Var.f14404x) {
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
