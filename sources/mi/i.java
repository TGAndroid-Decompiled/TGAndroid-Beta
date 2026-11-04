package mi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f19677a;
    public final Object f19678b;

    public i(Object obj, int i3) {
        this.f19677a = i3;
        this.f19678b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f19677a) {
            case 0:
                ((p) this.f19678b).e0();
                return;
            case 1:
                ((c2) this.f19678b).B0();
                return;
            case 2:
                t3 t3Var = (t3) this.f19678b;
                if (view2 != null && t3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t3Var.i3 = z10;
                if (view2 instanceof h1) {
                    t3Var.T3 = (h1) view2;
                    return;
                }
                return;
            default:
                n5 n5Var = (n5) this.f19678b;
                n5Var.z();
                p5 p5Var = n5Var.f19771w;
                if (p5Var != null) {
                    p5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
