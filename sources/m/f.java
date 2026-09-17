package m;

import android.view.View;
public final class f implements Runnable {
    public final d f15512a;
    public final h f15513b;

    public f(h hVar, d dVar) {
        this.f15513b = hVar;
        this.f15512a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f15513b;
        l.l lVar = hVar.f15530c;
        if (lVar != null && (jVar = lVar.f15113e) != null) {
            jVar.n(lVar);
        }
        View view = (View) hVar.f15533n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f15512a;
            if (!dVar.b()) {
                if (dVar.f15170e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
