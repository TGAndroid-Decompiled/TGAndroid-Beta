package ig;

import android.content.Context;
import android.view.View;
import di.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class l1 extends s61 {
    public static final int f14159a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ((m1) view).a((t6) t61Var.G);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new m1(context, u6Var);
    }
}
