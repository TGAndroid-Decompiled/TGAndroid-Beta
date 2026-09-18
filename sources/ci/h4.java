package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f4744a;
    public final Object f4745b;

    public h4(Object obj, int i10) {
        this.f4744a = i10;
        this.f4745b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f4744a) {
            case 0:
                ((j4) this.f4745b).d();
                return;
            default:
                pf.e eVar = (pf.e) this.f4745b;
                View view = eVar.f40826j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
