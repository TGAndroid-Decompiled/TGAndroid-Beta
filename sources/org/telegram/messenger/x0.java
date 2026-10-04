package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x0 implements RequestDelegate {
    public final int f19758a;
    public final ChatObject.Call f19759b;

    public x0(ChatObject.Call call, int i10) {
        this.f19758a = i10;
        this.f19759b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19758a) {
            case 0:
                this.f19759b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f19759b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f19759b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f19759b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
