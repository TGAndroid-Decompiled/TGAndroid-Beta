package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dn implements sr {
    public final qp f22037a;
    public final long f22038b;
    public final int f22039c;
    public final boolean d;
    public final TLRPC.InputPeer f22040e;
    public final long f22041f;

    public dn(qp qpVar, long j3, int i7, boolean z9, TLRPC.InputPeer inputPeer, long j10) {
        this.f22037a = qpVar;
        this.f22038b = j3;
        this.f22039c = i7;
        this.d = z9;
        this.f22040e = inputPeer;
        this.f22041f = j10;
    }

    @Override
    public final void a(int i7) {
        qp qpVar = this.f22037a;
        long e10 = qpVar.getUserConfig().e();
        long j3 = this.f22038b;
        if (j3 == e10) {
            qpVar.G1().b();
        }
        qpVar.Y(j3, 2, this.f22039c, Math.max(0, i7), this.d, this.f22040e, this.f22041f);
        qpVar.J(1);
    }
}
