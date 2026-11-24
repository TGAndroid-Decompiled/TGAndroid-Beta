package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ho2 implements vc7, sc7 {
    public final int a;
    public final long b;
    public final boolean c;
    public final gk7 d;
    public final Object e;

    public ho2(hd hdVar, d dVar, int i, long j, boolean z) {
        this.d = hdVar;
        this.e = dVar;
        this.a = i;
        this.b = j;
        this.c = z;
    }

    @Override
    public final void k(boolean z) {
        long j = this.b;
        boolean z2 = this.c;
        ((cj3) this.d).W3(this.a, j, (TLRPC.Chat) this.e, z2, z);
    }

    @Override
    public final void run(long j) {
        d dVar = (d) this.e;
        ((hd) this.d).dismiss();
        if (j == 0) {
            return;
        }
        na7.q1(this.a).T2(-j, this.b, false, this.c, new jy(dVar, j, (byte) 1));
    }

    public ho2(cj3 cj3Var, int i, TLRPC.Chat chat, long j, boolean z) {
        this.d = cj3Var;
        this.a = i;
        this.e = chat;
        this.b = j;
        this.c = z;
    }
}
