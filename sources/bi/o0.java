package bi;

import android.content.Context;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
public final class o0 extends m41 {
    public final int P;

    public o0(qj0 qj0Var, Context context, int i7, int i10, boolean z9, v10 v10Var, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(qj0Var, context, i7, i10, z9, v10Var, g6Var);
        this.P = i11;
    }

    @Override
    public boolean D(v4.d1 d1Var) {
        switch (this.P) {
            case 0:
                return false;
            default:
                return super.D(d1Var);
        }
    }

    @Override
    public int I(int i7) {
        switch (this.P) {
            case 1:
                if (i7 == org.telegram.ui.ActionBar.l6.f27956i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.l6.w0(i7, this.f35948x);
            default:
                return super.I(i7);
        }
    }
}
