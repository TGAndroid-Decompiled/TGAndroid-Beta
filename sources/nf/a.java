package nf;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import ei.i;
import java.util.Iterator;
import rf.v;
public final class a implements ViewTreeObserver.OnDrawListener {
    public final int f13748a;
    public final View f13749b;

    public a(int i10, View view) {
        this.f13748a = i10;
        this.f13749b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f13748a) {
            case 0:
                ih.c cVar = (ih.c) this.f13749b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((je.b) cVar.f8521b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    cVar.forceLayout();
                }
            default:
                ((v) this.f13749b).e.incrementAndGet();
                return;
        }
    }
}
