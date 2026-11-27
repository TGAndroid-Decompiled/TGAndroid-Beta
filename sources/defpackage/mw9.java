package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class mw9 extends u49 {
    public final nw9 g0;

    public mw9(nw9 nw9Var, int i, View view, TLRPC.TL_reactionCount tL_reactionCount, vnb vnbVar) {
        super(null, i, view, tL_reactionCount, true, vnbVar);
        this.g0 = nw9Var;
    }

    @Override
    public final boolean e() {
        if (this.v <= 0 && !this.t && this.E.l == 1.0f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean h() {
        return !e();
    }

    @Override
    public final int i() {
        return 18;
    }

    @Override
    public final void r(float f) {
        int i;
        int i2;
        int v0;
        int i3 = this.h;
        nw9 nw9Var = this.g0;
        boolean z = nw9Var.e;
        ow9 ow9Var = nw9Var.s;
        if (z) {
            i = aob.wk;
        } else {
            i = aob.mb;
        }
        this.M = vm2.f(f, i3, aob.v0(i, ow9Var.c));
        int i4 = this.f;
        if (nw9Var.e) {
            i2 = aob.v0(aob.tk, ow9Var.c);
        } else {
            i2 = 0;
        }
        int f2 = vm2.f(f, i4, i2);
        this.N = f2;
        this.M = aob.v(f2, this.M);
        int i5 = this.g;
        if (nw9Var.e) {
            v0 = 1526726655;
        } else {
            v0 = aob.v0(aob.nb, ow9Var.c);
        }
        this.O = vm2.f(f, i5, v0);
    }
}
