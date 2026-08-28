package org.telegram.messenger.video;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hd0;
public final class e implements Runnable {
    public final int f21793a;
    public final Object f21794b;
    public final Object f21795c;
    public final Object d;

    public e(Object obj, Object obj2, Object obj3, int i9) {
        this.f21793a = i9;
        this.f21794b = obj;
        this.f21795c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.e.run():void");
    }

    public e(hd0 hd0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f21793a = 29;
        this.f21794b = hd0Var;
        this.f21795c = tL_error;
        this.d = tLObject;
    }
}
