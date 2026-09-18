package m;

import android.view.View;
public final class f implements Runnable {
    public final d f14354a;
    public final h f14355b;

    public f(h hVar, d dVar) {
        this.f14355b = hVar;
        this.f14354a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f14355b;
        l.l lVar = hVar.f14371c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.r(lVar);
        }
        View view = (View) hVar.f14373n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f14354a;
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
