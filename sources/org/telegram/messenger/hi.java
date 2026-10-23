package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hi implements RequestDelegate {
    public final int f18555a;
    public final SendMessagesHelper f18556b;
    public final TLRPC.InputMedia f18557c;
    public final SendMessagesHelper.DelayedMessage d;

    public hi(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18555a = i10;
        this.f18556b = sendMessagesHelper;
        this.f18557c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18555a) {
            case 0:
                this.f18556b.lambda$performSendDelayedMessage$55(this.f18557c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18556b.lambda$uploadMultiMedia$63(this.f18557c, this.d, tLObject, tL_error);
                return;
        }
    }
}
