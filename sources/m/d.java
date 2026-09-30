package m;

import android.content.Context;
import android.view.View;
public final class d extends l.w {
    public final int f14391l = 0;
    public final h f14392m;

    public d(h hVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, 2130968608, 0);
        this.f14392m = hVar;
        this.f14017f = 8388613;
        k2.u uVar = hVar.M;
        this.h = uVar;
        l.t tVar = this.f14019i;
        if (tVar != null) {
            tVar.e(uVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f14391l) {
            case 0:
                h hVar = this.f14392m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f14392m;
                l.l lVar = hVar2.f14428c;
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
        this.f14392m = hVar;
        if ((e0Var.A.f14001x & 32) != 32) {
            View view2 = hVar.f14431r;
            this.e = view2 == null ? (View) hVar.f14430n : view2;
        }
        k2.u uVar = hVar.M;
        this.h = uVar;
        l.t tVar = this.f14019i;
        if (tVar != null) {
            tVar.e(uVar);
        }
    }
}
