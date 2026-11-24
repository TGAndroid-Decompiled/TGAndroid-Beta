package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ts9 extends f19 {
    public final us9 g0;

    public ts9(us9 us9Var, int i, View view, TLRPC.TL_reactionCount tL_reactionCount, wjb wjbVar) {
        super(null, i, view, tL_reactionCount, true, wjbVar);
        this.g0 = us9Var;
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
        us9 us9Var = this.g0;
        boolean z = us9Var.e;
        vs9 vs9Var = us9Var.s;
        if (z) {
            i = bkb.vk;
        } else {
            i = bkb.lb;
        }
        this.M = bm2.f(f, i3, bkb.v0(i, vs9Var.c));
        int i4 = this.f;
        if (us9Var.e) {
            i2 = bkb.v0(bkb.sk, vs9Var.c);
        } else {
            i2 = 0;
        }
        int f2 = bm2.f(f, i4, i2);
        this.N = f2;
        this.M = bkb.v(f2, this.M);
        int i5 = this.g;
        if (us9Var.e) {
            v0 = 1526726655;
        } else {
            v0 = bkb.v0(bkb.mb, vs9Var.c);
        }
        this.O = bm2.f(f, i5, v0);
    }
}
