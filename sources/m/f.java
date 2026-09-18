package m;

import android.view.View;
public final class f implements Runnable {
    public final d f14179a;
    public final h f14180b;

    public f(h hVar, d dVar) {
        this.f14180b = hVar;
        this.f14179a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f14180b;
        l.k kVar = hVar.f14196c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.t(kVar);
        }
        View view = (View) hVar.f14198n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f14179a;
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
