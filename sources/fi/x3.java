package fi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class x3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f11954a;
    public final Object f11955b;

    public x3(Object obj, int i10) {
        this.f11954a = i10;
        this.f11955b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f11954a) {
            case 0:
                ((z3) this.f11955b).d();
                return;
            default:
                sf.d dVar = (sf.d) this.f11955b;
                View view = dVar.f48131j;
                if (view != null) {
                    dVar.e(view);
                    return;
                }
                return;
        }
    }
}
