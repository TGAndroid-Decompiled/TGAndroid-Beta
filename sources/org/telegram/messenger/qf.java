package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qf implements RequestDelegate {
    public final int f17579a;
    public final boolean f17580b;
    public final long f17581c;
    public final f1 d;

    public qf(f1 f1Var, boolean z10, long j10, int i10) {
        this.f17579a = i10;
        this.d = f1Var;
        this.f17580b = z10;
        this.f17581c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17579a) {
            case 0:
                i0.g3(new qg((ui) this.d, tLObject, this.f17580b, this.f17581c, 1));
                return;
            default:
                i0.g3(new qg((vp) this.d, tLObject, this.f17580b, this.f17581c, 2));
                return;
        }
    }
}
