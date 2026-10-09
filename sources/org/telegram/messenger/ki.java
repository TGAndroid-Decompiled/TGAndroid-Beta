package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ki implements RequestDelegate {
    public final int f18370a;
    public final SendMessagesHelper f18371b;
    public final TLRPC.InputMedia f18372c;
    public final SendMessagesHelper.DelayedMessage d;

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18370a = i10;
        this.f18371b = sendMessagesHelper;
        this.f18372c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18370a) {
            case 0:
                this.f18371b.lambda$performSendDelayedMessage$55(this.f18372c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18371b.lambda$uploadMultiMedia$63(this.f18372c, this.d, tLObject, tL_error);
                return;
        }
    }
}
