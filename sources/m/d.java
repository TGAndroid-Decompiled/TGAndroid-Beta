package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f15668l = 0;
    public final h f15669m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f15669m = hVar;
        this.f15299f = 8388613;
        a4.l lVar = hVar.M;
        this.h = lVar;
        l.s sVar = this.f15301i;
        if (sVar != null) {
            sVar.h(lVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f15668l) {
            case 0:
                h hVar = this.f15669m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f15669m;
                l.k kVar = hVar2.f15707c;
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
        this.f15669m = hVar;
        if ((d0Var.A.f15282x & 32) != 32) {
            View view2 = hVar.f15711r;
            this.f15298e = view2 == null ? (View) hVar.f15710n : view2;
        }
        a4.l lVar = hVar.M;
        this.h = lVar;
        l.s sVar = this.f15301i;
        if (sVar != null) {
            sVar.h(lVar);
        }
    }
}
