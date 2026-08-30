package kh;

import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;
public final class q3 extends f2.v {
    public final s3 f10762c;

    public q3(s3 s3Var) {
        this.f10762c = s3Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        s3 s3Var = this.f10762c;
        nz nzVar = s3Var.X;
        w51 w51Var = s3Var.f10815a0;
        if (w51Var == null) {
            return nzVar.J;
        }
        i51 G = w51Var.G(i10 - 1);
        if (G != null && (i11 = G.f25574u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
