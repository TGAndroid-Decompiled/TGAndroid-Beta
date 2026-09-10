package m;

import android.view.View;
public final class f implements Runnable {
    public final d f13003a;
    public final h f13004b;

    public f(h hVar, d dVar) {
        this.f13004b = hVar;
        this.f13003a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f13004b;
        l.l lVar = hVar.f13021c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.o(lVar);
        }
        View view = (View) hVar.f13023n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f13003a;
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
