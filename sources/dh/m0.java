package dh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class m0 extends l0 {
    public final o0 f9091g0;

    public m0(o0 o0Var, l0 l0Var, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(l0Var, o0Var.f9121l, o0Var.f9131w, reactionCount, z10, o0Var.f9133y);
        this.f9091g0 = o0Var;
    }

    @Override
    public final float j() {
        return this.f9091g0.f9112a;
    }

    @Override
    public final ImageReceiver k() {
        return (ImageReceiver) this.f9091g0.E.get(this.f9081r);
    }

    @Override
    public final boolean l() {
        return this.f9091g0.f9132x.Q3();
    }

    @Override
    public final boolean m() {
        o0 o0Var = this.f9091g0;
        int f12 = o0Var.f9132x.f1();
        long d12 = o0Var.f9132x.d1();
        j0 j0Var = j0.B;
        if (j0Var != null) {
            int i3 = j0Var.f9034a;
            if (i3 == 2 || i3 == 0) {
                long j10 = j0Var.f9046o;
                if (((j10 != 0 && d12 == j10) || f12 == j0Var.f9045n) && j0Var.f9047p.equals(this.f9081r)) {
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
        this.f9091g0.E.remove(this.f9081r);
    }
}
