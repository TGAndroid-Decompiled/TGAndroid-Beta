package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dn implements sr {
    public final qp f22062a;
    public final long f22063b;
    public final int f22064c;
    public final boolean d;
    public final TLRPC.InputPeer f22065e;
    public final long f22066f;

    public dn(qp qpVar, long j3, int i7, boolean z9, TLRPC.InputPeer inputPeer, long j10) {
        this.f22062a = qpVar;
        this.f22063b = j3;
        this.f22064c = i7;
        this.d = z9;
        this.f22065e = inputPeer;
        this.f22066f = j10;
    }

    @Override
    public final void a(int i7) {
        qp qpVar = this.f22062a;
        long e10 = qpVar.getUserConfig().e();
        long j3 = this.f22063b;
        if (j3 == e10) {
            qpVar.G1().b();
        }
        qpVar.Y(j3, 2, this.f22064c, Math.max(0, i7), this.d, this.f22065e, this.f22066f);
        qpVar.J(1);
    }
}
