package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w0 implements RequestDelegate {
    public final int f17976a;
    public final ChatObject.Call f17977b;

    public w0(ChatObject.Call call, int i10) {
        this.f17976a = i10;
        this.f17977b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17976a) {
            case 0:
                this.f17977b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f17977b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f17977b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f17977b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
