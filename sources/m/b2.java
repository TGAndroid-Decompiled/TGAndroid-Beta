package m;

import java.util.WeakHashMap;
public final class b2 implements Runnable {
    public final int f16901a;
    public final e2 f16902b;

    public b2(e2 e2Var, int i9) {
        this.f16901a = i9;
        this.f16902b = e2Var;
    }

    @Override
    public final void run() {
        int i9 = this.f16901a;
        e2 e2Var = this.f16902b;
        switch (i9) {
            case 0:
                s1 s1Var = e2Var.f16932c;
                if (s1Var != null) {
                    s1Var.setListSelectionHidden(true);
                    s1Var.requestLayout();
                    return;
                }
                return;
            default:
                s1 s1Var2 = e2Var.f16932c;
                if (s1Var2 != null) {
                    WeakHashMap weakHashMap = r0.j0.f46915a;
                    if (s1Var2.isAttachedToWindow() && e2Var.f16932c.getCount() > e2Var.f16932c.getChildCount() && e2Var.f16932c.getChildCount() <= e2Var.f16939x) {
                        e2Var.K.setInputMethodMode(2);
                        e2Var.g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
