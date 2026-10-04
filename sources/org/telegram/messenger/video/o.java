package org.telegram.messenger.video;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.me0;
public final class o implements Runnable {
    public final int f19488a;
    public final Object f19489b;
    public final Object f19490c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f19488a = i10;
        this.f19489b = obj;
        this.f19490c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.o.run():void");
    }

    public o(me0 me0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f19488a = 27;
        this.f19489b = me0Var;
        this.f19490c = tL_error;
        this.d = tLObject;
    }
}
