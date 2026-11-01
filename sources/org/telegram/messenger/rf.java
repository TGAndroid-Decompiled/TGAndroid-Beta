package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf implements RequestDelegate {
    public final int f17925a;
    public final boolean f17926b;
    public final long f17927c;
    public final f1 d;

    public rf(f1 f1Var, boolean z10, long j10, int i10) {
        this.f17925a = i10;
        this.d = f1Var;
        this.f17926b = z10;
        this.f17927c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17925a) {
            case 0:
                i0.g3(new rg((vi) this.d, tLObject, this.f17926b, this.f17927c, 1));
                return;
            default:
                i0.g3(new rg((wp) this.d, tLObject, this.f17926b, this.f17927c, 2));
                return;
        }
    }
}
