package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f20048a;
    public final d2 f20049b;

    public a2(d2 d2Var, int i7) {
        this.f20048a = i7;
        this.f20049b = d2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f20048a;
        d2 d2Var = this.f20049b;
        switch (i7) {
            case 0:
                r1 r1Var = d2Var.f20067c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f20067c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f56289a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f20067c.getCount() > d2Var.f20067c.getChildCount() && d2Var.f20067c.getChildCount() <= d2Var.f20075y) {
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
