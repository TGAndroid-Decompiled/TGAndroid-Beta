package kg;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class m extends h51 {
    public static final int f10557a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        n nVar = (n) view;
        nVar.setUser((TLRPC.User) i51Var.G);
        nVar.c(i51Var.e, false);
        nVar.setDivider(z4);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new n(context, true, false, f6Var, false);
    }
}
