package di;

import android.view.View;
import android.view.ViewTreeObserver;
public final class f4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f6943a;
    public final Object f6944b;

    public f4(Object obj, int i10) {
        this.f6943a = i10;
        this.f6944b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f6943a) {
            case 0:
                ((h4) this.f6944b).d();
                return;
            default:
                rf.d dVar = (rf.d) this.f6944b;
                View view = dVar.f43939j;
                if (view != null) {
                    dVar.e(view);
                    return;
                }
                return;
        }
    }
}
