package m;

import android.view.View;
public final class f implements Runnable {
    public final d f15728a;
    public final h f15729b;

    public f(h hVar, d dVar) {
        this.f15729b = hVar;
        this.f15728a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f15729b;
        l.k kVar = hVar.f15746c;
        if (kVar != null && (iVar = kVar.f15173e) != null) {
            iVar.y(kVar);
        }
        View view = (View) hVar.f15749n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f15728a;
            if (!dVar.b()) {
                if (dVar.f15230e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.I = dVar;
        }
        hVar.K = null;
    }
}
