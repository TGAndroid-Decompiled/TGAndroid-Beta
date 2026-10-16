package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f14814l = 0;
    public final i f14815m;

    public d(i iVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f14815m = iVar;
        this.f14473f = 8388613;
        h hVar = iVar.M;
        this.h = hVar;
        l.s sVar = this.f14475i;
        if (sVar != null) {
            sVar.h(hVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f14814l) {
            case 0:
                i iVar = this.f14815m;
                iVar.J = null;
                iVar.getClass();
                super.c();
                return;
            default:
                i iVar2 = this.f14815m;
                l.k kVar = iVar2.f14854c;
                if (kVar != null) {
                    kVar.c(true);
                }
                iVar2.I = null;
                super.c();
                return;
        }
    }

    public d(i iVar, Context context, l.d0 d0Var, View view) {
        super(context, d0Var, view, false, 2130968608, 0);
        this.f14815m = iVar;
        if ((d0Var.A.f14457x & 32) != 32) {
            View view2 = iVar.f14857r;
            this.e = view2 == null ? (View) iVar.f14856n : view2;
        }
        h hVar = iVar.M;
        this.h = hVar;
        l.s sVar = this.f14475i;
        if (sVar != null) {
            sVar.h(hVar);
        }
    }
}
