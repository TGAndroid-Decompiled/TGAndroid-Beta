package lh;

import android.view.View;
import android.view.ViewTreeObserver;

public final class y3 implements ViewTreeObserver.OnGlobalLayoutListener {

    public final int f17079a;

    public final Object f17080b;

    public y3(Object obj, int i10) {
        this.f17079a = i10;
        this.f17080b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f17079a) {
            case 0:
                ((a4) this.f17080b).d();
                break;
            default:
                ye.d dVar = (ye.d) this.f17080b;
                View view = dVar.f49867j;
                if (view != null) {
                    dVar.e(view);
                }
                break;
        }
    }
}
