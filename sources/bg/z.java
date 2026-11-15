package bg;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import fi.w2;
import java.util.Iterator;
public final class z implements ViewTreeObserver.OnDrawListener {
    public final int f3349a;
    public final View f3350b;

    public z(int i7, View view) {
        this.f3349a = i7;
        this.f3350b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f3349a) {
            case 0:
                ((b0) this.f3350b).f3198e.incrementAndGet();
                return;
            default:
                w2 w2Var = (w2) this.f3350b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((xe.b) w2Var.f12459b).iterator();
                    while (it.hasNext()) {
                        ((ri.h) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    w2Var.forceLayout();
                }
        }
    }
}
