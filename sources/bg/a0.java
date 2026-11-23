package bg;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import fi.u2;
import java.util.Iterator;
public final class a0 implements ViewTreeObserver.OnDrawListener {
    public final int f3207a;
    public final View f3208b;

    public a0(int i7, View view) {
        this.f3207a = i7;
        this.f3208b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f3207a) {
            case 0:
                ((c0) this.f3208b).f3225e.incrementAndGet();
                return;
            default:
                u2 u2Var = (u2) this.f3208b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((xe.b) u2Var.f12653b).iterator();
                    while (it.hasNext()) {
                        ((ri.h) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    u2Var.forceLayout();
                }
        }
    }
}
