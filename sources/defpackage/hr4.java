package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
public final class hr4 implements ViewTreeObserver.OnDrawListener {
    public final byte a;
    public final View b;

    public hr4(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override
    public final void onDraw() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                ((jr4) view).e.incrementAndGet();
                return;
            default:
                yc ycVar = (yc) view;
                Trace.beginSection("OnDraw");
                try {
                    Iterator it = ((g79) ycVar.b).iterator();
                    while (it.hasNext()) {
                        ((jy4) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                    ycVar.forceLayout();
                }
        }
    }
}
