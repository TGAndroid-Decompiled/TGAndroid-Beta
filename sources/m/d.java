package m;

import android.content.Context;
import android.view.View;
import gi.v5;
public final class d extends l.v {
    public final int f18551l = 0;
    public final h f18552m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f18552m = hVar;
        this.f17478f = 8388613;
        v5 v5Var = hVar.N;
        this.h = v5Var;
        l.s sVar = this.f17480i;
        if (sVar != null) {
            sVar.h(v5Var);
        }
    }

    @Override
    public final void c() {
        switch (this.f18551l) {
            case 0:
                h hVar = this.f18552m;
                hVar.K = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f18552m;
                l.k kVar = hVar2.f18594c;
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
        this.f18552m = hVar;
        if ((d0Var.A.f17461x & 32) != 32) {
            View view2 = hVar.f18598r;
            this.f17477e = view2 == null ? (View) hVar.f18597n : view2;
        }
        v5 v5Var = hVar.N;
        this.h = v5Var;
        l.s sVar = this.f17480i;
        if (sVar != null) {
            sVar.h(v5Var);
        }
    }
}
