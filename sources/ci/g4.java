package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class g4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f5108a;
    public final Object f5109b;

    public g4(Object obj, int i10) {
        this.f5108a = i10;
        this.f5109b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f5108a) {
            case 0:
                ((i4) this.f5109b).d();
                return;
            default:
                pf.e eVar = (pf.e) this.f5109b;
                View view = eVar.f44431j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
