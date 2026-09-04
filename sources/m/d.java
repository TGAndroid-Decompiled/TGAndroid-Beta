package m;

import android.content.Context;
import android.view.View;
public final class d extends l.w {
    public final int f15490l = 0;
    public final h f15491m;

    public d(h hVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, 2130968608, 0);
        this.f15491m = hVar;
        this.f15171f = 8388613;
        xa.c cVar = hVar.M;
        this.h = cVar;
        l.t tVar = this.f15173i;
        if (tVar != null) {
            tVar.h(cVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f15490l) {
            case 0:
                h hVar = this.f15491m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f15491m;
                l.l lVar = hVar2.f15530c;
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
        this.f15491m = hVar;
        if ((e0Var.A.f15154x & 32) != 32) {
            View view2 = hVar.f15534r;
            this.f15170e = view2 == null ? (View) hVar.f15533n : view2;
        }
        xa.c cVar = hVar.M;
        this.h = cVar;
        l.t tVar = this.f15173i;
        if (tVar != null) {
            tVar.h(cVar);
        }
    }
}
