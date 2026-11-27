package defpackage;

import org.telegram.tgnet.TLRPC;
public final class xa7 implements df7 {
    public final uc7 a;
    public final long b;
    public final int c;
    public final boolean d;
    public final TLRPC.InputPeer e;
    public final long f;

    public xa7(uc7 uc7Var, long j, int i, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.a = uc7Var;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = inputPeer;
        this.f = j2;
    }

    @Override
    public final void a(int i) {
        uc7 uc7Var = this.a;
        long e = uc7Var.getUserConfig().e();
        long j = this.b;
        if (j == e) {
            uc7Var.F1().b();
        }
        uc7Var.W(j, 2, this.c, Math.max(0, i), this.d, this.e, this.f);
        uc7Var.H(1);
    }
}
