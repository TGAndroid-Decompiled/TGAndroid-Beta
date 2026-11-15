package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class an implements pr {
    public final np f22539a;
    public final long f22540b;
    public final int f22541c;
    public final boolean d;
    public final TLRPC.InputPeer f22542e;
    public final long f22543f;

    public an(np npVar, long j3, int i7, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f22539a = npVar;
        this.f22540b = j3;
        this.f22541c = i7;
        this.d = z10;
        this.f22542e = inputPeer;
        this.f22543f = j10;
    }

    @Override
    public final void a(int i7) {
        np npVar = this.f22539a;
        long e10 = npVar.getUserConfig().e();
        long j3 = this.f22540b;
        if (j3 == e10) {
            npVar.G1().b();
        }
        npVar.Y(j3, 2, this.f22541c, Math.max(0, i7), this.d, this.f22542e, this.f22543f);
        npVar.J(1);
    }
}
