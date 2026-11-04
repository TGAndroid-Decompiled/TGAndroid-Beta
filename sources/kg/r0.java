package kg;

import java.util.ArrayList;
import org.telegram.messenger.ii;
import org.telegram.ui.Cells.g2;
import org.telegram.ui.Components.x80;
public final class r0 implements ii, g2 {
    public final e1 f17163a;

    public r0(e1 e1Var) {
        this.f17163a = e1Var;
    }

    @Override
    public void h(String str, ArrayList arrayList) {
        boolean z10;
        e1 e1Var = this.f17163a;
        e1Var.O = arrayList;
        e1Var.J = null;
        e1Var.B0 = null;
        e1Var.f17021y = null;
        e1Var.E = null;
        e1Var.K = null;
        e1Var.R = null;
        e1Var.N = null;
        e1Var.L = null;
        e1Var.Q = null;
        e1Var.f();
        x80 x80Var = e1Var.W;
        ArrayList arrayList2 = e1Var.O;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        x80Var.a(z10);
    }
}
