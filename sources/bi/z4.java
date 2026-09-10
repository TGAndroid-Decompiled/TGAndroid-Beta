package bi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class z4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f4002a;
    public final Object f4003b;

    public z4(Object obj, int i10) {
        this.f4002a = i10;
        this.f4003b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f4002a) {
            case 0:
                ((b5) this.f4003b).d();
                return;
            default:
                pf.e eVar = (pf.e) this.f4003b;
                View view = eVar.f39925j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
