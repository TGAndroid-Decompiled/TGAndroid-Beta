package kh;

import android.view.View;
import android.view.ViewTreeObserver;
public final class z3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f16424a;
    public final Object f16425b;

    public z3(Object obj, int i9) {
        this.f16424a = i9;
        this.f16425b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f16424a) {
            case 0:
                ((b4) this.f16425b).d();
                return;
            default:
                xe.d dVar = (xe.d) this.f16425b;
                View view = dVar.f49151j;
                if (view != null) {
                    dVar.e(view);
                    return;
                }
                return;
        }
    }
}
