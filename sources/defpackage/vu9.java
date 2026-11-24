package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vu9 extends i39 {
    public final wu9 g0;

    public vu9(wu9 wu9Var, int i, View view, TLRPC.TL_reactionCount tL_reactionCount, ylb ylbVar) {
        super(null, i, view, tL_reactionCount, true, ylbVar);
        this.g0 = wu9Var;
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
        wu9 wu9Var = this.g0;
        boolean z = wu9Var.e;
        xu9 xu9Var = wu9Var.s;
        if (z) {
            i = cmb.vk;
        } else {
            i = cmb.lb;
        }
        this.M = on2.f(f, i3, cmb.v0(i, xu9Var.c));
        int i4 = this.f;
        if (wu9Var.e) {
            i2 = cmb.v0(cmb.sk, xu9Var.c);
        } else {
            i2 = 0;
        }
        int f2 = on2.f(f, i4, i2);
        this.N = f2;
        this.M = cmb.v(f2, this.M);
        int i5 = this.g;
        if (wu9Var.e) {
            v0 = 1526726655;
        } else {
            v0 = cmb.v0(cmb.mb, xu9Var.c);
        }
        this.O = on2.f(f, i5, v0);
    }
}
