package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f20020a;
    public final d2 f20021b;

    public a2(d2 d2Var, int i7) {
        this.f20020a = i7;
        this.f20021b = d2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f20020a;
        d2 d2Var = this.f20021b;
        switch (i7) {
            case 0:
                r1 r1Var = d2Var.f20039c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f20039c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f56244a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f20039c.getCount() > d2Var.f20039c.getChildCount() && d2Var.f20039c.getChildCount() <= d2Var.f20047y) {
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
