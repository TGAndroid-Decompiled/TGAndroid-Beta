package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class li implements RequestDelegate {
    public final int f17503a;
    public final SendMessagesHelper f17504b;
    public final TLRPC.InputMedia f17505c;
    public final SendMessagesHelper.DelayedMessage d;

    public li(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17503a = i10;
        this.f17504b = sendMessagesHelper;
        this.f17505c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17503a) {
            case 0:
                this.f17504b.lambda$performSendDelayedMessage$55(this.f17505c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17504b.lambda$uploadMultiMedia$63(this.f17505c, this.d, tLObject, tL_error);
                return;
        }
    }
}
