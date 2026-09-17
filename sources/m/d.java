package m;

import android.content.Context;
import android.view.View;
public final class d extends l.w {
    public final int f15517l = 0;
    public final h f15518m;

    public d(h hVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, 2130968608, 0);
        this.f15518m = hVar;
        this.f15197f = 8388613;
        xa.c cVar = hVar.M;
        this.h = cVar;
        l.t tVar = this.f15199i;
        if (tVar != null) {
            tVar.h(cVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f15517l) {
            case 0:
                h hVar = this.f15518m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f15518m;
                l.l lVar = hVar2.f15557c;
                if (lVar != null) {
                    lVar.c(true);
                }
                hVar2.I = null;
                super.c();
                return;
        }
    }

    public d(h hVar, Context context, l.e0 e0Var, View view) {
        super(context, e0Var, view, false, 2130968608, 0);
        this.f15518m = hVar;
        if ((e0Var.A.f15180x & 32) != 32) {
            View view2 = hVar.f15561r;
            this.f15196e = view2 == null ? (View) hVar.f15560n : view2;
        }
        xa.c cVar = hVar.M;
        this.h = cVar;
        l.t tVar = this.f15199i;
        if (tVar != null) {
            tVar.h(cVar);
        }
    }
}
