package ii;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f11409a;
    public final Object f11410b;

    public i(Object obj, int i10) {
        this.f11409a = i10;
        this.f11410b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f11409a) {
            case 0:
                ((r) this.f11410b).Z();
                return;
            case 1:
                ((e2) this.f11410b).w0();
                return;
            case 2:
                x3 x3Var = (x3) this.f11410b;
                if (view2 != null && x3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x3Var.f27884a3 = z10;
                if (view2 instanceof i1) {
                    x3Var.L3 = (i1) view2;
                    return;
                }
                return;
            default:
                p5 p5Var = (p5) this.f11410b;
                p5Var.x();
                r5 r5Var = p5Var.v;
                if (r5Var != null) {
                    r5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
