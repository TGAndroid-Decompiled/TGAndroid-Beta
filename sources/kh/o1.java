package kh;

import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;
public final class o1 extends f2.v {
    public final g2 f10844c;

    public o1(g2 g2Var) {
        this.f10844c = g2Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        g2 g2Var = this.f10844c;
        nz nzVar = g2Var.f10739g0;
        w51 w51Var = g2Var.V;
        if (w51Var != null && i10 != 0) {
            i51 G = w51Var.G(i10 - 1);
            if (G != null && (i11 = G.f25594u) != -1) {
                return i11;
            }
            return nzVar.J;
        }
        return nzVar.J;
    }
}
