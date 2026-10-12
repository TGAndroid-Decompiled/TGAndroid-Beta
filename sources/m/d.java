package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f15077l = 0;
    public final h f15078m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f15078m = hVar;
        this.f14471f = 8388613;
        l2.f fVar = hVar.M;
        this.h = fVar;
        l.s sVar = this.f14473i;
        if (sVar != null) {
            sVar.h(fVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f15077l) {
            case 0:
                h hVar = this.f15078m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f15078m;
                l.k kVar = hVar2.f15114c;
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
        this.f15078m = hVar;
        if ((d0Var.A.f14455x & 32) != 32) {
            View view2 = hVar.f15117r;
            this.e = view2 == null ? (View) hVar.f15116n : view2;
        }
        l2.f fVar = hVar.M;
        this.h = fVar;
        l.s sVar = this.f14473i;
        if (sVar != null) {
            sVar.h(fVar);
        }
    }
}
