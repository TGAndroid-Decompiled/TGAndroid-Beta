package bi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class l implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f3174a;
    public final Object f3175b;

    public l(Object obj, int i10) {
        this.f3174a = i10;
        this.f3175b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f3174a) {
            case 0:
                ((t) this.f3175b).c0();
                return;
            case 1:
                ((k2) this.f3175b).B0();
                return;
            case 2:
                d4 d4Var = (d4) this.f3175b;
                if (view2 != null && d4Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d4Var.f31185h3 = z10;
                if (view2 instanceof n1) {
                    d4Var.S3 = (n1) view2;
                    return;
                }
                return;
            default:
                z5 z5Var = (z5) this.f3175b;
                z5Var.z();
                b6 b6Var = z5Var.f3483w;
                if (b6Var != null) {
                    b6Var.invalidate();
                    return;
                }
                return;
        }
    }
}
