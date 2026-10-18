package ei;

import android.view.View;
import android.view.ViewTreeObserver;
public final class z3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f10199a;
    public final Object f10200b;

    public z3(Object obj, int i10) {
        this.f10199a = i10;
        this.f10200b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f10199a) {
            case 0:
                ((b4) this.f10200b).d();
                return;
            default:
                rf.d dVar = (rf.d) this.f10200b;
                View view = dVar.f45315j;
                if (view != null) {
                    dVar.e(view);
                    return;
                }
                return;
        }
    }
}
