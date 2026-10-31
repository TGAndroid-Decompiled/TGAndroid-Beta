package jf;

import android.view.View;
import android.view.ViewTreeObserver;
import vh.r2;
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f9850a;
    public final Object f9851b;

    public d(Object obj, int i10) {
        this.f9850a = i10;
        this.f9851b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f9850a) {
            case 0:
                f fVar = (f) this.f9851b;
                View view = fVar.f9868j;
                if (view != null) {
                    fVar.e(view);
                    return;
                }
                return;
            default:
                ((r2) this.f9851b).d();
                return;
        }
    }
}
