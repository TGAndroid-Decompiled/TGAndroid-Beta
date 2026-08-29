package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v0 implements RequestDelegate {
    public final int f21777a;
    public final ChatObject.Call f21778b;

    public v0(ChatObject.Call call, int i10) {
        this.f21777a = i10;
        this.f21778b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21777a) {
            case 0:
                this.f21778b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f21778b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f21778b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f21778b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
