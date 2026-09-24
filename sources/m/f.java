package m;

import android.view.View;
public final class f implements Runnable {
    public final d f14395a;
    public final h f14396b;

    public f(h hVar, d dVar) {
        this.f14396b = hVar;
        this.f14395a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f14396b;
        l.l lVar = hVar.f14412c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.r(lVar);
        }
        View view = (View) hVar.f14414n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f14395a;
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
