package ei;

import android.view.View;
import android.view.ViewTreeObserver;
public final class z3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f10197a;
    public final Object f10198b;

    public z3(Object obj, int i10) {
        this.f10197a = i10;
        this.f10198b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f10197a) {
            case 0:
                ((b4) this.f10198b).d();
                return;
            default:
                rf.d dVar = (rf.d) this.f10198b;
                View view = dVar.f45295j;
                if (view != null) {
                    dVar.e(view);
                    return;
                }
                return;
        }
    }
}
