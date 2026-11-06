package m;

import android.view.View;
public final class g implements Runnable {
    public final e f19103a;
    public final i f19104b;

    public g(i iVar, e eVar) {
        this.f19104b = iVar;
        this.f19103a = eVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        i iVar2 = this.f19104b;
        l.k kVar = iVar2.f19121c;
        if (kVar != null && (iVar = kVar.f17671e) != null) {
            iVar.j0(kVar);
        }
        View view = (View) iVar2.f19124n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.f19103a;
            if (!eVar.b()) {
                if (eVar.f17728e != null) {
                    eVar.d(0, 0, false, false);
                }
            }
            iVar2.I = eVar;
        }
        iVar2.K = null;
    }
}
