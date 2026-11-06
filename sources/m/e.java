package m;

import android.content.Context;
import android.view.View;
public final class e extends l.v {
    public final int f19078l = 0;
    public final i f19079m;

    public e(i iVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f19079m = iVar;
        this.f17729f = 8388613;
        gf.g gVar = iVar.M;
        this.h = gVar;
        l.s sVar = this.f17731i;
        if (sVar != null) {
            sVar.h(gVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f19078l) {
            case 0:
                i iVar = this.f19079m;
                iVar.J = null;
                iVar.getClass();
                super.c();
                return;
            default:
                i iVar2 = this.f19079m;
                l.k kVar = iVar2.f19121c;
                if (kVar != null) {
                    kVar.c(true);
                }
                iVar2.I = null;
                super.c();
                return;
        }
    }

    public e(i iVar, Context context, l.d0 d0Var, View view) {
        super(context, d0Var, view, false, 2130968608, 0);
        this.f19079m = iVar;
        if ((d0Var.A.f17712x & 32) != 32) {
            View view2 = iVar.f19125r;
            this.f17728e = view2 == null ? (View) iVar.f19124n : view2;
        }
        gf.g gVar = iVar.M;
        this.h = gVar;
        l.s sVar = this.f17731i;
        if (sVar != null) {
            sVar.h(gVar);
        }
    }
}
