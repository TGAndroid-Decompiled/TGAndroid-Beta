package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class sp2 implements xe7, ue7 {
    public final int a;
    public final long b;
    public final boolean c;
    public final jm7 d;
    public final Object e;

    public sp2(he heVar, d dVar, int i, long j, boolean z) {
        this.d = heVar;
        this.e = dVar;
        this.a = i;
        this.b = j;
        this.c = z;
    }

    @Override
    public final void run(long j) {
        d dVar = (d) this.e;
        ((he) this.d).dismiss();
        if (j == 0) {
            return;
        }
        oc7.r1(this.a).V2(-j, this.b, false, this.c, new jz(dVar, j, (byte) 1));
    }

    @Override
    public final void z(boolean z) {
        long j = this.b;
        boolean z2 = this.c;
        ((nk3) this.d).Z3(this.a, j, (TLRPC.Chat) this.e, z2, z);
    }

    public sp2(nk3 nk3Var, int i, TLRPC.Chat chat, long j, boolean z) {
        this.d = nk3Var;
        this.a = i;
        this.e = chat;
        this.b = j;
        this.c = z;
    }
}
