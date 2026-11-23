package oi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f22155a;
    public final Object f22156b;

    public h(Object obj, int i7) {
        this.f22155a = i7;
        this.f22156b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f22155a) {
            case 0:
                ((o) this.f22156b).e0();
                return;
            case 1:
                ((b2) this.f22156b).B0();
                return;
            case 2:
                t3 t3Var = (t3) this.f22156b;
                if (view2 != null && t3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t3Var.f35792i3 = z10;
                if (view2 instanceof f1) {
                    t3Var.T3 = (f1) view2;
                    return;
                }
                return;
            default:
                m5 m5Var = (m5) this.f22156b;
                m5Var.z();
                o5 o5Var = m5Var.f22248w;
                if (o5Var != null) {
                    o5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
