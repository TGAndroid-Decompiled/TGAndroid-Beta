package ih;

import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.w41;
public final class p1 extends f2.v {
    public final h2 f9322c;

    public p1(h2 h2Var) {
        this.f9322c = h2Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        h2 h2Var = this.f9322c;
        iz izVar = h2Var.f9209f0;
        k51 k51Var = h2Var.U;
        if (k51Var != null && i10 != 0) {
            w41 G = k51Var.G(i10 - 1);
            if (G != null && (i11 = G.f34309u) != -1) {
                return i11;
            }
            return izVar.J;
        }
        return izVar.J;
    }
}
