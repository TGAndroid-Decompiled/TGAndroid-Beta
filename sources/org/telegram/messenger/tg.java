package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
public final class tg implements RequestDelegate {
    public final int f25519a;
    public final int f25520b;
    public final String f25521c;
    public final String d;
    public final c1 f25522e;

    public tg(c1 c1Var, int i3, String str, String str2, int i10) {
        this.f25519a = i10;
        this.f25522e = c1Var;
        this.f25520b = i3;
        this.f25521c = str;
        this.d = str2;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r17, org.telegram.tgnet.TLRPC.TL_error r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.tg.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }
}
