package ci;

import android.content.Context;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.tj0;
public final class j0 extends f41 {
    public final int Q;

    public j0(tj0 tj0Var, Context context, int i3, int i10, boolean z10, n10 n10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(tj0Var, context, i3, i10, z10, n10Var, e6Var);
        this.Q = i11;
    }

    @Override
    public boolean D(u4.d1 d1Var) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.D(d1Var);
        }
    }

    @Override
    public int I(int i3) {
        switch (this.Q) {
            case 1:
                if (i3 == org.telegram.ui.ActionBar.k6.f27971i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.k6.w0(i3, this.f33701x);
            default:
                return super.I(i3);
        }
    }
}
