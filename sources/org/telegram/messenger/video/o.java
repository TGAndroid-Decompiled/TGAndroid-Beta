package org.telegram.messenger.video;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ke0;
public final class o implements Runnable {
    public final int f17816a;
    public final Object f17817b;
    public final Object f17818c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f17816a = i10;
        this.f17817b = obj;
        this.f17818c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.o.run():void");
    }

    public o(ke0 ke0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f17816a = 27;
        this.f17817b = ke0Var;
        this.f17818c = tL_error;
        this.d = tLObject;
    }
}
