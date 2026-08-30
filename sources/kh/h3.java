package kh;

import android.content.Context;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.or0;
public final class h3 extends g61 {
    public final or0 c3;

    public h3(Context context, int i10, dg.r1 r1Var, f3 f3Var, f3 f3Var2, org.telegram.ui.ActionBar.f6 f6Var, or0 or0Var) {
        super(context, i10, 0, false, r1Var, f3Var, f3Var2, f6Var, 3, 1);
        this.c3 = or0Var;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.c3.o();
    }
}
