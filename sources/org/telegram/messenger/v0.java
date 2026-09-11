package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v0 implements RequestDelegate {
    public final int f19191a;
    public final ChatObject.Call f19192b;

    public v0(ChatObject.Call call, int i10) {
        this.f19191a = i10;
        this.f19192b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19191a) {
            case 0:
                this.f19192b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f19192b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f19192b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f19192b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
