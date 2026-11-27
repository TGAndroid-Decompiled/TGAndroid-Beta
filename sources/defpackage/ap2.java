package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class ap2 implements ff7, cf7 {
    public final int a;
    public final long b;
    public final boolean c;
    public final fn7 d;
    public final Object e;

    public ap2(id idVar, e eVar, int i, long j, boolean z) {
        this.d = idVar;
        this.e = eVar;
        this.a = i;
        this.b = j;
        this.c = z;
    }

    @Override
    public final void A(boolean z) {
        long j = this.b;
        boolean z2 = this.c;
        ((uj3) this.d).Z3(this.a, j, (TLRPC.Chat) this.e, z2, z);
    }

    @Override
    public final void run(long j) {
        e eVar = (e) this.e;
        ((id) this.d).dismiss();
        if (j == 0) {
            return;
        }
        uc7.s1(this.a).Z2(-j, this.b, false, this.c, new ky(eVar, j, (byte) 1));
    }

    public ap2(uj3 uj3Var, int i, TLRPC.Chat chat, long j, boolean z) {
        this.d = uj3Var;
        this.a = i;
        this.e = chat;
        this.b = j;
        this.c = z;
    }
}
