package di;

import android.content.Context;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
public final class f0 extends b51 {
    public final int Q;

    public f0(ek0 ek0Var, Context context, int i7, int i10, boolean z10, p10 p10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11) {
        super(ek0Var, context, i7, i10, z10, p10Var, i6Var);
        this.Q = i11;
    }

    @Override
    public boolean D(v4.f1 f1Var) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.D(f1Var);
        }
    }

    @Override
    public int I(int i7) {
        switch (this.Q) {
            case 1:
                if (i7 == org.telegram.ui.ActionBar.n6.f29542i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.n6.w0(i7, this.f33634x);
            default:
                return super.I(i7);
        }
    }
}
