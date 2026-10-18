package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fi implements RequestDelegate {
    public final int f18389a;
    public final SendMessagesHelper f18390b;
    public final TLRPC.InputMedia f18391c;
    public final SendMessagesHelper.DelayedMessage d;

    public fi(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18389a = i10;
        this.f18390b = sendMessagesHelper;
        this.f18391c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18389a) {
            case 0:
                this.f18390b.lambda$performSendDelayedMessage$55(this.f18391c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18390b.lambda$uploadMultiMedia$63(this.f18391c, this.d, tLObject, tL_error);
                return;
        }
    }
}
