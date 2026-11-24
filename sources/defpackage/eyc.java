package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
public final class eyc implements Runnable {
    public final byte a;
    public final fyc b;

    public eyc(fyc fycVar, byte b) {
        this.a = b;
        this.b = fycVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fyc fycVar = this.b;
        switch (b) {
            case 0:
                if (fycVar.w != 0) {
                    fycVar.i(false);
                    return;
                }
                return;
            default:
                int i = fycVar.H - 1;
                fycVar.H = i;
                if (i == 0) {
                    View view = fycVar.F;
                    RectF rectF = twc.e;
                    WeakHashMap weakHashMap = jdc.a;
                    fycVar.k(twc.a(cdc.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
