package ji;

import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.ir;
import org.telegram.messenger.lr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.uw;
public final class d0 implements lr, ir {
    public final int f16289a;
    public final long f16290b;
    public final boolean f16291c;
    public final cs d;
    public final Object f16292e;

    public d0(s1 s1Var, d2 d2Var, int i3, long j10, boolean z10) {
        this.d = s1Var;
        this.f16292e = d2Var;
        this.f16289a = i3;
        this.f16290b = j10;
        this.f16291c = z10;
    }

    @Override
    public void o(boolean z10) {
        uw uwVar = (uw) this.d;
        long j10 = this.f16290b;
        boolean z11 = this.f16291c;
        uw.x0(this.f16289a, j10, (TLRPC.Chat) this.f16292e, uwVar, z11, z10);
    }

    @Override
    public void run(long j10) {
        d2 d2Var = (d2) this.f16292e;
        ((s1) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        hp.s1(this.f16289a).Q2(-j10, this.f16290b, false, this.f16291c, new ai.r(d2Var, j10, 1));
    }

    public d0(uw uwVar, int i3, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = uwVar;
        this.f16289a = i3;
        this.f16292e = chat;
        this.f16290b = j10;
        this.f16291c = z10;
    }
}
