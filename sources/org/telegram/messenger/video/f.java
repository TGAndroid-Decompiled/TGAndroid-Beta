package org.telegram.messenger.video;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bf0;
public final class f implements Runnable {
    public final int f19466a;
    public final Object f19467b;
    public final Object f19468c;
    public final Object d;

    public f(Object obj, Object obj2, Object obj3, int i10) {
        this.f19466a = i10;
        this.f19467b = obj;
        this.f19468c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.f.run():void");
    }

    public f(bf0 bf0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f19466a = 29;
        this.f19467b = bf0Var;
        this.f19468c = tL_error;
        this.d = tLObject;
    }
}
