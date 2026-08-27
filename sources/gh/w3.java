package gh;

import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.n41;

public final class w3 extends f2.w {

    public final y3 f7604c;

    public w3(y3 y3Var) {
        this.f7604c = y3Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        y3 y3Var = this.f7604c;
        bz bzVar = y3Var.W;
        b51 b51Var = y3Var.Z;
        if (b51Var == null) {
            return bzVar.J;
        }
        n41 n41VarG = b51Var.G(i10 - 1);
        return (n41VarG == null || (i11 = n41VarG.f30853u) == -1) ? bzVar.J : i11;
    }
}
