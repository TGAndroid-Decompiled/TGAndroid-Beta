package lh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.w51;
public final class q3 extends f2.v {
    public final s3 f12907c;

    public q3(s3 s3Var) {
        this.f12907c = s3Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        s3 s3Var = this.f12907c;
        pz pzVar = s3Var.X;
        w51 w51Var = s3Var.f12964a0;
        if (w51Var == null) {
            return pzVar.J;
        }
        h51 G = w51Var.G(i10 - 1);
        if (G != null && (i11 = G.f27384u) != -1) {
            return i11;
        }
        return pzVar.J;
    }
}
