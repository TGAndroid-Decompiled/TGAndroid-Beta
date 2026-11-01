package m;

import android.content.Context;
import android.view.View;
public final class d extends l.w {
    public final int f12385l = 0;
    public final h f12386m;

    public d(h hVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, 2130968608, 0);
        this.f12386m = hVar;
        this.f11556f = 8388613;
        k2.m0 m0Var = hVar.M;
        this.h = m0Var;
        l.t tVar = this.f11558i;
        if (tVar != null) {
            tVar.e(m0Var);
        }
    }

    @Override
    public final void c() {
        switch (this.f12385l) {
            case 0:
                h hVar = this.f12386m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f12386m;
                l.l lVar = hVar2.f12423c;
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
        this.f12386m = hVar;
        if ((e0Var.A.f11540x & 32) != 32) {
            View view2 = hVar.f12426r;
            this.e = view2 == null ? (View) hVar.f12425n : view2;
        }
        k2.m0 m0Var = hVar.M;
        this.h = m0Var;
        l.t tVar = this.f11558i;
        if (tVar != null) {
            tVar.e(m0Var);
        }
    }
}
