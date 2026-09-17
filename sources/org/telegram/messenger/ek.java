package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ek implements RequestDelegate {
    public final int f17598a;
    public final SendMessagesHelper f17599b;
    public final TLRPC.InputMedia f17600c;
    public final SendMessagesHelper.DelayedMessage d;

    public ek(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17598a = i10;
        this.f17599b = sendMessagesHelper;
        this.f17600c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17598a) {
            case 0:
                this.f17599b.lambda$uploadMultiMedia$60(this.f17600c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17599b.lambda$performSendDelayedMessage$52(this.f17600c, this.d, tLObject, tL_error);
                return;
        }
    }
}
