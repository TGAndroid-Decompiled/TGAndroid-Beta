package m;

import android.view.View;
public final class f implements Runnable {
    public final d f12406a;
    public final h f12407b;

    public f(h hVar, d dVar) {
        this.f12407b = hVar;
        this.f12406a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f12407b;
        l.l lVar = hVar.f12423c;
        if (lVar != null && (jVar = lVar.e) != null) {
            jVar.p(lVar);
        }
        View view = (View) hVar.f12425n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f12406a;
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
