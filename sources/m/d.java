package m;

import android.content.Context;
import android.view.View;
import ii.n4;
public final class d extends l.v {
    public final int f15710l = 0;
    public final h f15711m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f15711m = hVar;
        this.f15232f = 8388613;
        n4 n4Var = hVar.M;
        this.h = n4Var;
        l.s sVar = this.f15234i;
        if (sVar != null) {
            sVar.h(n4Var);
        }
    }

    @Override
    public final void c() {
        switch (this.f15710l) {
            case 0:
                h hVar = this.f15711m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f15711m;
                l.k kVar = hVar2.f15750c;
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
        this.f15711m = hVar;
        if ((d0Var.A.f15215x & 32) != 32) {
            View view2 = hVar.f15754r;
            this.f15231e = view2 == null ? (View) hVar.f15753n : view2;
        }
        n4 n4Var = hVar.M;
        this.h = n4Var;
        l.s sVar = this.f15234i;
        if (sVar != null) {
            sVar.h(n4Var);
        }
    }
}
