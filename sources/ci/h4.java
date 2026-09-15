package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f4739a;
    public final Object f4740b;

    public h4(Object obj, int i10) {
        this.f4739a = i10;
        this.f4740b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f4739a) {
            case 0:
                ((j4) this.f4740b).d();
                return;
            default:
                pf.e eVar = (pf.e) this.f4740b;
                View view = eVar.f40799j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
