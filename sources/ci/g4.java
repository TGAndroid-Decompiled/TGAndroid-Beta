package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class g4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f4720a;
    public final Object f4721b;

    public g4(Object obj, int i10) {
        this.f4720a = i10;
        this.f4721b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f4720a) {
            case 0:
                ((i4) this.f4721b).d();
                return;
            default:
                pf.e eVar = (pf.e) this.f4721b;
                View view = eVar.f41067j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
