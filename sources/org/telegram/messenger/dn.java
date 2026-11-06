package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dn implements sr {
    public final qp f22044a;
    public final long f22045b;
    public final int f22046c;
    public final boolean d;
    public final TLRPC.InputPeer f22047e;
    public final long f22048f;

    public dn(qp qpVar, long j3, int i7, boolean z9, TLRPC.InputPeer inputPeer, long j10) {
        this.f22044a = qpVar;
        this.f22045b = j3;
        this.f22046c = i7;
        this.d = z9;
        this.f22047e = inputPeer;
        this.f22048f = j10;
    }

    @Override
    public final void a(int i7) {
        qp qpVar = this.f22044a;
        long e10 = qpVar.getUserConfig().e();
        long j3 = this.f22045b;
        if (j3 == e10) {
            qpVar.G1().b();
        }
        qpVar.Y(j3, 2, this.f22046c, Math.max(0, i7), this.d, this.f22047e, this.f22048f);
        qpVar.J(1);
    }
}
