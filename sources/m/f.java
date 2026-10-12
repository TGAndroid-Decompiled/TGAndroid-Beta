package m;

import android.view.View;
public final class f implements Runnable {
    public final d f15421a;
    public final h f15422b;

    public f(h hVar, d dVar) {
        this.f15422b = hVar;
        this.f15421a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f15422b;
        l.k kVar = hVar.f15430c;
        if (kVar != null && (iVar = kVar.f14987e) != null) {
            iVar.u(kVar);
        }
        View view = (View) hVar.f15433n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f15421a;
            if (!dVar.b()) {
                if (dVar.f15044e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
