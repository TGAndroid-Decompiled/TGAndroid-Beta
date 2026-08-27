package m;

import android.view.View;

public final class g implements Runnable {

    public final e f17322a;

    public final i f17323b;

    public g(i iVar, e eVar) {
        this.f17323b = iVar;
        this.f17322a = eVar;
    }

    @Override
    public final void run() {
        l.j jVar;
        i iVar = this.f17323b;
        l.l lVar = iVar.f17339c;
        if (lVar != null && (jVar = lVar.f15313e) != null) {
            jVar.k(lVar);
        }
        View view = (View) iVar.f17342n;
        if (view != null && view.getWindowToken() != null) {
            e eVar = this.f17322a;
            if (eVar.b()) {
                iVar.E = eVar;
            } else if (eVar.f15370e != null) {
                eVar.d(0, 0, false, false);
                iVar.E = eVar;
            }
        }
        iVar.G = null;
    }
}
