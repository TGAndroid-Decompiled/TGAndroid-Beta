package ii;

import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ww;
public final class f0 implements tr, qr {
    public final int f15529a;
    public final long f15530b;
    public final boolean f15531c;
    public final ls d;
    public final Object f15532e;

    public f0(u1 u1Var, f2 f2Var, int i7, long j3, boolean z9) {
        this.d = u1Var;
        this.f15532e = f2Var;
        this.f15529a = i7;
        this.f15530b = j3;
        this.f15531c = z9;
    }

    @Override
    public void k(boolean z9) {
        ww wwVar = (ww) this.d;
        long j3 = this.f15530b;
        boolean z10 = this.f15531c;
        ww.x0(this.f15529a, j3, (TLRPC.Chat) this.f15532e, wwVar, z10, z9);
    }

    @Override
    public void run(long j3) {
        f2 f2Var = (f2) this.f15532e;
        ((u1) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        qp.s1(this.f15529a).Q2(-j3, this.f15530b, false, this.f15531c, new g0(f2Var, j3, 0));
    }

    public f0(ww wwVar, int i7, TLRPC.Chat chat, long j3, boolean z9) {
        this.d = wwVar;
        this.f15529a = i7;
        this.f15532e = chat;
        this.f15530b = j3;
        this.f15531c = z9;
    }
}
