package m;

import android.view.View;
public final class g implements Runnable {
    public final e f19106a;
    public final i f19107b;

    public g(i iVar, e eVar) {
        this.f19107b = iVar;
        this.f19106a = eVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        i iVar2 = this.f19107b;
        l.k kVar = iVar2.f19124c;
        if (kVar != null && (iVar = kVar.f17674e) != null) {
            iVar.j0(kVar);
        }
        View view = (View) iVar2.f19127n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.f19106a;
            if (!eVar.b()) {
                if (eVar.f17731e != null) {
                    eVar.d(0, 0, false, false);
                }
            }
            iVar2.I = eVar;
        }
        iVar2.K = null;
    }
}
