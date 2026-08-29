package ih;

import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.w41;
public final class q3 extends f2.v {
    public final s3 f9337c;

    public q3(s3 s3Var) {
        this.f9337c = s3Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        s3 s3Var = this.f9337c;
        iz izVar = s3Var.W;
        k51 k51Var = s3Var.Z;
        if (k51Var == null) {
            return izVar.J;
        }
        w41 G = k51Var.G(i10 - 1);
        if (G != null && (i11 = G.f34309u) != -1) {
            return i11;
        }
        return izVar.J;
    }
}
