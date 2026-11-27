package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class t16 implements Runnable {
    public final byte a;
    public final u16 b;
    public final k5 c;
    public final long d;
    public final e e;

    public t16(u16 u16Var, k5 k5Var, long j, e eVar, byte b) {
        this.a = b;
        this.b = u16Var;
        this.c = k5Var;
        this.d = j;
        this.e = eVar;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                hl.c3(new t16(this.b, this.c, this.d, this.e, (byte) 1));
                return;
            default:
                k5 k5Var = this.c;
                int i = k5Var.a;
                uc7 s1 = uc7.s1(i);
                long j = this.d;
                long j2 = -j;
                boolean z = false;
                vc2 g1 = s1.g1(j2, false, null);
                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(j2));
                uc7.s1(i).j1(j);
                xkc.l(M0, null, false, Boolean.valueOf((g1 == null || !g1.b.rtmp_stream) ? true : true), this.b.h, this.e, k5Var);
                return;
        }
    }
}
