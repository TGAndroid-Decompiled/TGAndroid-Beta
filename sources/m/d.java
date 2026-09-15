package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f14146l = 0;
    public final h f14147m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f14147m = hVar;
        this.f13794f = 8388613;
        ka.c cVar = hVar.M;
        this.h = cVar;
        l.s sVar = this.f13796i;
        if (sVar != null) {
            sVar.e(cVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f14146l) {
            case 0:
                h hVar = this.f14147m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f14147m;
                l.k kVar = hVar2.f14183c;
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
        this.f14147m = hVar;
        if ((d0Var.A.f13778x & 32) != 32) {
            View view2 = hVar.f14186r;
            this.e = view2 == null ? (View) hVar.f14185n : view2;
        }
        ka.c cVar = hVar.M;
        this.h = cVar;
        l.s sVar = this.f13796i;
        if (sVar != null) {
            sVar.e(cVar);
        }
    }
}
