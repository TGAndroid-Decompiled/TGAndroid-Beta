package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class g4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f5107a;
    public final Object f5108b;

    public g4(Object obj, int i10) {
        this.f5107a = i10;
        this.f5108b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f5107a) {
            case 0:
                ((i4) this.f5108b).d();
                return;
            default:
                pf.e eVar = (pf.e) this.f5108b;
                View view = eVar.f44416j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
