package m;

import android.view.View;
public final class g implements Runnable {
    public final e f19111a;
    public final i f19112b;

    public g(i iVar, e eVar) {
        this.f19112b = iVar;
        this.f19111a = eVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        i iVar2 = this.f19112b;
        l.k kVar = iVar2.f19129c;
        if (kVar != null && (iVar = kVar.f17677e) != null) {
            iVar.j0(kVar);
        }
        View view = (View) iVar2.f19132n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.f19111a;
            if (!eVar.b()) {
                if (eVar.f17734e != null) {
                    eVar.d(0, 0, false, false);
                }
            }
            iVar2.I = eVar;
        }
        iVar2.K = null;
    }
}
