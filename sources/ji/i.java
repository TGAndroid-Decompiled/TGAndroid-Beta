package ji;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f13998a;
    public final Object f13999b;

    public i(Object obj, int i10) {
        this.f13998a = i10;
        this.f13999b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f13998a) {
            case 0:
                ((r) this.f13999b).Z();
                return;
            case 1:
                ((c2) this.f13999b).w0();
                return;
            case 2:
                v3 v3Var = (v3) this.f13999b;
                if (view2 != null && v3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v3Var.f25306a3 = z10;
                if (view2 instanceof h1) {
                    v3Var.L3 = (h1) view2;
                    return;
                }
                return;
            default:
                s5 s5Var = (s5) this.f13999b;
                s5Var.x();
                u5 u5Var = s5Var.v;
                if (u5Var != null) {
                    u5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
