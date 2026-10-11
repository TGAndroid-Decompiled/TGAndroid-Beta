package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f15704l = 0;
    public final h f15705m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f15705m = hVar;
        this.f15335f = 8388613;
        a4.l lVar = hVar.M;
        this.h = lVar;
        l.s sVar = this.f15337i;
        if (sVar != null) {
            sVar.h(lVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f15704l) {
            case 0:
                h hVar = this.f15705m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f15705m;
                l.k kVar = hVar2.f15743c;
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
        this.f15705m = hVar;
        if ((d0Var.A.f15318x & 32) != 32) {
            View view2 = hVar.f15747r;
            this.f15334e = view2 == null ? (View) hVar.f15746n : view2;
        }
        a4.l lVar = hVar.M;
        this.h = lVar;
        l.s sVar = this.f15337i;
        if (sVar != null) {
            sVar.h(lVar);
        }
    }
}
