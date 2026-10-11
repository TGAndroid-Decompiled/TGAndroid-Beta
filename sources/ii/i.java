package ii;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f12465a;
    public final Object f12466b;

    public i(Object obj, int i10) {
        this.f12465a = i10;
        this.f12466b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f12465a) {
            case 0:
                ((r) this.f12466b).c0();
                return;
            case 1:
                ((e2) this.f12466b).w0();
                return;
            case 2:
                x3 x3Var = (x3) this.f12466b;
                if (view2 != null && x3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x3Var.Y2 = z10;
                if (view2 instanceof i1) {
                    x3Var.J3 = (i1) view2;
                    return;
                }
                return;
            default:
                q5 q5Var = (q5) this.f12466b;
                q5Var.x();
                s5 s5Var = q5Var.v;
                if (s5Var != null) {
                    s5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
