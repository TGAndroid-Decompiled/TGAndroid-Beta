package m;

import android.view.View;
public final class f implements Runnable {
    public final d f20047a;
    public final h f20048b;

    public f(h hVar, d dVar) {
        this.f20048b = hVar;
        this.f20047a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f20048b;
        l.k kVar = hVar.f20067c;
        if (kVar != null && (iVar = kVar.f19177e) != null) {
            iVar.b(kVar);
        }
        View view = (View) hVar.f20070n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f20047a;
            if (!dVar.b()) {
                if (dVar.f19234e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.J = dVar;
        }
        hVar.L = null;
    }
}
