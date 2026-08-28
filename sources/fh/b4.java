package fh;

import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zy;
public final class b4 extends f2.x {
    public final d4 f6386c;

    public b4(d4 d4Var) {
        this.f6386c = d4Var;
    }

    @Override
    public final int i(int i9) {
        int i10;
        d4 d4Var = this.f6386c;
        zy zyVar = d4Var.W;
        z41 z41Var = d4Var.Z;
        if (z41Var == null) {
            return zyVar.J;
        }
        l41 G = z41Var.G(i9 - 1);
        if (G != null && (i10 = G.f30348u) != -1) {
            return i10;
        }
        return zyVar.J;
    }
}
