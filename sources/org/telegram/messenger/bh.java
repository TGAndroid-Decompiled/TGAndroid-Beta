package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
public final class bh implements RequestDelegate {
    public final int f21629a;
    public final int f21630b;
    public final String f21631c;
    public final String d;
    public final c1 f21632e;

    public bh(c1 c1Var, int i7, String str, String str2, int i10) {
        this.f21629a = i10;
        this.f21632e = c1Var;
        this.f21630b = i7;
        this.f21631c = str;
        this.d = str2;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r17, org.telegram.tgnet.TLRPC.TL_error r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bh.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }
}
