package hg;

import android.content.Context;
import android.view.View;
import ci.u6;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class l1 extends f61 {
    public static final int f11965a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        ((m1) view).a((u6) g61Var.G);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new m1(context, d6Var);
    }
}
