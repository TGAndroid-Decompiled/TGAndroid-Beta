package jg;

import java.util.ArrayList;
import org.telegram.messenger.oi;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Components.q90;
public final class u0 implements oi, h2 {
    public final h1 f17705a;

    public u0(h1 h1Var) {
        this.f17705a = h1Var;
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        boolean z10;
        h1 h1Var = this.f17705a;
        h1Var.O = arrayList;
        h1Var.J = null;
        h1Var.B0 = null;
        h1Var.f17556y = null;
        h1Var.E = null;
        h1Var.K = null;
        h1Var.R = null;
        h1Var.N = null;
        h1Var.L = null;
        h1Var.Q = null;
        h1Var.f();
        q90 q90Var = h1Var.W;
        ArrayList arrayList2 = h1Var.O;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        q90Var.a(z10);
    }
}
