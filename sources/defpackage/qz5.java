package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class qz5 implements Runnable {
    public final byte a;
    public final rz5 b;
    public final j5 c;
    public final long d;
    public final d e;

    public qz5(rz5 rz5Var, j5 j5Var, long j, d dVar, byte b) {
        this.a = b;
        this.b = rz5Var;
        this.c = j5Var;
        this.d = j;
        this.e = dVar;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                gl.d3(new qz5(this.b, this.c, this.d, this.e, (byte) 1));
                return;
            default:
                j5 j5Var = this.c;
                int i = j5Var.a;
                na7 q1 = na7.q1(i);
                long j = this.d;
                long j2 = -j;
                boolean z = false;
                fc2 e1 = q1.e1(j2, false, null);
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(j2));
                na7.q1(i).h1(j);
                rgc.l(K0, null, false, Boolean.valueOf((e1 == null || !e1.b.rtmp_stream) ? true : true), this.b.h, this.e, j5Var);
                return;
        }
    }
}
