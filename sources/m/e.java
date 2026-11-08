package m;

import android.content.Context;
import android.view.View;
public final class e extends l.v {
    public final int f19081l = 0;
    public final i f19082m;

    public e(i iVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f19082m = iVar;
        this.f17732f = 8388613;
        gf.g gVar = iVar.M;
        this.h = gVar;
        l.s sVar = this.f17734i;
        if (sVar != null) {
            sVar.h(gVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f19081l) {
            case 0:
                i iVar = this.f19082m;
                iVar.J = null;
                iVar.getClass();
                super.c();
                return;
            default:
                i iVar2 = this.f19082m;
                l.k kVar = iVar2.f19124c;
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
        this.f19082m = iVar;
        if ((d0Var.A.f17715x & 32) != 32) {
            View view2 = iVar.f19128r;
            this.f17731e = view2 == null ? (View) iVar.f19127n : view2;
        }
        gf.g gVar = iVar.M;
        this.h = gVar;
        l.s sVar = this.f17734i;
        if (sVar != null) {
            sVar.h(gVar);
        }
    }
}
