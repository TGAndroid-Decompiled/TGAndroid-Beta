package org.telegram.messenger.video;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ie0;
public final class o implements Runnable {
    public final int f17813a;
    public final Object f17814b;
    public final Object f17815c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f17813a = i10;
        this.f17814b = obj;
        this.f17815c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.o.run():void");
    }

    public o(ie0 ie0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f17813a = 27;
        this.f17814b = ie0Var;
        this.f17815c = tL_error;
        this.d = tLObject;
    }
}
