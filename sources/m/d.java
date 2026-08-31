package m;

import android.content.Context;
import android.view.View;
public final class d extends l.w {
    public final int f13161l = 0;
    public final h f13162m;

    public d(h hVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, 2130968608, 0);
        this.f13162m = hVar;
        this.f11456f = 8388613;
        y5.h hVar2 = hVar.J;
        this.h = hVar2;
        l.t tVar = this.f11458i;
        if (tVar != null) {
            tVar.h(hVar2);
        }
    }

    @Override
    public final void c() {
        switch (this.f13161l) {
            case 0:
                h hVar = this.f13162m;
                hVar.G = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f13162m;
                l.l lVar = hVar2.f13202c;
                if (lVar != null) {
                    lVar.c(true);
                }
                hVar2.F = null;
                super.c();
                return;
        }
    }

    public d(h hVar, Context context, l.e0 e0Var, View view) {
        super(context, e0Var, view, false, 2130968608, 0);
        this.f13162m = hVar;
        if ((e0Var.A.f11439x & 32) != 32) {
            View view2 = hVar.f13206r;
            this.f11455e = view2 == null ? (View) hVar.f13205n : view2;
        }
        y5.h hVar2 = hVar.J;
        this.h = hVar2;
        l.t tVar = this.f11458i;
        if (tVar != null) {
            tVar.h(hVar2);
        }
    }
}
