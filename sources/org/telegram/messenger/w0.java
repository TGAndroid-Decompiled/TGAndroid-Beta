package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w0 implements RequestDelegate {
    public final int f21980a;
    public final ChatObject.Call f21981b;

    public w0(ChatObject.Call call, int i9) {
        this.f21980a = i9;
        this.f21981b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21980a) {
            case 0:
                this.f21981b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f21981b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f21981b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f21981b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
