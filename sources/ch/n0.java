package ch;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class n0 extends m0 {
    public final p0 f6339g0;

    public n0(p0 p0Var, m0 m0Var, TLRPC.ReactionCount reactionCount, boolean z9) {
        super(m0Var, p0Var.f6369l, p0Var.f6379w, reactionCount, z9, p0Var.f6381y);
        this.f6339g0 = p0Var;
    }

    @Override
    public final float j() {
        return this.f6339g0.f6360a;
    }

    @Override
    public final ImageReceiver k() {
        return (ImageReceiver) this.f6339g0.E.get(this.f6330r);
    }

    @Override
    public final boolean l() {
        return this.f6339g0.f6380x.Q3();
    }

    @Override
    public final boolean m() {
        p0 p0Var = this.f6339g0;
        int f12 = p0Var.f6380x.f1();
        long d12 = p0Var.f6380x.d1();
        k0 k0Var = k0.B;
        if (k0Var != null) {
            int i7 = k0Var.f6282a;
            if (i7 == 2 || i7 == 0) {
                long j3 = k0Var.f6294o;
                if (((j3 != 0 && d12 == j3) || f12 == k0Var.f6293n) && k0Var.f6295p.equals(this.f6330r)) {
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
        this.f6339g0.E.remove(this.f6330r);
    }
}
