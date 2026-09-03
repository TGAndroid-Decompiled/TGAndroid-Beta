package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hk implements RequestDelegate {
    public final int f17405a;
    public final SendMessagesHelper f17406b;
    public final TLRPC.InputMedia f17407c;
    public final SendMessagesHelper.DelayedMessage d;

    public hk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17405a = i10;
        this.f17406b = sendMessagesHelper;
        this.f17407c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17405a) {
            case 0:
                this.f17406b.lambda$uploadMultiMedia$60(this.f17407c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17406b.lambda$performSendDelayedMessage$52(this.f17407c, this.d, tLObject, tL_error);
                return;
        }
    }
}
