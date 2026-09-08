package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk implements RequestDelegate {
    public final int f17711a;
    public final SendMessagesHelper f17712b;
    public final TLRPC.InputMedia f17713c;
    public final SendMessagesHelper.DelayedMessage d;

    public fk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17711a = i10;
        this.f17712b = sendMessagesHelper;
        this.f17713c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17711a) {
            case 0:
                this.f17712b.lambda$uploadMultiMedia$60(this.f17713c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17712b.lambda$performSendDelayedMessage$52(this.f17713c, this.d, tLObject, tL_error);
                return;
        }
    }
}
