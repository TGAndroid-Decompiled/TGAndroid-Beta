package m;

import android.content.Context;
import android.view.View;
public final class e extends l.v {
    public final int f16522l = 0;
    public final i f16523m;

    public e(i iVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f16523m = iVar;
        this.f14043f = 8388613;
        m5.i iVar2 = iVar.I;
        this.h = iVar2;
        l.s sVar = this.f14045i;
        if (sVar != null) {
            sVar.g(iVar2);
        }
    }

    @Override
    public final void c() {
        switch (this.f16522l) {
            case 0:
                i iVar = this.f16523m;
                iVar.F = null;
                iVar.getClass();
                super.c();
                return;
            default:
                i iVar2 = this.f16523m;
                l.k kVar = iVar2.f16563c;
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
        this.f16523m = iVar;
        if ((d0Var.A.f14026x & 32) != 32) {
            View view2 = iVar.f16567r;
            this.f14042e = view2 == null ? (View) iVar.f16566n : view2;
        }
        m5.i iVar2 = iVar.I;
        this.h = iVar2;
        l.s sVar = this.f14045i;
        if (sVar != null) {
            sVar.g(iVar2);
        }
    }
}
