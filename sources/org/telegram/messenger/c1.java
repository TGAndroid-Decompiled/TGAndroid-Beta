package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c1 implements RequestDelegate {
    public final int f19742a;
    public final ChatObject.Call f19743b;

    public c1(ChatObject.Call call, int i10) {
        this.f19742a = i10;
        this.f19743b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19742a) {
            case 0:
                this.f19743b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f19743b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f19743b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f19743b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
