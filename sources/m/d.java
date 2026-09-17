package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f14159l = 0;
    public final h f14160m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f14160m = hVar;
        this.f13804f = 8388613;
        ka.c cVar = hVar.M;
        this.h = cVar;
        l.s sVar = this.f13806i;
        if (sVar != null) {
            sVar.e(cVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f14159l) {
            case 0:
                h hVar = this.f14160m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f14160m;
                l.k kVar = hVar2.f14196c;
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
        this.f14160m = hVar;
        if ((d0Var.A.f13788x & 32) != 32) {
            View view2 = hVar.f14199r;
            this.e = view2 == null ? (View) hVar.f14198n : view2;
        }
        ka.c cVar = hVar.M;
        this.h = cVar;
        l.s sVar = this.f13806i;
        if (sVar != null) {
            sVar.e(cVar);
        }
    }
}
