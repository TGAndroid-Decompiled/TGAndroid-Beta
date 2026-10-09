package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class f4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f5066a;
    public final Object f5067b;

    public f4(Object obj, int i10) {
        this.f5066a = i10;
        this.f5067b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f5066a) {
            case 0:
                ((h4) this.f5067b).d();
                return;
            default:
                qf.e eVar = (qf.e) this.f5067b;
                View view = eVar.f46167j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
