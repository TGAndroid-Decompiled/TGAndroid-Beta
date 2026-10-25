package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f17689l = 0;
    public final h f17690m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f17690m = hVar;
        this.f16777f = 8388613;
        jg.i iVar = hVar.M;
        this.h = iVar;
        l.s sVar = this.f16779i;
        if (sVar != null) {
            sVar.e(iVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f17689l) {
            case 0:
                h hVar = this.f17690m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f17690m;
                l.k kVar = hVar2.f17728c;
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
        this.f17690m = hVar;
        if ((d0Var.A.f16761x & 32) != 32) {
            View view2 = hVar.f17731r;
            this.e = view2 == null ? (View) hVar.f17730n : view2;
        }
        jg.i iVar = hVar.M;
        this.h = iVar;
        l.s sVar = this.f16779i;
        if (sVar != null) {
            sVar.e(iVar);
        }
    }
}
