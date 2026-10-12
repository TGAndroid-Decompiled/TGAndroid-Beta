package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f15395l = 0;
    public final h f15396m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f15396m = hVar;
        this.f15044f = 8388613;
        k2.g0 g0Var = hVar.M;
        this.h = g0Var;
        l.s sVar = this.f15046i;
        if (sVar != null) {
            sVar.h(g0Var);
        }
    }

    @Override
    public final void c() {
        switch (this.f15395l) {
            case 0:
                h hVar = this.f15396m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f15396m;
                l.k kVar = hVar2.f15429c;
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
        this.f15396m = hVar;
        if ((d0Var.A.f15027x & 32) != 32) {
            View view2 = hVar.f15433r;
            this.f15043e = view2 == null ? (View) hVar.f15432n : view2;
        }
        k2.g0 g0Var = hVar.M;
        this.h = g0Var;
        l.s sVar = this.f15046i;
        if (sVar != null) {
            sVar.h(g0Var);
        }
    }
}
