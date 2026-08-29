package af;

import android.view.View;
import android.view.ViewTreeObserver;
import nh.w3;
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f384a;
    public final Object f385b;

    public e(Object obj, int i10) {
        this.f384a = i10;
        this.f385b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        switch (this.f384a) {
            case 0:
                g gVar = (g) this.f385b;
                View view = gVar.f404j;
                if (view != null) {
                    gVar.e(view);
                    return;
                }
                return;
            default:
                ((w3) this.f385b).d();
                return;
        }
    }
}
