package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oi implements RequestDelegate {
    public final int f18493a;
    public final SendMessagesHelper f18494b;
    public final TLRPC.InputMedia f18495c;
    public final SendMessagesHelper.DelayedMessage d;

    public oi(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18493a = i10;
        this.f18494b = sendMessagesHelper;
        this.f18495c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18493a) {
            case 0:
                this.f18494b.lambda$performSendDelayedMessage$55(this.f18495c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18494b.lambda$uploadMultiMedia$63(this.f18495c, this.d, tLObject, tL_error);
                return;
        }
    }
}
