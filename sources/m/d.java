package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f20121l = 0;
    public final h f20122m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f20122m = hVar;
        this.f19334f = 8388613;
        hi.u0 u0Var = hVar.N;
        this.h = u0Var;
        l.s sVar = this.f19336i;
        if (sVar != null) {
            sVar.h(u0Var);
        }
    }

    @Override
    public final void c() {
        switch (this.f20121l) {
            case 0:
                h hVar = this.f20122m;
                hVar.K = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f20122m;
                l.k kVar = hVar2.f20164c;
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
        this.f20122m = hVar;
        if ((d0Var.A.f19317x & 32) != 32) {
            View view2 = hVar.f20168r;
            this.f19333e = view2 == null ? (View) hVar.f20167n : view2;
        }
        hi.u0 u0Var = hVar.N;
        this.h = u0Var;
        l.s sVar = this.f19336i;
        if (sVar != null) {
            sVar.h(u0Var);
        }
    }
}
