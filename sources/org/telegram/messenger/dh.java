package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
public final class dh implements RequestDelegate {
    public final int f23547a;
    public final int f23548b;
    public final String f23549c;
    public final String d;
    public final c1 f23550e;

    public dh(c1 c1Var, int i7, String str, String str2, int i10) {
        this.f23547a = i10;
        this.f23550e = c1Var;
        this.f23548b = i7;
        this.f23549c = str;
        this.d = str2;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r17, org.telegram.tgnet.TLRPC.TL_error r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dh.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }
}
