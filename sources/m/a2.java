package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f20111a;
    public final d2 f20112b;

    public a2(d2 d2Var, int i7) {
        this.f20111a = i7;
        this.f20112b = d2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f20111a;
        d2 d2Var = this.f20112b;
        switch (i7) {
            case 0:
                r1 r1Var = d2Var.f20130c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f20130c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f56367a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f20130c.getCount() > d2Var.f20130c.getChildCount() && d2Var.f20130c.getChildCount() <= d2Var.f20138y) {
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
