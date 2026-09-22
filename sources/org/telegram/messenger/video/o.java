package org.telegram.messenger.video;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.le0;
public final class o implements Runnable {
    public final int f17828a;
    public final Object f17829b;
    public final Object f17830c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f17828a = i10;
        this.f17829b = obj;
        this.f17830c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.o.run():void");
    }

    public o(le0 le0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f17828a = 27;
        this.f17829b = le0Var;
        this.f17830c = tL_error;
        this.d = tLObject;
    }
}
