package m;

import android.view.View;
public final class f implements Runnable {
    public final d f14426a;
    public final h f14427b;

    public f(h hVar, d dVar) {
        this.f14427b = hVar;
        this.f14426a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f14427b;
        l.l lVar = hVar.f14443c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.r(lVar);
        }
        View view = (View) hVar.f14445n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f14426a;
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
