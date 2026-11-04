package m;

import android.view.View;
public final class f implements Runnable {
    public final d f18574a;
    public final h f18575b;

    public f(h hVar, d dVar) {
        this.f18575b = hVar;
        this.f18574a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f18575b;
        l.k kVar = hVar.f18594c;
        if (kVar != null && (iVar = kVar.f17420e) != null) {
            iVar.b(kVar);
        }
        View view = (View) hVar.f18597n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f18574a;
            if (!dVar.b()) {
                if (dVar.f17477e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.J = dVar;
        }
        hVar.L = null;
    }
}
