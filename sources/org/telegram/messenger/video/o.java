package org.telegram.messenger.video;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ke0;
public final class o implements Runnable {
    public final int f17825a;
    public final Object f17826b;
    public final Object f17827c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f17825a = i10;
        this.f17826b = obj;
        this.f17827c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.o.run():void");
    }

    public o(ke0 ke0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f17825a = 27;
        this.f17826b = ke0Var;
        this.f17827c = tL_error;
        this.d = tLObject;
    }
}
