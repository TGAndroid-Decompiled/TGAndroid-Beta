package ki;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f15324a;
    public final Object f15325b;

    public i(Object obj, int i10) {
        this.f15324a = i10;
        this.f15325b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f15324a) {
            case 0:
                ((q) this.f15325b).c0();
                return;
            case 1:
                ((d2) this.f15325b).w0();
                return;
            case 2:
                w3 w3Var = (w3) this.f15325b;
                if (view2 != null && w3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w3Var.Y2 = z10;
                if (view2 instanceof h1) {
                    w3Var.J3 = (h1) view2;
                    return;
                }
                return;
            default:
                o5 o5Var = (o5) this.f15325b;
                o5Var.x();
                q5 q5Var = o5Var.v;
                if (q5Var != null) {
                    q5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
