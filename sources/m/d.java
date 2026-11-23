package m;

import android.content.Context;
import android.view.View;
import hi.t5;
public final class d extends l.v {
    public final int f20058l = 0;
    public final h f20059m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f20059m = hVar;
        this.f19269f = 8388613;
        t5 t5Var = hVar.N;
        this.h = t5Var;
        l.s sVar = this.f19271i;
        if (sVar != null) {
            sVar.h(t5Var);
        }
    }

    @Override
    public final void c() {
        switch (this.f20058l) {
            case 0:
                h hVar = this.f20059m;
                hVar.K = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f20059m;
                l.k kVar = hVar2.f20101c;
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
        this.f20059m = hVar;
        if ((d0Var.A.f19252x & 32) != 32) {
            View view2 = hVar.f20105r;
            this.f19268e = view2 == null ? (View) hVar.f20104n : view2;
        }
        t5 t5Var = hVar.N;
        this.h = t5Var;
        l.s sVar = this.f19271i;
        if (sVar != null) {
            sVar.h(t5Var);
        }
    }
}
