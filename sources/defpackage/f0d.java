package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
public final class f0d implements Runnable {
    public final byte a;
    public final g0d b;

    public f0d(g0d g0dVar, byte b) {
        this.a = b;
        this.b = g0dVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        g0d g0dVar = this.b;
        switch (b) {
            case 0:
                if (g0dVar.w != 0) {
                    g0dVar.i(false);
                    return;
                }
                return;
            default:
                int i = g0dVar.H - 1;
                g0dVar.H = i;
                if (i == 0) {
                    View view = g0dVar.F;
                    RectF rectF = uyc.e;
                    WeakHashMap weakHashMap = kfc.a;
                    g0dVar.k(uyc.a(dfc.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
