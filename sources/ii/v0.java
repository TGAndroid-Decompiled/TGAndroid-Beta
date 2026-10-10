package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class v0 extends p61 {
    public static final int f12742a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        ((w0) view).f12758c = (a) q61Var.G;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new w0(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
