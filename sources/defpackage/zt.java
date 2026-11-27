package defpackage;

import org.telegram.ui.o;
public final class zt extends b0f {
    public final byte a;
    public final o b;

    public zt(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override
    public final void a(boolean z) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                if (z) {
                    oVar.i0.h(false);
                    return;
                }
                return;
            default:
                nx0 nx0Var = oVar.J;
                if (nx0Var != null) {
                    nx0Var.E0 = z;
                    return;
                }
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.a) {
            case 0:
                if (hl.C3()) {
                    new d31(this.b.h0, null).i(ob6.M0(2131743847, null)).j();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
