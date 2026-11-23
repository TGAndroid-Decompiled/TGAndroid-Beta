package oi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f22104a;
    public final Object f22105b;

    public h(Object obj, int i7) {
        this.f22104a = i7;
        this.f22105b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f22104a) {
            case 0:
                ((o) this.f22105b).e0();
                return;
            case 1:
                ((a2) this.f22105b).B0();
                return;
            case 2:
                s3 s3Var = (s3) this.f22105b;
                if (view2 != null && s3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s3Var.f35744i3 = z10;
                if (view2 instanceof e1) {
                    s3Var.T3 = (e1) view2;
                    return;
                }
                return;
            default:
                l5 l5Var = (l5) this.f22105b;
                l5Var.z();
                n5 n5Var = l5Var.f22186w;
                if (n5Var != null) {
                    n5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
