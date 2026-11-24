package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class g19 extends f19 {
    public final i19 g0;

    public g19(i19 i19Var, f19 f19Var, TLRPC.ReactionCount reactionCount, boolean z) {
        super(f19Var, i19Var.l, i19Var.w, reactionCount, z, i19Var.y);
        this.g0 = i19Var;
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
        i19 i19Var = this.g0;
        int e1 = i19Var.x.e1();
        long c1 = i19Var.x.c1();
        d19 d19Var = d19.B;
        if (d19Var != null) {
            int i = d19Var.a;
            if (i == 2 || i == 0) {
                long j = d19Var.o;
                if (((j != 0 && c1 == j) || e1 == d19Var.n) && d19Var.p.equals(this.r)) {
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
