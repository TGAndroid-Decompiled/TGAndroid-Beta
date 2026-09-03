package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f13459l = 0;
    public final h f13460m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f13460m = hVar;
        this.f11208f = 8388613;
        bb.b bVar = hVar.J;
        this.h = bVar;
        l.s sVar = this.f11210i;
        if (sVar != null) {
            sVar.h(bVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f13459l) {
            case 0:
                h hVar = this.f13460m;
                hVar.G = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f13460m;
                l.k kVar = hVar2.f13492c;
                if (kVar != null) {
                    kVar.c(true);
                }
                hVar2.F = null;
                super.c();
                return;
        }
    }

    public d(h hVar, Context context, l.d0 d0Var, View view) {
        super(context, d0Var, view, false, 2130968608, 0);
        this.f13460m = hVar;
        if ((d0Var.A.f11192x & 32) != 32) {
            View view2 = hVar.f13495r;
            this.e = view2 == null ? (View) hVar.f13494n : view2;
        }
        bb.b bVar = hVar.J;
        this.h = bVar;
        l.s sVar = this.f11210i;
        if (sVar != null) {
            sVar.h(bVar);
        }
    }
}
