package m;

import android.view.View;
public final class f implements Runnable {
    public final d f14437a;
    public final h f14438b;

    public f(h hVar, d dVar) {
        this.f14438b = hVar;
        this.f14437a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f14438b;
        l.l lVar = hVar.f14454c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.p(lVar);
        }
        View view = (View) hVar.f14456n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f14437a;
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
