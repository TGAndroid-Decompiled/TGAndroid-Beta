package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tm implements kr {
    public final hp f25564a;
    public final long f25565b;
    public final int f25566c;
    public final boolean d;
    public final TLRPC.InputPeer f25567e;
    public final long f25568f;

    public tm(hp hpVar, long j10, int i3, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.f25564a = hpVar;
        this.f25565b = j10;
        this.f25566c = i3;
        this.d = z10;
        this.f25567e = inputPeer;
        this.f25568f = j11;
    }

    @Override
    public final void a(int i3) {
        hp hpVar = this.f25564a;
        long e10 = hpVar.getUserConfig().e();
        long j10 = this.f25565b;
        if (j10 == e10) {
            hpVar.G1().b();
        }
        hpVar.Y(j10, 2, this.f25566c, Math.max(0, i3), this.d, this.f25567e, this.f25568f);
        hpVar.J(1);
    }
}
