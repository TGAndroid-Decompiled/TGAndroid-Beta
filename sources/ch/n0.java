package ch;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class n0 extends m0 {
    public final p0 f6337g0;

    public n0(p0 p0Var, m0 m0Var, TLRPC.ReactionCount reactionCount, boolean z9) {
        super(m0Var, p0Var.f6367l, p0Var.f6377w, reactionCount, z9, p0Var.f6379y);
        this.f6337g0 = p0Var;
    }

    @Override
    public final float j() {
        return this.f6337g0.f6358a;
    }

    @Override
    public final ImageReceiver k() {
        return (ImageReceiver) this.f6337g0.E.get(this.f6328r);
    }

    @Override
    public final boolean l() {
        return this.f6337g0.f6378x.P3();
    }

    @Override
    public final boolean m() {
        p0 p0Var = this.f6337g0;
        int e12 = p0Var.f6378x.e1();
        long c12 = p0Var.f6378x.c1();
        k0 k0Var = k0.B;
        if (k0Var != null) {
            int i7 = k0Var.f6280a;
            if (i7 == 2 || i7 == 0) {
                long j3 = k0Var.f6292o;
                if (((j3 != 0 && c12 == j3) || e12 == k0Var.f6291n) && k0Var.f6293p.equals(this.f6328r)) {
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
        this.f6337g0.E.remove(this.f6328r);
    }
}
