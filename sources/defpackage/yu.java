package defpackage;

import org.telegram.ui.o;
public final class yu extends kxe {
    public final byte a;
    public final o b;

    public yu(o oVar, byte b) {
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
                my0 my0Var = oVar.J;
                if (my0Var != null) {
                    my0Var.E0 = z;
                    return;
                }
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.a) {
            case 0:
                if (gm.C3()) {
                    new c41(this.b.h0, null).i(jb6.M0(2131743879, null)).j();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
