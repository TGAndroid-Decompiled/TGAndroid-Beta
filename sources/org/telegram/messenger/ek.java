package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ek implements RequestDelegate {
    public final int f17795a;
    public final SendMessagesHelper f17796b;
    public final TLRPC.InputMedia f17797c;
    public final SendMessagesHelper.DelayedMessage d;

    public ek(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17795a = i10;
        this.f17796b = sendMessagesHelper;
        this.f17797c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17795a) {
            case 0:
                this.f17796b.lambda$uploadMultiMedia$60(this.f17797c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17796b.lambda$performSendDelayedMessage$52(this.f17797c, this.d, tLObject, tL_error);
                return;
        }
    }
}
