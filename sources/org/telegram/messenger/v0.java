package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class v0 implements RequestDelegate {

    public final int f21759a;

    public final ChatObject.Call f21760b;

    public v0(ChatObject.Call call, int i10) {
        this.f21759a = i10;
        this.f21760b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21759a) {
            case 0:
                this.f21760b.lambda$loadGroupCall$11(tLObject, tL_error);
                break;
            case 1:
                this.f21760b.lambda$reloadGroupCall$9(tLObject, tL_error);
                break;
            case 2:
                this.f21760b.lambda$setTitle$4(tLObject, tL_error);
                break;
            default:
                this.f21760b.lambda$toggleRecord$13(tLObject, tL_error);
                break;
        }
    }
}
