package m;

import android.view.View;
public final class f implements Runnable {
    public final d f14410a;
    public final h f14411b;

    public f(h hVar, d dVar) {
        this.f14411b = hVar;
        this.f14410a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f14411b;
        l.l lVar = hVar.f14427c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.r(lVar);
        }
        View view = (View) hVar.f14429n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f14410a;
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
