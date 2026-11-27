package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
public final class u2d implements Runnable {
    public final byte a;
    public final v2d b;

    public u2d(v2d v2dVar, byte b) {
        this.a = b;
        this.b = v2dVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        v2d v2dVar = this.b;
        switch (b) {
            case 0:
                if (v2dVar.w != 0) {
                    v2dVar.i(false);
                    return;
                }
                return;
            default:
                int i = v2dVar.H - 1;
                v2dVar.H = i;
                if (i == 0) {
                    View view = v2dVar.F;
                    RectF rectF = j1d.e;
                    WeakHashMap weakHashMap = ihc.a;
                    v2dVar.k(j1d.a(bhc.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
