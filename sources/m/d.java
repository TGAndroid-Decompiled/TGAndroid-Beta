package m;

import android.content.Context;
import android.view.View;
public final class d extends l.w {
    public final int f14406l = 0;
    public final h f14407m;

    public d(h hVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, 2130968608, 0);
        this.f14407m = hVar;
        this.f14032f = 8388613;
        k2.u uVar = hVar.M;
        this.h = uVar;
        l.t tVar = this.f14034i;
        if (tVar != null) {
            tVar.e(uVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f14406l) {
            case 0:
                h hVar = this.f14407m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f14407m;
                l.l lVar = hVar2.f14443c;
                if (lVar != null) {
                    lVar.c(true);
                }
                hVar2.I = null;
                super.c();
                return;
        }
    }

    public d(h hVar, Context context, l.e0 e0Var, View view) {
        super(context, e0Var, view, false, 2130968608, 0);
        this.f14407m = hVar;
        if ((e0Var.A.f14016x & 32) != 32) {
            View view2 = hVar.f14446r;
            this.e = view2 == null ? (View) hVar.f14445n : view2;
        }
        k2.u uVar = hVar.M;
        this.h = uVar;
        l.t tVar = this.f14034i;
        if (tVar != null) {
            tVar.e(uVar);
        }
    }
}
