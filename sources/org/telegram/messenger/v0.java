package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v0 implements RequestDelegate {
    public final int f19219a;
    public final ChatObject.Call f19220b;

    public v0(ChatObject.Call call, int i10) {
        this.f19219a = i10;
        this.f19220b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19219a) {
            case 0:
                this.f19220b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f19220b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f19220b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f19220b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
