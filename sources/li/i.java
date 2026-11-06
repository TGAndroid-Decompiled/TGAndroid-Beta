package li;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f18630a;
    public final Object f18631b;

    public i(Object obj, int i7) {
        this.f18630a = i7;
        this.f18631b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z9;
        switch (this.f18630a) {
            case 0:
                ((p) this.f18631b).e0();
                return;
            case 1:
                ((b2) this.f18631b).B0();
                return;
            case 2:
                t3 t3Var = (t3) this.f18631b;
                if (view2 != null && t3Var.F(view2) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                t3Var.f35169h3 = z9;
                if (view2 instanceof g1) {
                    t3Var.S3 = (g1) view2;
                    return;
                }
                return;
            default:
                m5 m5Var = (m5) this.f18631b;
                m5Var.z();
                o5 o5Var = m5Var.f18708w;
                if (o5Var != null) {
                    o5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
