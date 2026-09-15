package ai;

import android.content.Context;
public final class bc extends k0 {
    public final jc f599a;

    public bc(jc jcVar, Context context) {
        super(context);
        this.f599a = jcVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        e6 e6Var = this.f599a.G0;
        if (e6Var != null) {
            e6Var.b();
        }
    }
}
