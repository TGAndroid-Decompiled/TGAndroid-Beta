package defpackage;

import org.telegram.tgnet.TLRPC;
public final class o87 implements uc7 {
    public final na7 a;
    public final long b;
    public final int c;
    public final boolean d;
    public final TLRPC.InputPeer e;
    public final long f;

    public o87(na7 na7Var, long j, int i, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.a = na7Var;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = inputPeer;
        this.f = j2;
    }

    @Override
    public final void a(int i) {
        na7 na7Var = this.a;
        long e = na7Var.getUserConfig().e();
        long j = this.b;
        if (j == e) {
            na7Var.D1().b();
        }
        na7Var.U(j, 2, this.c, Math.max(0, i), this.d, this.e, this.f);
        na7Var.F(1);
    }
}
