package di;

import android.content.Context;
import org.telegram.messenger.r10;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
public final class f0 extends c51 {
    public final int Q;

    public f0(ek0 ek0Var, Context context, int i7, int i10, boolean z10, r10 r10Var, org.telegram.ui.ActionBar.h6 h6Var, int i11) {
        super(ek0Var, context, i7, i10, z10, r10Var, h6Var);
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
                if (i7 == org.telegram.ui.ActionBar.m6.f29472i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.m6.w0(i7, this.f34065x);
            default:
                return super.I(i7);
        }
    }
}
