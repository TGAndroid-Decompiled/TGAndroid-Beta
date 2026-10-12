package ai;

import android.content.Context;
public final class cc extends k0 {
    public final kc f792a;

    public cc(kc kcVar, Context context) {
        super(context);
        this.f792a = kcVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        e6 e6Var = this.f792a.G0;
        if (e6Var != null) {
            e6Var.b();
        }
    }
}
