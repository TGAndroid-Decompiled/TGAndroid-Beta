package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w0 implements RequestDelegate {
    public final int f17961a;
    public final ChatObject.Call f17962b;

    public w0(ChatObject.Call call, int i10) {
        this.f17961a = i10;
        this.f17962b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17961a) {
            case 0:
                this.f17962b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f17962b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f17962b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f17962b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
