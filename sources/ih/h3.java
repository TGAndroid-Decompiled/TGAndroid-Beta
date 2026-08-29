package ih;

import android.content.Context;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.u51;
public final class h3 extends u51 {
    public final gr0 f9220b3;

    public h3(Context context, int i10, bg.t1 t1Var, f3 f3Var, f3 f3Var2, org.telegram.ui.ActionBar.c6 c6Var, gr0 gr0Var) {
        super(context, i10, 0, false, t1Var, f3Var, f3Var2, c6Var, 3, 1);
        this.f9220b3 = gr0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f9220b3.o();
    }
}
