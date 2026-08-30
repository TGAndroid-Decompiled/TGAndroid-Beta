package cf;

import android.view.View;
import android.view.ViewTreeObserver;
import ph.i3;
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f2283a;
    public final Object f2284b;

    public d(Object obj, int i10) {
        this.f2283a = i10;
        this.f2284b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f2283a) {
            case 0:
                f fVar = (f) this.f2284b;
                View view = fVar.f2301j;
                if (view != null) {
                    fVar.e(view);
                    return;
                }
                return;
            default:
                ((i3) this.f2284b).d();
                return;
        }
    }
}
