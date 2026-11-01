package mg;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;
public final class t1 extends qg.h {
    public final v1 K;

    public t1(v1 v1Var, Context context, p6 p6Var) {
        super(context, p6Var);
        this.K = v1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int L = org.telegram.messenger.i0.L(78.0f) + getMeasuredHeight();
        v1 v1Var = this.K;
        v1Var.f13256h2 = L;
        v1Var.f13255g2.G();
    }
}
