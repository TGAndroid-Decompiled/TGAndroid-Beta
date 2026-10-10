package m;

import android.view.View;
public final class f implements Runnable {
    public final d f15669a;
    public final h f15670b;

    public f(h hVar, d dVar) {
        this.f15670b = hVar;
        this.f15669a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f15670b;
        l.k kVar = hVar.f15686c;
        if (kVar != null && (iVar = kVar.f15242e) != null) {
            iVar.n(kVar);
        }
        View view = (View) hVar.f15689n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f15669a;
            if (!dVar.b()) {
                if (dVar.f15299e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
