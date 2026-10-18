package m;

import android.content.Context;
import android.view.View;
public final class e extends l.v {
    public final int f16177l = 0;
    public final i f16178m;

    public e(i iVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f16178m = iVar;
        this.f15810f = 8388613;
        k0.b bVar = iVar.M;
        this.h = bVar;
        l.s sVar = this.f15812i;
        if (sVar != null) {
            sVar.h(bVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f16177l) {
            case 0:
                i iVar = this.f16178m;
                iVar.J = null;
                iVar.getClass();
                super.c();
                return;
            default:
                i iVar2 = this.f16178m;
                l.k kVar = iVar2.f16217c;
                if (kVar != null) {
                    kVar.c(true);
                }
                iVar2.I = null;
                super.c();
                return;
        }
    }

    public e(i iVar, Context context, l.d0 d0Var, View view) {
        super(context, d0Var, view, false, 2130968608, 0);
        this.f16178m = iVar;
        if ((d0Var.A.f15794x & 32) != 32) {
            View view2 = iVar.f16220r;
            this.e = view2 == null ? (View) iVar.f16219n : view2;
        }
        k0.b bVar = iVar.M;
        this.h = bVar;
        l.s sVar = this.f15812i;
        if (sVar != null) {
            sVar.h(bVar);
        }
    }
}
