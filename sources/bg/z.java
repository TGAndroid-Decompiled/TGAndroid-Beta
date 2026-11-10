package bg;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import di.b3;
import java.util.Iterator;
public final class z implements ViewTreeObserver.OnDrawListener {
    public final int f3397a;
    public final View f3398b;

    public z(int i7, View view) {
        this.f3397a = i7;
        this.f3398b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f3397a) {
            case 0:
                ((b0) this.f3398b).f3243e.incrementAndGet();
                return;
            default:
                b3 b3Var = (b3) this.f3398b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((xe.b) b3Var.f8840b).iterator();
                    while (it.hasNext()) {
                        ((oi.h) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    b3Var.forceLayout();
                }
        }
    }
}
