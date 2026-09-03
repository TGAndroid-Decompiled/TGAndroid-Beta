package lh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.w51;
public final class o1 extends f2.v {
    public final g2 f12876c;

    public o1(g2 g2Var) {
        this.f12876c = g2Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        g2 g2Var = this.f12876c;
        pz pzVar = g2Var.f12767g0;
        w51 w51Var = g2Var.V;
        if (w51Var != null && i10 != 0) {
            h51 G = w51Var.G(i10 - 1);
            if (G != null && (i11 = G.f27384u) != -1) {
                return i11;
            }
            return pzVar.J;
        }
        return pzVar.J;
    }
}
