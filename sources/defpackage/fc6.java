package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class fc6 extends qc6 {
    public boolean e0;
    public final pc6 f0;

    public fc6(pc6 pc6Var, Context context, int i, long j, ylb ylbVar, boolean z, boolean z2) {
        super(context, i, j, false, ylbVar, false, z, z2);
        this.f0 = pc6Var;
        this.e0 = true;
    }

    @Override
    public final void J() {
        this.f0.B0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i;
        pc6 pc6Var = this.f0;
        k47 k47Var = pc6Var.J0;
        if (k47Var != null && k47Var.C3()) {
            int i2 = 0;
            if (arrayList != null) {
                i = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    kc6 kc6Var = (kc6) arrayList.get(i3);
                    if (kc6Var != null && !m9c.D(kc6Var.c)) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            if (this.e0 && i == 1) {
                pc6Var.q0 = ((kc6) arrayList.get(0)).a;
            }
            this.e0 = false;
            zja zjaVar = pc6Var.W;
            if (i != 1) {
                i2 = 8;
            }
            zjaVar.setVisibility(i2);
        }
        super.N(arrayList);
    }
}
