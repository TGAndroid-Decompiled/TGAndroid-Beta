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
        z2b z2bVar = gr0Var.E;
        if (z2bVar != null) {
            p5b p5bVar = this.e;
            if (p5bVar != null && p5bVar.C) {
                z = true;
            } else {
                z = false;
            }
            z2bVar.e(z, true);
        }
    }
}
