package m;

import android.content.Context;
import android.view.View;
import hi.u5;
public final class d extends l.v {
    public final int f20030l = 0;
    public final h f20031m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f20031m = hVar;
        this.f19241f = 8388613;
        u5 u5Var = hVar.N;
        this.h = u5Var;
        l.s sVar = this.f19243i;
        if (sVar != null) {
            sVar.h(u5Var);
        }
    }

    @Override
    public final void c() {
        switch (this.f20030l) {
            case 0:
                h hVar = this.f20031m;
                hVar.K = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f20031m;
                l.k kVar = hVar2.f20073c;
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
        this.f20031m = hVar;
        if ((d0Var.A.f19224x & 32) != 32) {
            View view2 = hVar.f20077r;
            this.f19240e = view2 == null ? (View) hVar.f20076n : view2;
        }
        u5 u5Var = hVar.N;
        this.h = u5Var;
        l.s sVar = this.f19243i;
        if (sVar != null) {
            sVar.h(u5Var);
        }
    }
}
