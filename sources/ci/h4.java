package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f4741a;
    public final Object f4742b;

    public h4(Object obj, int i10) {
        this.f4741a = i10;
        this.f4742b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f4741a) {
            case 0:
                ((j4) this.f4742b).d();
                return;
            default:
                pf.e eVar = (pf.e) this.f4742b;
                View view = eVar.f40795j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
