package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class ga6 extends ra6 {
    public boolean e0;
    public final qa6 f0;

    public ga6(qa6 qa6Var, Context context, int i, long j, wjb wjbVar, boolean z, boolean z2) {
        super(context, i, j, false, wjbVar, false, z, z2);
        this.f0 = qa6Var;
        this.e0 = true;
    }

    @Override
    public final void J() {
        this.f0.A0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i;
        qa6 qa6Var = this.f0;
        k27 k27Var = qa6Var.J0;
        if (k27Var != null && k27Var.C3()) {
            int i2 = 0;
            if (arrayList != null) {
                i = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    la6 la6Var = (la6) arrayList.get(i3);
                    if (la6Var != null && !l7c.D(la6Var.c)) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            if (this.e0 && i == 1) {
                qa6Var.q0 = ((la6) arrayList.get(0)).a;
            }
            this.e0 = false;
            xha xhaVar = qa6Var.W;
            if (i != 1) {
                i2 = 8;
            }
            xhaVar.setVisibility(i2);
        }
        super.N(arrayList);
    }
}
