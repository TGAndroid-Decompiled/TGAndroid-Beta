package ai;

import android.content.Context;
public final class bc extends k0 {
    public final jc f622a;

    public bc(jc jcVar, Context context) {
        super(context);
        this.f622a = jcVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        d6 d6Var = this.f622a.G0;
        if (d6Var != null) {
            d6Var.b();
        }
    }
}
