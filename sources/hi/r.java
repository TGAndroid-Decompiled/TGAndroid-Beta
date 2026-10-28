package hi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class r extends t61 {
    public static final int f13238a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        s sVar = (s) view;
        TL_agent.agentProvider agentprovider = (TL_agent.agentProvider) u61Var.G;
        boolean z11 = u61Var.e;
        int i10 = u61Var.f33262z;
        boolean z12 = true;
        if (i10 != 1) {
            z12 = false;
        }
        sVar.a(agentprovider, null, false, z11, z12, z10);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new s(context, i10, u6Var);
    }
}
