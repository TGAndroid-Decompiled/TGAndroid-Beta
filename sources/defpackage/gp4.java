package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
public final class gp4 implements ViewTreeObserver.OnDrawListener {
    public final byte a;
    public final View b;

    public gp4(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final void onDraw() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                ((ip4) view).e.incrementAndGet();
                return;
            default:
                rj4 rj4Var = (rj4) view;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((e59) rj4Var.b).iterator();
                    while (it.hasNext()) {
                        ((hw4) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    rj4Var.forceLayout();
                }
        }
    }
}
