package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fz implements RequestDelegate {
    public final String f15645a;
    public final hz f15646b;

    public fz(hz hzVar, String str) {
        this.f15646b = hzVar;
        this.f15645a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new hr(18, this, this.f15645a));
    }
}
