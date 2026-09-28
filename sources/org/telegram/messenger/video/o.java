package org.telegram.messenger.video;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.me0;
public final class o implements Runnable {
    public final int f17841a;
    public final Object f17842b;
    public final Object f17843c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f17841a = i10;
        this.f17842b = obj;
        this.f17843c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.o.run():void");
    }

    public o(me0 me0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f17841a = 27;
        this.f17842b = me0Var;
        this.f17843c = tL_error;
        this.d = tLObject;
    }
}
