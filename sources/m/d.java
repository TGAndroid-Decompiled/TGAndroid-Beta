package m;

import android.content.Context;
import android.view.View;
public final class d extends l.w {
    public final int f12982l = 0;
    public final h f12983m;

    public d(h hVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, 2130968608, 0);
        this.f12983m = hVar;
        this.f12686f = 8388613;
        a6.i iVar = hVar.M;
        this.h = iVar;
        l.t tVar = this.f12688i;
        if (tVar != null) {
            tVar.h(iVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f12982l) {
            case 0:
                h hVar = this.f12983m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f12983m;
                l.l lVar = hVar2.f13021c;
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
        this.f12983m = hVar;
        if ((e0Var.A.f12670x & 32) != 32) {
            View view2 = hVar.f13024r;
            this.e = view2 == null ? (View) hVar.f13023n : view2;
        }
        a6.i iVar = hVar.M;
        this.h = iVar;
        l.t tVar = this.f12688i;
        if (tVar != null) {
            tVar.h(iVar);
        }
    }
}
