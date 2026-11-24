package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class j39 extends i39 {
    public final l39 g0;

    public j39(l39 l39Var, i39 i39Var, TLRPC.ReactionCount reactionCount, boolean z) {
        super(i39Var, l39Var.l, l39Var.w, reactionCount, z, l39Var.y);
        this.g0 = l39Var;
    }

    @Override
    public final float j() {
        return this.g0.a;
    }

    @Override
    public final ImageReceiver k() {
        return (ImageReceiver) this.g0.E.get(this.r);
    }

    @Override
    public final boolean l() {
        return this.g0.x.O3();
    }

    @Override
    public final boolean m() {
        l39 l39Var = this.g0;
        int e1 = l39Var.x.e1();
        long c1 = l39Var.x.c1();
        g39 g39Var = g39.B;
        if (g39Var != null) {
            int i = g39Var.a;
            if (i == 2 || i == 0) {
                long j = g39Var.o;
                if (((j != 0 && c1 == j) || e1 == g39Var.n) && g39Var.p.equals(this.r)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n() {
        this.g0.E.remove(this.r);
    }
}
