package defpackage;

import android.content.Context;
public final class bs0 extends fs0 {
    public final gs0 w;

    public bs0(gs0 gs0Var, Context context) {
        super(gs0Var, context);
        this.w = gs0Var;
    }

    @Override
    public final void f() {
        boolean z;
        super.f();
        gs0 gs0Var = this.w;
        if (gs0Var.r.getVisibility() == 0) {
            gs0Var.x.f();
        }
        a1b a1bVar = gs0Var.E;
        if (a1bVar != null) {
            t3b t3bVar = this.e;
            if (t3bVar != null && t3bVar.C) {
                z = true;
            } else {
                z = false;
            }
            a1bVar.e(z, true);
        }
    }
}
