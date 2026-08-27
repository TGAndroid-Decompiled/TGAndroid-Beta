package m;

import android.content.Context;
import android.view.View;

public final class e extends l.w {

    public final int f17298l = 0;

    public final i f17299m;

    public e(i iVar, Context context, l.l lVar, View view) {
        super(context, lVar, view, true, 2130968608, 0);
        this.f17299m = iVar;
        this.f15371f = 8388613;
        k5.i iVar2 = iVar.I;
        this.h = iVar2;
        l.t tVar = this.f15373i;
        if (tVar != null) {
            tVar.h(iVar2);
        }
    }

    @Override
    public final void c() {
        switch (this.f17298l) {
            case 0:
                i iVar = this.f17299m;
                iVar.F = null;
                iVar.getClass();
                super.c();
                break;
            default:
                i iVar2 = this.f17299m;
                l.l lVar = iVar2.f17339c;
                if (lVar != null) {
                    lVar.c(true);
                }
                iVar2.E = null;
                super.c();
                break;
        }
    }

    public e(i iVar, Context context, l.e0 e0Var, View view) {
        super(context, e0Var, view, false, 2130968608, 0);
        this.f17299m = iVar;
        if ((e0Var.A.f15354x & 32) != 32) {
            View view2 = iVar.f17343r;
            this.f15370e = view2 == null ? (View) iVar.f17342n : view2;
        }
        k5.i iVar2 = iVar.I;
        this.h = iVar2;
        l.t tVar = this.f15373i;
        if (tVar != null) {
            tVar.h(iVar2);
        }
    }
}
