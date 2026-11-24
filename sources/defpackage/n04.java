package defpackage;

import org.telegram.tgnet.TLRPC;
public final class n04 extends yp {
    public final e34 c;

    public n04(e34 e34Var) {
        this.c = e34Var;
    }

    @Override
    public final int i(int i) {
        e34 e34Var = this.c;
        z24 z24Var = e34Var.A0;
        y59 adapter = e34Var.E0.getAdapter();
        w24 w24Var = e34Var.z0;
        if (adapter == w24Var) {
            if (i == 0) {
                return w24Var.d;
            }
            if (i == w24Var.s || (w24Var.h.get(i) != null && !(w24Var.h.get(i) instanceof TLRPC.Document))) {
                return w24Var.d;
            }
            return 1;
        } else if (i != z24Var.y && (z24Var.r.get(i) == null || (z24Var.r.get(i) instanceof TLRPC.Document))) {
            return 1;
        } else {
            return w24Var.d;
        }
    }
}
