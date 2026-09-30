package org.telegram.messenger.video;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ne0;
public final class o implements Runnable {
    public final int f17858a;
    public final Object f17859b;
    public final Object f17860c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f17858a = i10;
        this.f17859b = obj;
        this.f17860c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.o.run():void");
    }

    public o(ne0 ne0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f17858a = 27;
        this.f17859b = ne0Var;
        this.f17860c = tL_error;
        this.d = tLObject;
    }
}
