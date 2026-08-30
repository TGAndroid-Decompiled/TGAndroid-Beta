package kh;

import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;
public final class o1 extends f2.v {
    public final h2 f10732c;

    public o1(h2 h2Var) {
        this.f10732c = h2Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        h2 h2Var = this.f10732c;
        nz nzVar = h2Var.f10646g0;
        w51 w51Var = h2Var.V;
        if (w51Var != null && i10 != 0) {
            i51 G = w51Var.G(i10 - 1);
            if (G != null && (i11 = G.f25574u) != -1) {
                return i11;
            }
            return nzVar.J;
        }
        return nzVar.J;
    }
}
