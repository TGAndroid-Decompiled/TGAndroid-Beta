package m;

import android.view.View;
public final class f implements Runnable {
    public final d f15539a;
    public final h f15540b;

    public f(h hVar, d dVar) {
        this.f15540b = hVar;
        this.f15539a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f15540b;
        l.l lVar = hVar.f15557c;
        if (lVar != null && (jVar = lVar.f15139e) != null) {
            jVar.n(lVar);
        }
        View view = (View) hVar.f15560n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f15539a;
            if (!dVar.b()) {
                if (dVar.f15196e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
