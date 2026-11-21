package li;

import org.telegram.messenger.fs;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.cx;
public final class f0 implements or, lr {
    public final int f19952a;
    public final long f19953b;
    public final boolean f19954c;
    public final fs d;
    public final Object f19955e;

    public f0(t1 t1Var, g2 g2Var, int i7, long j3, boolean z10) {
        this.d = t1Var;
        this.f19955e = g2Var;
        this.f19952a = i7;
        this.f19953b = j3;
        this.f19954c = z10;
    }

    @Override
    public void d(boolean z10) {
        cx cxVar = (cx) this.d;
        long j3 = this.f19953b;
        boolean z11 = this.f19954c;
        cx.j0(this.f19952a, j3, (TLRPC.Chat) this.f19955e, cxVar, z11, z10);
    }

    @Override
    public void run(long j3) {
        g2 g2Var = (g2) this.f19955e;
        ((t1) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        mp.u1(this.f19952a).W2(-j3, this.f19953b, false, this.f19954c, new bi.n(g2Var, j3, 1));
    }

    public f0(cx cxVar, int i7, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = cxVar;
        this.f19952a = i7;
        this.f19955e = chat;
        this.f19953b = j3;
        this.f19954c = z10;
    }
}
