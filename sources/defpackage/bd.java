package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_agent;
public final class bd extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        cd cdVar = (cd) view;
        TL_agent.agentProvider agentprovider = (TL_agent.agentProvider) c6cVar.H;
        boolean z2 = c6cVar.e;
        boolean z3 = true;
        if (c6cVar.A != 1) {
            z3 = false;
        }
        cdVar.a(agentprovider, null, false, z2, z3, z);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new cd(i, ylbVar, context);
    }
}
