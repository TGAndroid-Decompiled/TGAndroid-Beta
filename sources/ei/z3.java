package ei;

import android.view.View;
import android.view.ViewTreeObserver;
public final class z3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f10196a;
    public final Object f10197b;

    public z3(Object obj, int i10) {
        this.f10196a = i10;
        this.f10197b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f10196a) {
            case 0:
                ((b4) this.f10197b).d();
                return;
            default:
                rf.d dVar = (rf.d) this.f10197b;
                View view = dVar.f45280j;
                if (view != null) {
                    dVar.e(view);
                    return;
                }
                return;
        }
    }
}
