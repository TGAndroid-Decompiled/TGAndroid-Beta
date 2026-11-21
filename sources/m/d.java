package m;

import android.content.Context;
import android.view.View;
import hi.t5;
public final class d extends l.v {
    public final int f20055l = 0;
    public final h f20056m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f20056m = hVar;
        this.f19266f = 8388613;
        t5 t5Var = hVar.N;
        this.h = t5Var;
        l.s sVar = this.f19268i;
        if (sVar != null) {
            sVar.h(t5Var);
        }
    }

    @Override
    public final void c() {
        switch (this.f20055l) {
            case 0:
                h hVar = this.f20056m;
                hVar.K = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f20056m;
                l.k kVar = hVar2.f20098c;
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
        this.f20056m = hVar;
        if ((d0Var.A.f19249x & 32) != 32) {
            View view2 = hVar.f20102r;
            this.f19265e = view2 == null ? (View) hVar.f20101n : view2;
        }
        t5 t5Var = hVar.N;
        this.h = t5Var;
        l.s sVar = this.f19268i;
        if (sVar != null) {
            sVar.h(t5Var);
        }
    }
}
