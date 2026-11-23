package m;

import android.view.View;
public final class f implements Runnable {
    public final d f20144a;
    public final h f20145b;

    public f(h hVar, d dVar) {
        this.f20145b = hVar;
        this.f20144a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f20145b;
        l.k kVar = hVar.f20164c;
        if (kVar != null && (iVar = kVar.f19276e) != null) {
            iVar.i(kVar);
        }
        View view = (View) hVar.f20167n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f20144a;
            if (!dVar.b()) {
                if (dVar.f19333e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.J = dVar;
        }
        hVar.L = null;
    }
}
