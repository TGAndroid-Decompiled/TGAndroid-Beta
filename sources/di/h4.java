package di;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f7316a;
    public final Object f7317b;

    public h4(Object obj, int i10) {
        this.f7316a = i10;
        this.f7317b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f7316a) {
            case 0:
                ((j4) this.f7317b).d();
                return;
            default:
                qf.e eVar = (qf.e) this.f7317b;
                View view = eVar.f44360j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
