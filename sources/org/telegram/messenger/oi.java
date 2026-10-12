package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oi implements RequestDelegate {
    public final int f18492a;
    public final SendMessagesHelper f18493b;
    public final TLRPC.InputMedia f18494c;
    public final SendMessagesHelper.DelayedMessage d;

    public oi(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18492a = i10;
        this.f18493b = sendMessagesHelper;
        this.f18494c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18492a) {
            case 0:
                this.f18493b.lambda$performSendDelayedMessage$55(this.f18494c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18493b.lambda$uploadMultiMedia$63(this.f18494c, this.d, tLObject, tL_error);
                return;
        }
    }
}
