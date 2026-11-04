package m;

import java.util.WeakHashMap;
public final class a2 implements Runnable {
    public final int f18541a;
    public final d2 f18542b;

    public a2(d2 d2Var, int i3) {
        this.f18541a = i3;
        this.f18542b = d2Var;
    }

    @Override
    public final void run() {
        int i3 = this.f18541a;
        d2 d2Var = this.f18542b;
        switch (i3) {
            case 0:
                r1 r1Var = d2Var.f18560c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    return;
                }
                return;
            default:
                r1 r1Var2 = d2Var.f18560c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f54015a;
                    if (r1Var2.isAttachedToWindow() && d2Var.f18560c.getCount() > d2Var.f18560c.getChildCount() && d2Var.f18560c.getChildCount() <= d2Var.f18568y) {
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
