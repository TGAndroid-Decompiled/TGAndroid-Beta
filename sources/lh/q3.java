package lh;

import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.x51;
public final class q3 extends f2.v {
    public final s3 f12905c;

    public q3(s3 s3Var) {
        this.f12905c = s3Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        s3 s3Var = this.f12905c;
        pz pzVar = s3Var.X;
        x51 x51Var = s3Var.f12962a0;
        if (x51Var == null) {
            return pzVar.J;
        }
        j51 G = x51Var.G(i10 - 1);
        if (G != null && (i11 = G.f28023u) != -1) {
            return i11;
        }
        return pzVar.J;
    }
}
