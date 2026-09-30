package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class g4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f4728a;
    public final Object f4729b;

    public g4(Object obj, int i10) {
        this.f4728a = i10;
        this.f4729b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f4728a) {
            case 0:
                ((i4) this.f4729b).d();
                return;
            default:
                pf.e eVar = (pf.e) this.f4729b;
                View view = eVar.f41165j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
