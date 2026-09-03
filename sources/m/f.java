package m;

import android.view.View;
public final class f implements Runnable {
    public final d f13485a;
    public final h f13486b;

    public f(h hVar, d dVar) {
        this.f13486b = hVar;
        this.f13485a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f13486b;
        l.k kVar = hVar.f13492c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.i(kVar);
        }
        View view = (View) hVar.f13494n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f13485a;
            if (!dVar.b()) {
                if (dVar.e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.F = dVar;
        }
        hVar.H = null;
    }
}
