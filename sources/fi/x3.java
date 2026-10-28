package fi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class x3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f11953a;
    public final Object f11954b;

    public x3(Object obj, int i10) {
        this.f11953a = i10;
        this.f11954b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f11953a) {
            case 0:
                ((z3) this.f11954b).d();
                return;
            default:
                sf.d dVar = (sf.d) this.f11954b;
                View view = dVar.f48172j;
                if (view != null) {
                    dVar.e(view);
                    return;
                }
                return;
        }
    }
}
