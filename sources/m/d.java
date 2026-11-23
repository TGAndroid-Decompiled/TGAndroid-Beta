package m;

import android.content.Context;
import android.view.View;
import hi.u5;
public final class d extends l.v {
    public final int f20024l = 0;
    public final h f20025m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f20025m = hVar;
        this.f19235f = 8388613;
        u5 u5Var = hVar.N;
        this.h = u5Var;
        l.s sVar = this.f19237i;
        if (sVar != null) {
            sVar.h(u5Var);
        }
    }

    @Override
    public final void c() {
        switch (this.f20024l) {
            case 0:
                h hVar = this.f20025m;
                hVar.K = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f20025m;
                l.k kVar = hVar2.f20067c;
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
        this.f20025m = hVar;
        if ((d0Var.A.f19218x & 32) != 32) {
            View view2 = hVar.f20071r;
            this.f19234e = view2 == null ? (View) hVar.f20070n : view2;
        }
        u5 u5Var = hVar.N;
        this.h = u5Var;
        l.s sVar = this.f19237i;
        if (sVar != null) {
            sVar.h(u5Var);
        }
    }
}
