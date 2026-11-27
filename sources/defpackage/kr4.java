package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
public final class kr4 implements ViewTreeObserver.OnDrawListener {
    public final byte a;
    public final View b;

    public kr4(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final void onDraw() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                ((mr4) view).e.incrementAndGet();
                return;
            default:
                vl4 vl4Var = (vl4) view;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((r89) vl4Var.b).iterator();
                    while (it.hasNext()) {
                        ((my4) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    vl4Var.forceLayout();
                }
        }
    }
}
