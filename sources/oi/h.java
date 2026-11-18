package oi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f22078a;
    public final Object f22079b;

    public h(Object obj, int i7) {
        this.f22078a = i7;
        this.f22079b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f22078a) {
            case 0:
                ((o) this.f22079b).e0();
                return;
            case 1:
                ((z1) this.f22079b).B0();
                return;
            case 2:
                s3 s3Var = (s3) this.f22079b;
                if (view2 != null && s3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s3Var.f34609i3 = z10;
                if (view2 instanceof e1) {
                    s3Var.T3 = (e1) view2;
                    return;
                }
                return;
            default:
                l5 l5Var = (l5) this.f22079b;
                l5Var.z();
                n5 n5Var = l5Var.f22168w;
                if (n5Var != null) {
                    n5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
