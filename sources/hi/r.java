package hi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class r extends s61 {
    public static final int f13239a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        s sVar = (s) view;
        TL_agent.agentProvider agentprovider = (TL_agent.agentProvider) t61Var.G;
        boolean z11 = t61Var.e;
        int i10 = t61Var.f32888z;
        boolean z12 = true;
        if (i10 != 1) {
            z12 = false;
        }
        sVar.a(agentprovider, null, false, z11, z12, z10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new s(context, i10, u6Var);
    }
}
