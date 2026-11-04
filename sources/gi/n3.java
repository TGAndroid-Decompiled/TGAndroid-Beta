package gi;

import android.view.View;
import android.view.ViewTreeObserver;
public final class n3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f13297a;
    public final Object f13298b;

    public n3(Object obj, int i3) {
        this.f13297a = i3;
        this.f13298b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f13297a) {
            case 0:
                ((p3) this.f13298b).d();
                return;
            default:
                uf.d dVar = (uf.d) this.f13298b;
                View view = dVar.f55856j;
                if (view != null) {
                    dVar.e(view);
                    return;
                }
                return;
        }
    }
}
