package fh;

import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zy;
public final class v1 extends f2.x {
    public final p2 f6812c;

    public v1(p2 p2Var) {
        this.f6812c = p2Var;
    }

    @Override
    public final int i(int i9) {
        int i10;
        p2 p2Var = this.f6812c;
        zy zyVar = p2Var.f6684f0;
        z41 z41Var = p2Var.U;
        if (z41Var != null && i9 != 0) {
            l41 G = z41Var.G(i9 - 1);
            if (G != null && (i10 = G.f30348u) != -1) {
                return i10;
            }
            return zyVar.J;
        }
        return zyVar.J;
    }
}
