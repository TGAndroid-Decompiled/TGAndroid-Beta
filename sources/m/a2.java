package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f19653a;
    public final d2 f19654b;

    public a2(d2 d2Var, int i7) {
        this.f19653a = i7;
        this.f19654b = d2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f19653a;
        d2 d2Var = this.f19654b;
        switch (i7) {
            case 0:
                r1 r1Var = d2Var.f19672c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f19672c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f55671a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f19672c.getCount() > d2Var.f19672c.getChildCount() && d2Var.f19672c.getChildCount() <= d2Var.f19680y) {
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
