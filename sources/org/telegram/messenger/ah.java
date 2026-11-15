package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
public final class ah implements RequestDelegate {
    public final int f22508a;
    public final int f22509b;
    public final String f22510c;
    public final String d;
    public final c1 f22511e;

    public ah(c1 c1Var, int i7, String str, String str2, int i10) {
        this.f22508a = i10;
        this.f22511e = c1Var;
        this.f22509b = i7;
        this.f22510c = str;
        this.d = str2;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r17, org.telegram.tgnet.TLRPC.TL_error r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ah.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }
}
