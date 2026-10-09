package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f15643l = 0;
    public final h f15644m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f15644m = hVar;
        this.f15296f = 8388613;
        a4.l lVar = hVar.M;
        this.h = lVar;
        l.s sVar = this.f15298i;
        if (sVar != null) {
            sVar.h(lVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f15643l) {
            case 0:
                h hVar = this.f15644m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f15644m;
                l.k kVar = hVar2.f15682c;
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
        this.f15644m = hVar;
        if ((d0Var.A.f15279x & 32) != 32) {
            View view2 = hVar.f15686r;
            this.f15295e = view2 == null ? (View) hVar.f15685n : view2;
        }
        a4.l lVar = hVar.M;
        this.h = lVar;
        l.s sVar = this.f15298i;
        if (sVar != null) {
            sVar.h(lVar);
        }
    }
}
