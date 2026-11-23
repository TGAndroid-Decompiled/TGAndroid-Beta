package li;

import org.telegram.messenger.fs;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.bx;
public final class e0 implements or, lr {
    public final int f20018a;
    public final long f20019b;
    public final boolean f20020c;
    public final fs d;
    public final Object f20021e;

    public e0(t1 t1Var, g2 g2Var, int i7, long j3, boolean z10) {
        this.d = t1Var;
        this.f20021e = g2Var;
        this.f20018a = i7;
        this.f20019b = j3;
        this.f20020c = z10;
    }

    @Override
    public void q(boolean z10) {
        bx bxVar = (bx) this.d;
        long j3 = this.f20019b;
        boolean z11 = this.f20020c;
        bx.j0(this.f20018a, j3, (TLRPC.Chat) this.f20021e, bxVar, z11, z10);
    }

    @Override
    public void run(long j3) {
        g2 g2Var = (g2) this.f20021e;
        ((t1) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        mp.u1(this.f20018a).W2(-j3, this.f20019b, false, this.f20020c, new bi.n(g2Var, j3, 1));
    }

    public e0(bx bxVar, int i7, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = bxVar;
        this.f20018a = i7;
        this.f20021e = chat;
        this.f20019b = j3;
        this.f20020c = z10;
    }
}
