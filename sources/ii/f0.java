package ii;

import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.yw;
public final class f0 implements tr, qr {
    public final int f15532a;
    public final long f15533b;
    public final boolean f15534c;
    public final ls d;
    public final Object f15535e;

    public f0(u1 u1Var, f2 f2Var, int i7, long j3, boolean z9) {
        this.d = u1Var;
        this.f15535e = f2Var;
        this.f15532a = i7;
        this.f15533b = j3;
        this.f15534c = z9;
    }

    @Override
    public void k(boolean z9) {
        yw ywVar = (yw) this.d;
        long j3 = this.f15533b;
        boolean z10 = this.f15534c;
        yw.x0(this.f15532a, j3, (TLRPC.Chat) this.f15535e, ywVar, z10, z9);
    }

    @Override
    public void run(long j3) {
        f2 f2Var = (f2) this.f15535e;
        ((u1) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        qp.s1(this.f15532a).Q2(-j3, this.f15533b, false, this.f15534c, new g0(f2Var, j3, 0));
    }

    public f0(yw ywVar, int i7, TLRPC.Chat chat, long j3, boolean z9) {
        this.d = ywVar;
        this.f15532a = i7;
        this.f15535e = chat;
        this.f15533b = j3;
        this.f15534c = z9;
    }
}
