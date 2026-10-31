package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
public final class ah implements RequestDelegate {
    public final int f14610a;
    public final int f14611b;
    public final String f14612c;
    public final String d;
    public final f1 e;

    public ah(f1 f1Var, int i10, String str, String str2, int i11) {
        this.f14610a = i11;
        this.e = f1Var;
        this.f14611b = i10;
        this.f14612c = str;
        this.d = str2;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r17, org.telegram.tgnet.TLRPC.TL_error r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ah.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }
}
