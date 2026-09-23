package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f14137l = 0;
    public final h f14138m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f14138m = hVar;
        this.f13780f = 8388613;
        ka.c cVar = hVar.M;
        this.h = cVar;
        l.s sVar = this.f13782i;
        if (sVar != null) {
            sVar.e(cVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f14137l) {
            case 0:
                h hVar = this.f14138m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f14138m;
                l.k kVar = hVar2.f14174c;
                if (kVar != null) {
                    kVar.c(true);
                }
                hVar2.I = null;
                super.c();
                return;
        }
    }

    public d(h hVar, Context context, l.d0 d0Var, View view) {
        super(context, d0Var, view, false, 2130968608, 0);
        this.f14138m = hVar;
        if ((d0Var.A.f13764x & 32) != 32) {
            View view2 = hVar.f14177r;
            this.e = view2 == null ? (View) hVar.f14176n : view2;
        }
        ka.c cVar = hVar.M;
        this.h = cVar;
        l.s sVar = this.f13782i;
        if (sVar != null) {
            sVar.e(cVar);
        }
    }
}
