package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ii implements RequestDelegate {
    public final int f18691a;
    public final SendMessagesHelper f18692b;
    public final TLRPC.InputMedia f18693c;
    public final SendMessagesHelper.DelayedMessage d;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18691a = i10;
        this.f18692b = sendMessagesHelper;
        this.f18693c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18691a) {
            case 0:
                this.f18692b.lambda$performSendDelayedMessage$55(this.f18693c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18692b.lambda$uploadMultiMedia$63(this.f18693c, this.d, tLObject, tL_error);
                return;
        }
    }
}
