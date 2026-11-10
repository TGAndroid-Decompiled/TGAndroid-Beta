package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
public final class bh implements RequestDelegate {
    public final int f21667a;
    public final int f21668b;
    public final String f21669c;
    public final String d;
    public final c1 f21670e;

    public bh(c1 c1Var, int i7, String str, String str2, int i10) {
        this.f21667a = i10;
        this.f21670e = c1Var;
        this.f21668b = i7;
        this.f21669c = str;
        this.d = str2;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r17, org.telegram.tgnet.TLRPC.TL_error r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bh.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }
}
