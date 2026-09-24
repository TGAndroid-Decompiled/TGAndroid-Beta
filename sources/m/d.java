package m;

import android.content.Context;
import android.view.View;
public final class d extends l.w {
    public final int f14375l = 0;
    public final h f14376m;

    public d(h hVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, 2130968608, 0);
        this.f14376m = hVar;
        this.f14001f = 8388613;
        k2.u uVar = hVar.M;
        this.h = uVar;
        l.t tVar = this.f14003i;
        if (tVar != null) {
            tVar.e(uVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f14375l) {
            case 0:
                h hVar = this.f14376m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f14376m;
                l.l lVar = hVar2.f14412c;
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
        this.f14376m = hVar;
        if ((e0Var.A.f13985x & 32) != 32) {
            View view2 = hVar.f14415r;
            this.e = view2 == null ? (View) hVar.f14414n : view2;
        }
        k2.u uVar = hVar.M;
        this.h = uVar;
        l.t tVar = this.f14003i;
        if (tVar != null) {
            tVar.e(uVar);
        }
    }
}
