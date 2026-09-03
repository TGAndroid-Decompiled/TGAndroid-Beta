package kh;

import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;
public final class p3 extends f2.v {
    public final r3 f10858c;

    public p3(r3 r3Var) {
        this.f10858c = r3Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        r3 r3Var = this.f10858c;
        nz nzVar = r3Var.X;
        w51 w51Var = r3Var.f10894a0;
        if (w51Var == null) {
            return nzVar.J;
        }
        i51 G = w51Var.G(i10 - 1);
        if (G != null && (i11 = G.f25594u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
