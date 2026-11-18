package di;

import android.content.Context;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.z41;
public final class f0 extends z41 {
    public final int Q;

    public f0(ck0 ck0Var, Context context, int i7, int i10, boolean z10, q10 q10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11) {
        super(ck0Var, context, i7, i10, z10, q10Var, i6Var);
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
                if (i7 == org.telegram.ui.ActionBar.n6.f29487i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.n6.w0(i7, this.f42812x);
            default:
                return super.I(i7);
        }
    }
}
