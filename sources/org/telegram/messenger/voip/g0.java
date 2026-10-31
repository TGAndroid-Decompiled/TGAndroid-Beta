package org.telegram.messenger.voip;

import bi.i6;
import org.telegram.tgnet.RequestDelegate;
public final class g0 implements RequestDelegate {
    public final int f18648a;
    public final int f18649b;
    public final Object f18650c;

    public g0(int i10, i6 i6Var) {
        this.f18648a = 7;
        this.f18649b = i10;
        this.f18650c = i6Var;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r12, org.telegram.tgnet.TLRPC.TL_error r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.g0.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public g0(Object obj, int i10, int i11) {
        this.f18648a = i11;
        this.f18650c = obj;
        this.f18649b = i10;
    }
}
