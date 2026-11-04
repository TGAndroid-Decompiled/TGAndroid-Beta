package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kf implements RequestDelegate {
    public final int f23816a;
    public final boolean f23817b;
    public final long f23818c;
    public final c1 d;

    public kf(c1 c1Var, boolean z10, long j10, int i3) {
        this.f23816a = i3;
        this.d = c1Var;
        this.f23817b = z10;
        this.f23818c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23816a) {
            case 0:
                g0.h3(new jg((li) this.d, tLObject, this.f23817b, this.f23818c, 1));
                return;
            default:
                g0.h3(new jg((hp) this.d, tLObject, this.f23817b, this.f23818c, 3));
                return;
        }
    }
}
