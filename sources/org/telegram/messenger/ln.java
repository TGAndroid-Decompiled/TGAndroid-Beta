package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ln implements cs {
    public final wp f16976a;
    public final long f16977b;
    public final int f16978c;
    public final boolean d;
    public final TLRPC.InputPeer e;
    public final long f16979f;

    public ln(wp wpVar, long j10, int i10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.f16976a = wpVar;
        this.f16977b = j10;
        this.f16978c = i10;
        this.d = z10;
        this.e = inputPeer;
        this.f16979f = j11;
    }

    @Override
    public final void a(int i10) {
        wp wpVar = this.f16976a;
        long e = wpVar.getUserConfig().e();
        long j10 = this.f16977b;
        if (j10 == e) {
            wpVar.F1().b();
        }
        wpVar.Y(j10, 2, this.f16978c, Math.max(0, i10), this.d, this.e, this.f16979f);
        wpVar.J(1);
    }
}
