package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class li implements RequestDelegate {
    public final int f20622a;
    public final SendMessagesHelper f20623b;
    public final TLRPC.InputMedia f20624c;
    public final SendMessagesHelper.DelayedMessage d;

    public li(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f20622a = i10;
        this.f20623b = sendMessagesHelper;
        this.f20624c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20622a) {
            case 0:
                this.f20623b.lambda$performSendDelayedMessage$55(this.f20624c, this.d, tLObject, tL_error);
                return;
            default:
                this.f20623b.lambda$uploadMultiMedia$63(this.f20624c, this.d, tLObject, tL_error);
                return;
        }
    }
}
