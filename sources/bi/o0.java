package bi;

import android.content.Context;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
public final class o0 extends l41 {
    public final int P;

    public o0(pj0 pj0Var, Context context, int i7, int i10, boolean z9, v10 v10Var, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(pj0Var, context, i7, i10, z9, v10Var, f6Var);
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
                if (i7 == org.telegram.ui.ActionBar.k6.f27940i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.k6.w0(i7, this.f35513x);
            default:
                return super.I(i7);
        }
    }
}
