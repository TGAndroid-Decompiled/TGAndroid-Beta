package ci;

import android.view.View;
import android.view.ViewTreeObserver;
public final class f4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f5064a;
    public final Object f5065b;

    public f4(Object obj, int i10) {
        this.f5064a = i10;
        this.f5065b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f5064a) {
            case 0:
                ((h4) this.f5065b).d();
                return;
            default:
                qf.e eVar = (qf.e) this.f5065b;
                View view = eVar.f46106j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
