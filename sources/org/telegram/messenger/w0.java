package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w0 implements RequestDelegate {
    public final int f18864a;
    public final ChatObject.Call f18865b;

    public w0(ChatObject.Call call, int i10) {
        this.f18864a = i10;
        this.f18865b = call;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18864a) {
            case 0:
                this.f18865b.lambda$loadGroupCall$11(tLObject, tL_error);
                return;
            case 1:
                this.f18865b.lambda$reloadGroupCall$9(tLObject, tL_error);
                return;
            case 2:
                this.f18865b.lambda$setTitle$4(tLObject, tL_error);
                return;
            default:
                this.f18865b.lambda$toggleRecord$13(tLObject, tL_error);
                return;
        }
    }
}
