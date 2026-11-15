package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
public final class bo implements RequestDelegate {
    public final int f22740a;
    public final c1 f22741b;
    public final int f22742c;

    public bo(c1 c1Var, int i7, int i10) {
        this.f22740a = i10;
        this.f22741b = c1Var;
        this.f22742c = i7;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r20, org.telegram.tgnet.TLRPC.TL_error r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bo.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }
}
