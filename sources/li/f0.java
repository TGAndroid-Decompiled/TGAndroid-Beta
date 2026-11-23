package li;

import org.telegram.messenger.gs;
import org.telegram.messenger.mr;
import org.telegram.messenger.np;
import org.telegram.messenger.pr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.cx;
public final class f0 implements pr, mr {
    public final int f19955a;
    public final long f19956b;
    public final boolean f19957c;
    public final gs d;
    public final Object f19958e;

    public f0(t1 t1Var, g2 g2Var, int i7, long j3, boolean z10) {
        this.d = t1Var;
        this.f19958e = g2Var;
        this.f19955a = i7;
        this.f19956b = j3;
        this.f19957c = z10;
    }

    @Override
    public void d(boolean z10) {
        cx cxVar = (cx) this.d;
        long j3 = this.f19956b;
        boolean z11 = this.f19957c;
        cx.j0(this.f19955a, j3, (TLRPC.Chat) this.f19958e, cxVar, z11, z10);
    }

    @Override
    public void run(long j3) {
        g2 g2Var = (g2) this.f19958e;
        ((t1) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        np.u1(this.f19955a).W2(-j3, this.f19956b, false, this.f19957c, new bi.n(g2Var, j3, 1));
    }

    public f0(cx cxVar, int i7, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = cxVar;
        this.f19955a = i7;
        this.f19958e = chat;
        this.f19956b = j3;
        this.f19957c = z10;
    }
}
