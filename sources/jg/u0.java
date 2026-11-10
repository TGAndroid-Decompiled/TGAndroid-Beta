package jg;

import java.util.ArrayList;
import org.telegram.messenger.ri;
import org.telegram.ui.Cells.g2;
import org.telegram.ui.Components.b90;
public final class u0 implements ri, g2 {
    public final i1 f16944a;

    public u0(i1 i1Var) {
        this.f16944a = i1Var;
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        boolean z9;
        i1 i1Var = this.f16944a;
        i1Var.N = arrayList;
        i1Var.I = null;
        i1Var.A0 = null;
        i1Var.f16805y = null;
        i1Var.D = null;
        i1Var.J = null;
        i1Var.Q = null;
        i1Var.M = null;
        i1Var.K = null;
        i1Var.P = null;
        i1Var.f();
        b90 b90Var = i1Var.V;
        ArrayList arrayList2 = i1Var.N;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        b90Var.a(z9);
    }
}
