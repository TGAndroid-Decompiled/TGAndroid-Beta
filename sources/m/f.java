package m;

import android.view.View;
public final class f implements Runnable {
    public final d f14405a;
    public final h f14406b;

    public f(h hVar, d dVar) {
        this.f14406b = hVar;
        this.f14405a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f14406b;
        l.l lVar = hVar.f14422c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.r(lVar);
        }
        View view = (View) hVar.f14424n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f14405a;
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
