package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ki implements RequestDelegate {
    public final int f18374a;
    public final SendMessagesHelper f18375b;
    public final TLRPC.InputMedia f18376c;
    public final SendMessagesHelper.DelayedMessage d;

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18374a = i10;
        this.f18375b = sendMessagesHelper;
        this.f18376c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18374a) {
            case 0:
                this.f18375b.lambda$performSendDelayedMessage$55(this.f18376c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18375b.lambda$uploadMultiMedia$63(this.f18376c, this.d, tLObject, tL_error);
                return;
        }
    }
}
