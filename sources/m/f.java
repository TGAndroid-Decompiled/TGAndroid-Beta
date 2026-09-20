package m;

import android.view.View;
public final class f implements Runnable {
    public final d f14390a;
    public final h f14391b;

    public f(h hVar, d dVar) {
        this.f14391b = hVar;
        this.f14390a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f14391b;
        l.l lVar = hVar.f14407c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.r(lVar);
        }
        View view = (View) hVar.f14409n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f14390a;
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
