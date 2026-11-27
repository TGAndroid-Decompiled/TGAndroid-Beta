package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class v49 extends u49 {
    public final x49 g0;

    public v49(x49 x49Var, u49 u49Var, TLRPC.ReactionCount reactionCount, boolean z) {
        super(u49Var, x49Var.l, x49Var.w, reactionCount, z, x49Var.y);
        this.g0 = x49Var;
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
        x49 x49Var = this.g0;
        int e1 = x49Var.x.e1();
        long c1 = x49Var.x.c1();
        s49 s49Var = s49.B;
        if (s49Var != null) {
            int i = s49Var.a;
            if (i == 2 || i == 0) {
                long j = s49Var.o;
                if (((j != 0 && c1 == j) || e1 == s49Var.n) && s49Var.p.equals(this.r)) {
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
