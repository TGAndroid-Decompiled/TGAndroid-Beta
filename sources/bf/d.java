package bf;

import android.view.View;
import android.view.ViewTreeObserver;
import ph.i3;
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f1805a;
    public final Object f1806b;

    public d(Object obj, int i10) {
        this.f1805a = i10;
        this.f1806b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f1805a) {
            case 0:
                f fVar = (f) this.f1806b;
                View view = fVar.f1823j;
                if (view != null) {
                    fVar.e(view);
                    return;
                }
                return;
            default:
                ((i3) this.f1806b).d();
                return;
        }
    }
}
