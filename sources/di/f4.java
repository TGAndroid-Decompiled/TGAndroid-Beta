package di;

import android.view.View;
import android.view.ViewTreeObserver;
public final class f4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f6940a;
    public final Object f6941b;

    public f4(Object obj, int i10) {
        this.f6940a = i10;
        this.f6941b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f6940a) {
            case 0:
                ((h4) this.f6941b).d();
                return;
            default:
                rf.d dVar = (rf.d) this.f6941b;
                View view = dVar.f44180j;
                if (view != null) {
                    dVar.e(view);
                    return;
                }
                return;
        }
    }
}
