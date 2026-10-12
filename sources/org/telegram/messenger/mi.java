package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mi implements RequestDelegate {
    public final int f17884a;
    public final SendMessagesHelper f17885b;
    public final TLRPC.InputMedia f17886c;
    public final SendMessagesHelper.DelayedMessage d;

    public mi(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17884a = i10;
        this.f17885b = sendMessagesHelper;
        this.f17886c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17884a) {
            case 0:
                this.f17885b.lambda$performSendDelayedMessage$55(this.f17886c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17885b.lambda$uploadMultiMedia$63(this.f17886c, this.d, tLObject, tL_error);
                return;
        }
    }
}
