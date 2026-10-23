package ei;

import android.view.View;
import android.view.ViewTreeObserver;
public final class z3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f10213a;
    public final Object f10214b;

    public z3(Object obj, int i10) {
        this.f10213a = i10;
        this.f10214b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f10213a) {
            case 0:
                ((b4) this.f10214b).d();
                return;
            default:
                rf.d dVar = (rf.d) this.f10214b;
                View view = dVar.f45693j;
                if (view != null) {
                    dVar.e(view);
                    return;
                }
                return;
        }
    }
}
