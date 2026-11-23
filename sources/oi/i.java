package oi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f22234a;
    public final Object f22235b;

    public i(Object obj, int i7) {
        this.f22234a = i7;
        this.f22235b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f22234a) {
            case 0:
                ((p) this.f22235b).e0();
                return;
            case 1:
                ((b2) this.f22235b).B0();
                return;
            case 2:
                t3 t3Var = (t3) this.f22235b;
                if (view2 != null && t3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t3Var.f35325i3 = z10;
                if (view2 instanceof f1) {
                    t3Var.T3 = (f1) view2;
                    return;
                }
                return;
            default:
                m5 m5Var = (m5) this.f22235b;
                m5Var.z();
                o5 o5Var = m5Var.f22316w;
                if (o5Var != null) {
                    o5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
