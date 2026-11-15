package oi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f21717a;
    public final Object f21718b;

    public h(Object obj, int i7) {
        this.f21717a = i7;
        this.f21718b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f21717a) {
            case 0:
                ((o) this.f21718b).e0();
                return;
            case 1:
                ((z1) this.f21718b).B0();
                return;
            case 2:
                q3 q3Var = (q3) this.f21718b;
                if (view2 != null && q3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q3Var.f39897i3 = z10;
                if (view2 instanceof e1) {
                    q3Var.T3 = (e1) view2;
                    return;
                }
                return;
            default:
                k5 k5Var = (k5) this.f21718b;
                k5Var.z();
                m5 m5Var = k5Var.f21778w;
                if (m5Var != null) {
                    m5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
