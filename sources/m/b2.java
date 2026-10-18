package m;

import java.util.WeakHashMap;
public final class b2 implements Runnable {
    public final int f16159a;
    public final e2 f16160b;

    public b2(e2 e2Var, int i10) {
        this.f16159a = i10;
        this.f16160b = e2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f16159a;
        e2 e2Var = this.f16160b;
        switch (i10) {
            case 0:
                s1 s1Var = e2Var.f16185c;
                if (s1Var != null) {
                    s1Var.setListSelectionHidden(true);
                    s1Var.requestLayout();
                    return;
                }
                return;
            default:
                s1 s1Var2 = e2Var.f16185c;
                if (s1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.f44818a;
                    if (s1Var2.isAttachedToWindow() && e2Var.f16185c.getCount() > e2Var.f16185c.getChildCount() && e2Var.f16185c.getChildCount() <= e2Var.f16191x) {
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
