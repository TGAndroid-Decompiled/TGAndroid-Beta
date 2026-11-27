package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class kc6 extends vc6 {
    public boolean e0;
    public final uc6 f0;

    public kc6(uc6 uc6Var, Context context, int i, long j, vnb vnbVar, boolean z, boolean z2) {
        super(context, i, j, false, vnbVar, false, z, z2);
        this.f0 = uc6Var;
        this.e0 = true;
    }

    @Override
    public final void J() {
        this.f0.B0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i;
        uc6 uc6Var = this.f0;
        r47 r47Var = uc6Var.J0;
        if (r47Var != null && r47Var.C3()) {
            int i2 = 0;
            if (arrayList != null) {
                i = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    pc6 pc6Var = (pc6) arrayList.get(i3);
                    if (pc6Var != null && !lbc.D(pc6Var.c)) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            if (this.e0 && i == 1) {
                uc6Var.q0 = ((pc6) arrayList.get(0)).a;
            }
            this.e0 = false;
            sla slaVar = uc6Var.W;
            if (i != 1) {
                i2 = 8;
            }
            slaVar.setVisibility(i2);
        }
        super.N(arrayList);
    }
}
