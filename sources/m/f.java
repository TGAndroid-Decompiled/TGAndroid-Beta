package m;

import android.view.View;
public final class f implements Runnable {
    public final d f14167a;
    public final h f14168b;

    public f(h hVar, d dVar) {
        this.f14168b = hVar;
        this.f14167a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f14168b;
        l.k kVar = hVar.f14184c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.t(kVar);
        }
        View view = (View) hVar.f14186n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f14167a;
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
