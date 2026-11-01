package jf;

import android.view.View;
import android.view.ViewTreeObserver;
import vh.r2;
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f9851a;
    public final Object f9852b;

    public d(Object obj, int i10) {
        this.f9851a = i10;
        this.f9852b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f9851a) {
            case 0:
                f fVar = (f) this.f9852b;
                View view = fVar.f9869j;
                if (view != null) {
                    fVar.e(view);
                    return;
                }
                return;
            default:
                ((r2) this.f9852b).d();
                return;
        }
    }
}
