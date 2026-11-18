package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
public final class dh implements RequestDelegate {
    public final int f23522a;
    public final int f23523b;
    public final String f23524c;
    public final String d;
    public final c1 f23525e;

    public dh(c1 c1Var, int i7, String str, String str2, int i10) {
        this.f23522a = i10;
        this.f23525e = c1Var;
        this.f23523b = i7;
        this.f23524c = str;
        this.d = str2;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r17, org.telegram.tgnet.TLRPC.TL_error r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dh.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }
}
