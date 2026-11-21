package m;

import android.view.View;
public final class f implements Runnable {
    public final d f20078a;
    public final h f20079b;

    public f(h hVar, d dVar) {
        this.f20079b = hVar;
        this.f20078a = dVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        h hVar = this.f20079b;
        l.k kVar = hVar.f20098c;
        if (kVar != null && (iVar = kVar.f19208e) != null) {
            iVar.b(kVar);
        }
        View view = (View) hVar.f20101n;
        if (view != null && view.getWindowToken() != null) {
            d dVar = this.f20078a;
            if (!dVar.b()) {
                if (dVar.f19265e != null) {
                    dVar.d(0, 0, false, false);
                }
            }
            hVar.J = dVar;
        }
        hVar.L = null;
    }
}
