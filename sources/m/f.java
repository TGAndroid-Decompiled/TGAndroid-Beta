package m;

import android.view.View;
public final class f implements Runnable {
    public final d f13187a;
    public final h f13188b;

    public f(h hVar, d dVar) {
        this.f13188b = hVar;
        this.f13187a = dVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        h hVar = this.f13188b;
        l.l lVar = hVar.f13204c;
        if (lVar != null && (jVar = lVar.f11398e) != null) {
            jVar.j(lVar);
        }
        View view = (View) hVar.f13207n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f13187a;
            if (!dVar.b()) {
                if (dVar.f11455e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.F = dVar;
        }
        hVar.H = null;
    }
}
