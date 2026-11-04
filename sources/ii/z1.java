package ii;

import org.telegram.messenger.cs;
import org.telegram.ui.Components.pt0;
public final class z1 implements pt0 {
    public final int f15341a;
    public final cs f15342b;

    public z1(cs csVar, int i3) {
        this.f15341a = i3;
        this.f15342b = csVar;
    }

    @Override
    public final void K(int i3, boolean z10) {
        switch (this.f15341a) {
            case 0:
                r2 r2Var = ((a3) this.f15342b).f14824x;
                if (i3 > org.telegram.messenger.g0.L(20.0f)) {
                    r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((mi.c2) this.f15342b).getClass();
                return;
        }
    }
}
