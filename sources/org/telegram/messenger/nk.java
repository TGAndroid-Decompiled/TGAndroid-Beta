package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nk implements RequestDelegate {
    public final int f15908a;
    public final SendMessagesHelper f15909b;
    public final TLRPC.InputMedia f15910c;
    public final SendMessagesHelper.DelayedMessage d;

    public nk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f15908a = i10;
        this.f15909b = sendMessagesHelper;
        this.f15910c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15908a) {
            case 0:
                this.f15909b.lambda$uploadMultiMedia$60(this.f15910c, this.d, tLObject, tL_error);
                return;
            default:
                this.f15909b.lambda$performSendDelayedMessage$52(this.f15910c, this.d, tLObject, tL_error);
                return;
        }
    }
}
