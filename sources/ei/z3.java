package ei;

import android.view.View;
import android.view.ViewTreeObserver;
public final class z3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f10198a;
    public final Object f10199b;

    public z3(Object obj, int i10) {
        this.f10198a = i10;
        this.f10199b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f10198a) {
            case 0:
                ((b4) this.f10199b).d();
                return;
            default:
                rf.d dVar = (rf.d) this.f10199b;
                View view = dVar.f45267j;
                if (view != null) {
                    dVar.e(view);
                    return;
                }
                return;
        }
    }
}
