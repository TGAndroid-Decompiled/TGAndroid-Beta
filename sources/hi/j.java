package hi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class j implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f9666a;
    public final Object f9667b;

    public j(Object obj, int i10) {
        this.f9666a = i10;
        this.f9667b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f9666a) {
            case 0:
                ((s) this.f9667b).Z();
                return;
            case 1:
                ((g2) this.f9667b).w0();
                return;
            case 2:
                z3 z3Var = (z3) this.f9667b;
                if (view2 != null && z3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z3Var.f26604a3 = z10;
                if (view2 instanceof k1) {
                    z3Var.L3 = (k1) view2;
                    return;
                }
                return;
            default:
                r5 r5Var = (r5) this.f9667b;
                r5Var.x();
                t5 t5Var = r5Var.v;
                if (t5Var != null) {
                    t5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
