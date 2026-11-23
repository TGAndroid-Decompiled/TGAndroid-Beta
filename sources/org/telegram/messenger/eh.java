package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
public final class eh implements RequestDelegate {
    public final int f23707a;
    public final int f23708b;
    public final String f23709c;
    public final String d;
    public final c1 f23710e;

    public eh(c1 c1Var, int i7, String str, String str2, int i10) {
        this.f23707a = i10;
        this.f23710e = c1Var;
        this.f23708b = i7;
        this.f23709c = str;
        this.d = str2;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r17, org.telegram.tgnet.TLRPC.TL_error r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.eh.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }
}
