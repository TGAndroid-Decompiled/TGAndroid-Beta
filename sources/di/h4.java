package di;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f7344a;
    public final Object f7345b;

    public h4(Object obj, int i10) {
        this.f7344a = i10;
        this.f7345b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f7344a) {
            case 0:
                ((j4) this.f7345b).d();
                return;
            default:
                qf.e eVar = (qf.e) this.f7345b;
                View view = eVar.f44388j;
                if (view != null) {
                    eVar.e(view);
                    return;
                }
                return;
        }
    }
}
