package defpackage;

import android.content.Context;
public final class br0 extends fr0 {
    public final gr0 w;

    public br0(gr0 gr0Var, Context context) {
        super(gr0Var, context);
        this.w = gr0Var;
    }

    @Override
    public final void f() {
        boolean z;
        super.f();
        gr0 gr0Var = this.w;
        if (gr0Var.r.getVisibility() == 0) {
            gr0Var.x.f();
        }
        zya zyaVar = gr0Var.E;
        if (zyaVar != null) {
            s1b s1bVar = this.e;
            if (s1bVar != null && s1bVar.C) {
                z = true;
            } else {
                z = false;
            }
            zyaVar.e(z, true);
        }
    }
}
