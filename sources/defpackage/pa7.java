package defpackage;

import org.telegram.tgnet.TLRPC;
public final class pa7 implements we7 {
    public final oc7 a;
    public final long b;
    public final int c;
    public final boolean d;
    public final TLRPC.InputPeer e;
    public final long f;

    public pa7(oc7 oc7Var, long j, int i, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.a = oc7Var;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = inputPeer;
        this.f = j2;
    }

    @Override
    public final void a(int i) {
        oc7 oc7Var = this.a;
        long e = oc7Var.getUserConfig().e();
        long j = this.b;
        if (j == e) {
            oc7Var.E1().b();
        }
        oc7Var.U(j, 2, this.c, Math.max(0, i), this.d, this.e, this.f);
        oc7Var.F(1);
    }
}
