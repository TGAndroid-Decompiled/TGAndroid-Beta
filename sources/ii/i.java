package ii;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f11423a;
    public final Object f11424b;

    public i(Object obj, int i10) {
        this.f11423a = i10;
        this.f11424b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f11423a) {
            case 0:
                ((r) this.f11424b).Z();
                return;
            case 1:
                ((e2) this.f11424b).w0();
                return;
            case 2:
                x3 x3Var = (x3) this.f11424b;
                if (view2 != null && x3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x3Var.f28780h3 = z10;
                if (view2 instanceof i1) {
                    x3Var.S3 = (i1) view2;
                    return;
                }
                return;
            default:
                p5 p5Var = (p5) this.f11424b;
                p5Var.x();
                r5 r5Var = p5Var.v;
                if (r5Var != null) {
                    r5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
