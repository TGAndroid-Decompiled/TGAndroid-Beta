package bi;

import android.content.Context;
import hi.l9;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.yi;
public final class f6 extends h51 {
    public final int f3631n3 = 0;
    public final Object f3632o3;

    public f6(e51 e51Var, e51 e51Var2, org.telegram.ui.Components.d dVar, d51 d51Var, d51 d51Var2) {
        super(e51Var2, dVar, d51Var, d51Var2);
        this.f3632o3 = e51Var;
    }

    @Override
    public boolean E0(float f10) {
        int i7;
        switch (this.f3631n3) {
            case 2:
                ui uiVar = ((ej) this.f3632o3).f37519b;
                int L = org.telegram.messenger.g0.L(30.0f) + uiVar.Z3[0];
                if (!uiVar.f40370b2) {
                    i7 = org.telegram.messenger.g0.f24040m;
                } else {
                    i7 = 0;
                }
                if (f10 < L + i7) {
                    return false;
                }
                return true;
            default:
                return super.E0(f10);
        }
    }

    @Override
    public void F1() {
        switch (this.f3631n3) {
            case 2:
                ej ejVar = (ej) this.f3632o3;
                ejVar.f37519b.N1(ejVar, 0);
                return;
            default:
                return;
        }
    }

    @Override
    public void K1() {
        switch (this.f3631n3) {
            case 1:
                org.telegram.messenger.g0.d0(((l9) this.f3632o3).f15697b, new ai.h0(this, 27));
                return;
            default:
                return;
        }
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f3631n3) {
            case 1:
                return 0;
            default:
                return super.V0(i7);
        }
    }

    @Override
    public void l0(int i7) {
        org.telegram.ui.web.i iVar;
        switch (this.f3631n3) {
            case 4:
                if (!canScrollVertically(1) && (iVar = ((org.telegram.ui.web.k) this.f3632o3).E) != null && iVar.h) {
                    iVar.d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f3631n3) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                ((gq0) this.f3632o3).p();
                return;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                ej ejVar = (ej) this.f3632o3;
                ejVar.f37519b.N1(ejVar, 0);
                return;
            case 3:
                super.onLayout(z10, i7, i10, i11, i12);
                ((e51) this.f3632o3).f34683c = -1;
                return;
        }
    }

    public f6(l9 l9Var, Context context, int i7, hi.r3 r3Var, di.v6 v6Var, fi.b bVar) {
        super(context, i7, 0, false, r3Var, v6Var, null, bVar, -1, 0);
        this.f3632o3 = l9Var;
    }

    public f6(org.telegram.ui.web.k kVar, Context context, int i7, org.telegram.ui.web.b bVar, org.telegram.ui.web.a aVar, hi.c5 c5Var) {
        super(context, i7, 0, false, bVar, aVar, null, c5Var);
        this.f3632o3 = kVar;
    }

    public f6(ej ejVar, Context context, int i7, org.telegram.ui.Components.d dVar, yi yiVar, yi yiVar2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, 0, false, dVar, yiVar, yiVar2, h6Var);
        this.f3632o3 = ejVar;
    }

    public f6(Context context, int i7, b bVar, d6 d6Var, d6 d6Var2, org.telegram.ui.ActionBar.h6 h6Var, gq0 gq0Var) {
        super(context, i7, 0, false, bVar, d6Var, d6Var2, h6Var, 3, 1);
        this.f3632o3 = gq0Var;
    }
}
