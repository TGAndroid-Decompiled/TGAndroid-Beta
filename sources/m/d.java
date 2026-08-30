package m;

import android.content.Context;
import android.view.View;
public final class d extends l.v {
    public final int f13475l = 0;
    public final h f13476m;

    public d(h hVar, Context context, l.k kVar, View view) {
        super(context, kVar, view, true, 2130968608, 0);
        this.f13476m = hVar;
        this.f11098f = 8388613;
        androidx.biometric.f0 f0Var = hVar.J;
        this.h = f0Var;
        l.s sVar = this.f11100i;
        if (sVar != null) {
            sVar.h(f0Var);
        }
    }

    @Override
    public final void c() {
        switch (this.f13475l) {
            case 0:
                h hVar = this.f13476m;
                hVar.G = null;
                hVar.getClass();
                super.c();
                return;
            default:
                h hVar2 = this.f13476m;
                l.k kVar = hVar2.f13508c;
                if (kVar != null) {
                    kVar.c(true);
                }
                hVar2.F = null;
                super.c();
                return;
        }
    }

    public d(h hVar, Context context, l.d0 d0Var, View view) {
        super(context, d0Var, view, false, 2130968608, 0);
        this.f13476m = hVar;
        if ((d0Var.A.f11082x & 32) != 32) {
            View view2 = hVar.f13511r;
            this.e = view2 == null ? (View) hVar.f13510n : view2;
        }
        androidx.biometric.f0 f0Var = hVar.J;
        this.h = f0Var;
        l.s sVar = this.f11100i;
        if (sVar != null) {
            sVar.h(f0Var);
        }
    }
}
