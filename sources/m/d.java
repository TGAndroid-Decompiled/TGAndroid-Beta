package m;

import android.content.Context;
import android.view.View;
public final class d extends l.w {
    public final int f14385l = 0;
    public final h f14386m;

    public d(h hVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, 2130968608, 0);
        this.f14386m = hVar;
        this.f14004f = 8388613;
        ki.e0 e0Var = hVar.M;
        this.h = e0Var;
        l.t tVar = this.f14006i;
        if (tVar != null) {
            tVar.e(e0Var);
        }
    }

    @Override
    public final void c() {
        switch (this.f14385l) {
            case 0:
                h hVar = this.f14386m;
                hVar.J = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f14386m;
                l.l lVar = hVar2.f14422c;
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
        this.f14386m = hVar;
        if ((e0Var.A.f13988x & 32) != 32) {
            View view2 = hVar.f14425r;
            this.e = view2 == null ? (View) hVar.f14424n : view2;
        }
        ki.e0 e0Var2 = hVar.M;
        this.h = e0Var2;
        l.t tVar = this.f14006i;
        if (tVar != null) {
            tVar.e(e0Var2);
        }
    }
}
