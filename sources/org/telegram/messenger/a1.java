package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a1 implements RequestDelegate {
    public final int f17892a;
    public final ChatObject.Call f17893b;

    public a1(ChatObject.Call call, int i10) {
        this.f17892a = i10;
        this.f17893b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17892a) {
            case 0:
                this.f17893b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f17893b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f17893b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f17893b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
