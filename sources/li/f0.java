package li;

import org.telegram.messenger.fs;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.cx;
public final class f0 implements or, lr {
    public final int f19924a;
    public final long f19925b;
    public final boolean f19926c;
    public final fs d;
    public final Object f19927e;

    public f0(u1 u1Var, h2 h2Var, int i7, long j3, boolean z10) {
        this.d = u1Var;
        this.f19927e = h2Var;
        this.f19924a = i7;
        this.f19925b = j3;
        this.f19926c = z10;
    }

    @Override
    public void d(boolean z10) {
        cx cxVar = (cx) this.d;
        long j3 = this.f19925b;
        boolean z11 = this.f19926c;
        cx.j0(this.f19924a, j3, (TLRPC.Chat) this.f19927e, cxVar, z11, z10);
    }

    @Override
    public void run(long j3) {
        h2 h2Var = (h2) this.f19927e;
        ((u1) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        mp.u1(this.f19924a).W2(-j3, this.f19925b, false, this.f19926c, new bi.n(h2Var, j3, 1));
    }

    public f0(cx cxVar, int i7, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = cxVar;
        this.f19924a = i7;
        this.f19927e = chat;
        this.f19925b = j3;
        this.f19926c = z10;
    }
}
