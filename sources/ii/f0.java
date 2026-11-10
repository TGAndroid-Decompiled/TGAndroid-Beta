package ii;

import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.zw;
public final class f0 implements tr, qr {
    public final int f15531a;
    public final long f15532b;
    public final boolean f15533c;
    public final ls d;
    public final Object f15534e;

    public f0(u1 u1Var, f2 f2Var, int i7, long j3, boolean z9) {
        this.d = u1Var;
        this.f15534e = f2Var;
        this.f15531a = i7;
        this.f15532b = j3;
        this.f15533c = z9;
    }

    @Override
    public void k(boolean z9) {
        zw zwVar = (zw) this.d;
        long j3 = this.f15532b;
        boolean z10 = this.f15533c;
        zw.x0(this.f15531a, j3, (TLRPC.Chat) this.f15534e, zwVar, z10, z9);
    }

    @Override
    public void run(long j3) {
        f2 f2Var = (f2) this.f15534e;
        ((u1) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        qp.s1(this.f15531a).Q2(-j3, this.f15532b, false, this.f15533c, new g0(f2Var, j3, 0));
    }

    public f0(zw zwVar, int i7, TLRPC.Chat chat, long j3, boolean z9) {
        this.d = zwVar;
        this.f15531a = i7;
        this.f15534e = chat;
        this.f15532b = j3;
        this.f15533c = z9;
    }
}
