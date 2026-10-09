package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class d6 extends o61 {
    public static final int f12349a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        ((f6) view).g((a) p61Var.G, (c6) p61Var.H, p61Var.f29740r);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        f6 f6Var = new f6(context, e6Var);
        f6Var.setBackground(new b2(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var)));
        return f6Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
