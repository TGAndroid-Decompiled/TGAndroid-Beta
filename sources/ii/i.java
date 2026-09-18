package ii;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f11427a;
    public final Object f11428b;

    public i(Object obj, int i10) {
        this.f11427a = i10;
        this.f11428b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f11427a) {
            case 0:
                ((r) this.f11428b).Z();
                return;
            case 1:
                ((d2) this.f11428b).w0();
                return;
            case 2:
                w3 w3Var = (w3) this.f11428b;
                if (view2 != null && w3Var.G(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w3Var.f23798a3 = z10;
                if (view2 instanceof i1) {
                    w3Var.L3 = (i1) view2;
                    return;
                }
                return;
            default:
                o5 o5Var = (o5) this.f11428b;
                o5Var.x();
                q5 q5Var = o5Var.v;
                if (q5Var != null) {
                    q5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
