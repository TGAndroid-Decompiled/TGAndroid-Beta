package org.telegram.messenger.video;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.je0;
public final class o implements Runnable {
    public final int f17782a;
    public final Object f17783b;
    public final Object f17784c;
    public final Object d;

    public o(Object obj, Object obj2, Object obj3, int i10) {
        this.f17782a = i10;
        this.f17783b = obj;
        this.f17784c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.o.run():void");
    }

    public o(je0 je0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f17782a = 27;
        this.f17783b = je0Var;
        this.f17784c = tL_error;
        this.d = tLObject;
    }
}
