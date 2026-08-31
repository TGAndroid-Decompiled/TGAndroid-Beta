package cf;

import android.view.View;
import android.view.ViewTreeObserver;
import qh.i3;
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f2478a;
    public final Object f2479b;

    public d(Object obj, int i10) {
        this.f2478a = i10;
        this.f2479b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f2478a) {
            case 0:
                f fVar = (f) this.f2479b;
                View view = fVar.f2498j;
                if (view != null) {
                    fVar.e(view);
                    return;
                }
                return;
            default:
                ((i3) this.f2479b).d();
                return;
        }
    }
}
