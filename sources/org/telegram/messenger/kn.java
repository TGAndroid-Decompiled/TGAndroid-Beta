package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kn implements bs {
    public final vp f16611a;
    public final long f16612b;
    public final int f16613c;
    public final boolean d;
    public final TLRPC.InputPeer e;
    public final long f16614f;

    public kn(vp vpVar, long j10, int i10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.f16611a = vpVar;
        this.f16612b = j10;
        this.f16613c = i10;
        this.d = z10;
        this.e = inputPeer;
        this.f16614f = j11;
    }

    @Override
    public final void a(int i10) {
        vp vpVar = this.f16611a;
        long e = vpVar.getUserConfig().e();
        long j10 = this.f16612b;
        if (j10 == e) {
            vpVar.F1().b();
        }
        vpVar.Y(j10, 2, this.f16613c, Math.max(0, i10), this.d, this.e, this.f16614f);
        vpVar.J(1);
    }
}
