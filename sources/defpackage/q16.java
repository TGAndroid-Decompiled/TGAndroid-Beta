package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class q16 implements Runnable {
    public final byte a;
    public final r16 b;
    public final j5 c;
    public final long d;
    public final d e;

    public q16(r16 r16Var, j5 j5Var, long j, d dVar, byte b) {
        this.a = b;
        this.b = r16Var;
        this.c = j5Var;
        this.d = j;
        this.e = dVar;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                gm.c3(new q16(this.b, this.c, this.d, this.e, (byte) 1));
                return;
            default:
                j5 j5Var = this.c;
                int i = j5Var.a;
                oc7 r1 = oc7.r1(i);
                long j = this.d;
                long j2 = -j;
                boolean z = false;
                qd2 f1 = r1.f1(j2, false, null);
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(j2));
                oc7.r1(i).i1(j);
                sic.l(L0, null, false, Boolean.valueOf((f1 == null || !f1.b.rtmp_stream) ? true : true), this.b.h, this.e, j5Var);
                return;
        }
    }
}
