package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class g4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f4727a;
    public final Object f4728b;

    public g4(Object obj, int i10) {
        this.f4727a = i10;
        this.f4728b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f4727a) {
            case 0:
                ((i4) this.f4728b).d();
                return;
            default:
                pf.e eVar = (pf.e) this.f4728b;
                View view = eVar.f41064j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
