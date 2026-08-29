package m;

import android.view.View;
public final class g implements Runnable {
    public final e f16546a;
    public final i f16547b;

    public g(i iVar, e eVar) {
        this.f16547b = iVar;
        this.f16546a = eVar;
    }

    @Override
    public final void run() {
        l.i iVar;
        i iVar2 = this.f16547b;
        l.k kVar = iVar2.f16563c;
        if (kVar != null && (iVar = kVar.f13985e) != null) {
            iVar.i(kVar);
        }
        View view = (View) iVar2.f16566n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.f16546a;
            if (!eVar.b()) {
                if (eVar.f14042e != null) {
                    eVar.d(0, 0, false, false);
                }
            }
            iVar2.E = eVar;
        }
        iVar2.G = null;
    }
}
