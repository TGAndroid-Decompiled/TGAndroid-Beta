package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gz implements RequestDelegate {
    public final String f15986a;
    public final iz f15987b;

    public gz(iz izVar, String str) {
        this.f15987b = izVar;
        this.f15986a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new ir(18, this, this.f15986a));
    }
}
