package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class f4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f5065a;
    public final Object f5066b;

    public f4(Object obj, int i10) {
        this.f5065a = i10;
        this.f5066b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f5065a) {
            case 0:
                ((h4) this.f5066b).d();
                return;
            default:
                qf.e eVar = (qf.e) this.f5066b;
                View view = eVar.f46247j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
