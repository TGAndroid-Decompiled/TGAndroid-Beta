package org.telegram.messenger.video;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ke0;
public final class o implements Runnable {
    public final int f17831a;
    public final Object f17832b;
    public final Object f17833c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f17831a = i10;
        this.f17832b = obj;
        this.f17833c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.o.run():void");
    }

    public o(ke0 ke0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f17831a = 27;
        this.f17832b = ke0Var;
        this.f17833c = tL_error;
        this.d = tLObject;
    }
}
