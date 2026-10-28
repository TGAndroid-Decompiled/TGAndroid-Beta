package li;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f17290a;
    public final Object f17291b;

    public i(Object obj, int i10) {
        this.f17290a = i10;
        this.f17291b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f17290a) {
            case 0:
                ((q) this.f17291b).c0();
                return;
            case 1:
                ((b2) this.f17291b).x0();
                return;
            case 2:
                v3 v3Var = (v3) this.f17291b;
                if (view2 != null && v3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v3Var.f32506i3 = z10;
                if (view2 instanceof g1) {
                    v3Var.T3 = (g1) view2;
                    return;
                }
                return;
            default:
                p5 p5Var = (p5) this.f17291b;
                p5Var.w();
                r5 r5Var = p5Var.v;
                if (r5Var != null) {
                    r5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
