package m;

import android.view.View;
public final class g implements Runnable {
    public final e f16200a;
    public final i f16201b;

    public g(i iVar, e eVar) {
        this.f16201b = iVar;
        this.f16200a = eVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        i iVar2 = this.f16201b;
        l.k kVar = iVar2.f16219c;
        if (kVar != null && (iVar = kVar.e) != null) {
            iVar.b(kVar);
        }
        View view = (View) iVar2.f16221n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.f16200a;
            if (!eVar.b()) {
                if (eVar.e != null) {
                    eVar.d(0, 0, false, false);
                }
            }
            iVar2.I = eVar;
        }
        iVar2.K = null;
    }
}
