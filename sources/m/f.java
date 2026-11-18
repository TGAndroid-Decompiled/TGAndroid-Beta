package m;

import android.view.View;
public final class f implements Runnable {
    public final d f20050a;
    public final h f20051b;

    public f(h hVar, d dVar) {
        this.f20051b = hVar;
        this.f20050a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f20051b;
        l.k kVar = hVar.f20070c;
        if (kVar != null && (iVar = kVar.f19180e) != null) {
            iVar.b(kVar);
        }
        View view = (View) hVar.f20073n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f20050a;
            if (!dVar.b()) {
                if (dVar.f19237e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.J = dVar;
        }
        hVar.L = null;
    }
}
