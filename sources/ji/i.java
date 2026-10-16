package ji;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f13319a;
    public final Object f13320b;

    public i(Object obj, int i10) {
        this.f13319a = i10;
        this.f13320b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f13319a) {
            case 0:
                ((r) this.f13320b).c0();
                return;
            case 1:
                ((d2) this.f13320b).w0();
                return;
            case 2:
                x3 x3Var = (x3) this.f13320b;
                if (view2 != null && x3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x3Var.Y2 = z10;
                if (view2 instanceof h1) {
                    x3Var.J3 = (h1) view2;
                    return;
                }
                return;
            default:
                u5 u5Var = (u5) this.f13320b;
                u5Var.x();
                w5 w5Var = u5Var.v;
                if (w5Var != null) {
                    w5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
