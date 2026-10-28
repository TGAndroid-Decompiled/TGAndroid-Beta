package ag;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import di.h3;
import java.util.Iterator;
public final class e0 implements ViewTreeObserver.OnDrawListener {
    public final int f1271a;
    public final View f1272b;

    public e0(int i10, View view) {
        this.f1271a = i10;
        this.f1272b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f1271a) {
            case 0:
                ((g0) this.f1272b).e.incrementAndGet();
                return;
            default:
                h3 h3Var = (h3) this.f1272b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((se.b) h3Var.f8617b).iterator();
                    while (it.hasNext()) {
                        ((oi.h) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    h3Var.forceLayout();
                }
        }
    }
}
