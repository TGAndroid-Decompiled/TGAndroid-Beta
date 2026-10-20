package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gi implements RequestDelegate {
    public final int f18482a;
    public final SendMessagesHelper f18483b;
    public final TLRPC.InputMedia f18484c;
    public final SendMessagesHelper.DelayedMessage d;

    public gi(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18482a = i10;
        this.f18483b = sendMessagesHelper;
        this.f18484c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18482a) {
            case 0:
                this.f18483b.lambda$performSendDelayedMessage$55(this.f18484c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18483b.lambda$uploadMultiMedia$63(this.f18484c, this.d, tLObject, tL_error);
                return;
        }
    }
}
