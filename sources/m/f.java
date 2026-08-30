package m;

import android.view.View;
public final class f implements Runnable {
    public final d f13501a;
    public final h f13502b;

    public f(h hVar, d dVar) {
        this.f13502b = hVar;
        this.f13501a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f13502b;
        l.k kVar = hVar.f13508c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.i(kVar);
        }
        View view = (View) hVar.f13510n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f13501a;
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
