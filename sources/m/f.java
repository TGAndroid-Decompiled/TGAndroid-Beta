package m;

import android.view.View;
public final class f implements Runnable {
    public final d f20053a;
    public final h f20054b;

    public f(h hVar, d dVar) {
        this.f20054b = hVar;
        this.f20053a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f20054b;
        l.k kVar = hVar.f20073c;
        if (kVar != null && (iVar = kVar.f19183e) != null) {
            iVar.b(kVar);
        }
        View view = (View) hVar.f20076n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f20053a;
            if (!dVar.b()) {
                if (dVar.f19240e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.J = dVar;
        }
        hVar.L = null;
    }
}
