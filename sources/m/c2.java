package m;

import java.util.WeakHashMap;
public final class c2 implements Runnable {
    public final int f14806a;
    public final f2 f14807b;

    public c2(f2 f2Var, int i10) {
        this.f14806a = i10;
        this.f14807b = f2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f14806a;
        f2 f2Var = this.f14807b;
        switch (i10) {
            case 0:
                t1 t1Var = f2Var.f14835c;
                if (t1Var != null) {
                    t1Var.setListSelectionHidden(true);
                    t1Var.requestLayout();
                    return;
                }
                return;
            default:
                t1 t1Var2 = f2Var.f14835c;
                if (t1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f43485a;
                    if (t1Var2.isAttachedToWindow() && f2Var.f14835c.getCount() > f2Var.f14835c.getChildCount() && f2Var.f14835c.getChildCount() <= f2Var.f14841x) {
                        f2Var.O.setInputMethodMode(2);
                        f2Var.g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
