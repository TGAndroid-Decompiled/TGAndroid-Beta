package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hk implements RequestDelegate {
    public final int f17425a;
    public final SendMessagesHelper f17426b;
    public final TLRPC.InputMedia f17427c;
    public final SendMessagesHelper.DelayedMessage d;

    public hk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17425a = i10;
        this.f17426b = sendMessagesHelper;
        this.f17427c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17425a) {
            case 0:
                this.f17426b.lambda$uploadMultiMedia$60(this.f17427c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17426b.lambda$performSendDelayedMessage$52(this.f17427c, this.d, tLObject, tL_error);
                return;
        }
    }
}
