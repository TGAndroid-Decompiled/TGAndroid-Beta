package m;

import android.content.Context;
import android.view.View;
public final class e extends l.v {
    public final int f16923l = 0;
    public final i f16924m;

    public e(i iVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f16924m = iVar;
        this.f16615f = 8388613;
        android.support.v4.media.c cVar = iVar.I;
        this.h = cVar;
        l.s sVar = this.f16617i;
        if (sVar != null) {
            sVar.h(cVar);
        }
    }

    @Override
    public final void c() {
        switch (this.f16923l) {
            case 0:
                i iVar = this.f16924m;
                iVar.F = null;
                iVar.getClass();
                super.c();
                return;
            default:
                i iVar2 = this.f16924m;
                l.k kVar = iVar2.f16964c;
                if (kVar != null) {
                    kVar.c(true);
                }
                iVar2.E = null;
                super.c();
                return;
        }
    }

    public e(i iVar, Context context, l.d0 d0Var, View view) {
        super(context, d0Var, view, false, 2130968608, 0);
        this.f16924m = iVar;
        if ((d0Var.A.f16598x & 32) != 32) {
            View view2 = iVar.f16968r;
            this.f16614e = view2 == null ? (View) iVar.f16967n : view2;
        }
        android.support.v4.media.c cVar = iVar.I;
        this.h = cVar;
        l.s sVar = this.f16617i;
        if (sVar != null) {
            sVar.h(cVar);
        }
    }
}
