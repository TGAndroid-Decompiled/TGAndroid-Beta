package oi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f22152a;
    public final Object f22153b;

    public h(Object obj, int i7) {
        this.f22152a = i7;
        this.f22153b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f22152a) {
            case 0:
                ((o) this.f22153b).e0();
                return;
            case 1:
                ((b2) this.f22153b).B0();
                return;
            case 2:
                t3 t3Var = (t3) this.f22153b;
                if (view2 != null && t3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t3Var.f35798i3 = z10;
                if (view2 instanceof f1) {
                    t3Var.T3 = (f1) view2;
                    return;
                }
                return;
            default:
                m5 m5Var = (m5) this.f22153b;
                m5Var.z();
                o5 o5Var = m5Var.f22245w;
                if (o5Var != null) {
                    o5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
