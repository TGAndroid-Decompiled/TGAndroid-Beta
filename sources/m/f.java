package m;

import android.view.View;
public final class f implements Runnable {
    public final d f20081a;
    public final h f20082b;

    public f(h hVar, d dVar) {
        this.f20082b = hVar;
        this.f20081a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f20082b;
        l.k kVar = hVar.f20101c;
        if (kVar != null && (iVar = kVar.f19211e) != null) {
            iVar.b(kVar);
        }
        View view = (View) hVar.f20104n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f20081a;
            if (!dVar.b()) {
                if (dVar.f19268e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.J = dVar;
        }
        hVar.L = null;
    }
}
