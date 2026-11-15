package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f19663l = 0;
    public final h f19664m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f19664m = hVar;
        this.f18874f = 8388613;
        ia.d dVar = hVar.N;
        this.h = dVar;
        l.s sVar = this.f18876i;
        if (sVar != null) {
            sVar.h(dVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f19663l) {
            case 0:
                h hVar = this.f19664m;
                hVar.K = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f19664m;
                l.k kVar = hVar2.f19706c;
                if (kVar != null) {
                    kVar.c(true);
                }
                hVar2.J = null;
                super.c();
                return;
        }
    }

    public d(h hVar, Context context, l.d0 d0Var, View view) {
        super(context, d0Var, view, false, 2130968608, 0);
        this.f19664m = hVar;
        if ((d0Var.A.f18857x & 32) != 32) {
            View view2 = hVar.f19710r;
            this.f18873e = view2 == null ? (View) hVar.f19709n : view2;
        }
        ia.d dVar = hVar.N;
        this.h = dVar;
        l.s sVar = this.f18876i;
        if (sVar != null) {
            sVar.h(dVar);
        }
    }
}
