package m;

import android.view.View;
public final class f implements Runnable {
    public final d f14411a;
    public final h f14412b;

    public f(h hVar, d dVar) {
        this.f14412b = hVar;
        this.f14411a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f14412b;
        l.l lVar = hVar.f14428c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.r(lVar);
        }
        View view = (View) hVar.f14430n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f14411a;
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
