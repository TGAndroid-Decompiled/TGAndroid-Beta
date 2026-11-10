package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dn implements sr {
    public final qp f22066a;
    public final long f22067b;
    public final int f22068c;
    public final boolean d;
    public final TLRPC.InputPeer f22069e;
    public final long f22070f;

    public dn(qp qpVar, long j3, int i7, boolean z9, TLRPC.InputPeer inputPeer, long j10) {
        this.f22066a = qpVar;
        this.f22067b = j3;
        this.f22068c = i7;
        this.d = z9;
        this.f22069e = inputPeer;
        this.f22070f = j10;
    }

    @Override
    public final void a(int i7) {
        qp qpVar = this.f22066a;
        long e10 = qpVar.getUserConfig().e();
        long j3 = this.f22067b;
        if (j3 == e10) {
            qpVar.G1().b();
        }
        qpVar.Y(j3, 2, this.f22068c, Math.max(0, i7), this.d, this.f22069e, this.f22070f);
        qpVar.J(1);
    }
}
