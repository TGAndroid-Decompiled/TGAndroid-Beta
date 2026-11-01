package nf;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import ei.i;
import java.util.Iterator;
import rf.v;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f13749a;
    public final View f13750b;

    public a(int i10, View view) {
        this.f13749a = i10;
        this.f13750b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f13749a) {
            case 0:
                ih.c cVar = (ih.c) this.f13750b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((je.b) cVar.f8522b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    cVar.forceLayout();
                }
            default:
                ((v) this.f13750b).e.incrementAndGet();
                return;
        }
    }
}
