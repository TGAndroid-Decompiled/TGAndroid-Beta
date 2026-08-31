package lh;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.pr0;
public final class h3 extends i61 {
    public final pr0 c3;

    public h3(Context context, int i10, eg.p1 p1Var, f3 f3Var, f3 f3Var2, g6 g6Var, pr0 pr0Var) {
        super(context, i10, 0, false, p1Var, f3Var, f3Var2, g6Var, 3, 1);
        this.c3 = pr0Var;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.c3.o();
    }
}
