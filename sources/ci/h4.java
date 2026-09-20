package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f4745a;
    public final Object f4746b;

    public h4(Object obj, int i10) {
        this.f4745a = i10;
        this.f4746b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f4745a) {
            case 0:
                ((j4) this.f4746b).d();
                return;
            default:
                pf.e eVar = (pf.e) this.f4746b;
                View view = eVar.f41095j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
