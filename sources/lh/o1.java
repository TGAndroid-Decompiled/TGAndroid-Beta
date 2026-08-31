package lh;

import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.x51;
public final class o1 extends f2.v {
    public final g2 f12874c;

    public o1(g2 g2Var) {
        this.f12874c = g2Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        g2 g2Var = this.f12874c;
        pz pzVar = g2Var.f12765g0;
        x51 x51Var = g2Var.V;
        if (x51Var != null && i10 != 0) {
            j51 G = x51Var.G(i10 - 1);
            if (G != null && (i11 = G.f28023u) != -1) {
                return i11;
            }
            return pzVar.J;
        }
        return pzVar.J;
    }
}
