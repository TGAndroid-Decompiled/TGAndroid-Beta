package gh;

import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.n41;

public final class s1 extends f2.w {

    public final k2 f7521c;

    public s1(k2 k2Var) {
        this.f7521c = k2Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k2 k2Var = this.f7521c;
        bz bzVar = k2Var.f7386f0;
        b51 b51Var = k2Var.U;
        if (b51Var == null || i10 == 0) {
            return bzVar.J;
        }
        n41 n41VarG = b51Var.G(i10 - 1);
        return (n41VarG == null || (i11 = n41VarG.f30853u) == -1) ? bzVar.J : i11;
    }
}
