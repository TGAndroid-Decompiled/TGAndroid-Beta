package m;

import android.view.View;
public final class f implements Runnable {
    public final d f12405a;
    public final h f12406b;

    public f(h hVar, d dVar) {
        this.f12406b = hVar;
        this.f12405a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f12406b;
        l.l lVar = hVar.f12422c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.p(lVar);
        }
        View view = (View) hVar.f12424n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f12405a;
            if (!dVar.b()) {
                if (dVar.e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
