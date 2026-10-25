package m;

import android.view.View;
public final class f implements Runnable {
    public final d f17710a;
    public final h f17711b;

    public f(h hVar, d dVar) {
        this.f17711b = hVar;
        this.f17710a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f17711b;
        l.k kVar = hVar.f17728c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.r(kVar);
        }
        View view = (View) hVar.f17730n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f17710a;
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
