package m;

import android.content.Context;
import android.view.View;
public final class e extends l.v {
    public final int f16241l = 0;
    public final i f16242m;

    public e(i iVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f16242m = iVar;
        this.f15874f = 8388613;
        k2.w0 w0Var = iVar.M;
        this.h = w0Var;
        l.s sVar = this.f15876i;
        if (sVar != null) {
            sVar.h(w0Var);
        }
    }

    @Override
    public final void c() {
        switch (this.f16241l) {
            case 0:
                i iVar = this.f16242m;
                iVar.J = null;
                iVar.getClass();
                super.c();
                return;
            default:
                i iVar2 = this.f16242m;
                l.k kVar = iVar2.f16281c;
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
        this.f16242m = iVar;
        if ((d0Var.A.f15858x & 32) != 32) {
            View view2 = iVar.f16284r;
            this.e = view2 == null ? (View) iVar.f16283n : view2;
        }
        k2.w0 w0Var = iVar.M;
        this.h = w0Var;
        l.s sVar = this.f15876i;
        if (sVar != null) {
            sVar.h(w0Var);
        }
    }
}
