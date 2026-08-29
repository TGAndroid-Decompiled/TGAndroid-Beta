package ig;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class m extends v41 {
    public static final int f9006a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        n nVar = (n) view;
        nVar.setUser((TLRPC.User) w41Var.G);
        nVar.c(w41Var.f34294e, false);
        nVar.setDivider(z10);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new n(context, true, false, c6Var, false);
    }
}
