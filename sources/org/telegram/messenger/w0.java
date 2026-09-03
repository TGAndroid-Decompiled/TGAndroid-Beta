package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w0 implements RequestDelegate {
    public final int f20502a;
    public final ChatObject.Call f20503b;

    public w0(ChatObject.Call call, int i10) {
        this.f20502a = i10;
        this.f20503b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20502a) {
            case 0:
                this.f20503b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f20503b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f20503b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f20503b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
