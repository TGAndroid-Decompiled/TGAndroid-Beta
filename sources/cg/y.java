package cg;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import ei.e3;
import java.util.Iterator;
public final class y implements ViewTreeObserver.OnDrawListener {
    public final int f4762a;
    public final View f4763b;

    public y(int i3, View view) {
        this.f4762a = i3;
        this.f4763b = view;
    }

    @Override
    public final void onDraw() {
        switch (this.f4762a) {
            case 0:
                ((a0) this.f4763b).f4611e.incrementAndGet();
                return;
            default:
                e3 e3Var = (e3) this.f4763b;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((ue.b) e3Var.f10221b).iterator();
                    while (it.hasNext()) {
                        ((pi.h) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    e3Var.forceLayout();
                }
        }
    }
}
