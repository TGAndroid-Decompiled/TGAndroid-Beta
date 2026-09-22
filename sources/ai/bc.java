package ai;

import android.content.Context;
public final class bc extends k0 {
    public final jc f601a;

    public bc(jc jcVar, Context context) {
        super(context);
        this.f601a = jcVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        e6 e6Var = this.f601a.G0;
        if (e6Var != null) {
            e6Var.b();
        }
    }
}
