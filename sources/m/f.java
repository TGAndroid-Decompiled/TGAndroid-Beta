package m;

import android.view.View;
public final class f implements Runnable {
    public final d f14157a;
    public final h f14158b;

    public f(h hVar, d dVar) {
        this.f14158b = hVar;
        this.f14157a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f14158b;
        l.k kVar = hVar.f14174c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.t(kVar);
        }
        View view = (View) hVar.f14176n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f14157a;
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
