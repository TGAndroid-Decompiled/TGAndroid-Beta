package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ji implements RequestDelegate {
    public final int f18318a;
    public final SendMessagesHelper f18319b;
    public final TLRPC.InputMedia f18320c;
    public final SendMessagesHelper.DelayedMessage d;

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18318a = i10;
        this.f18319b = sendMessagesHelper;
        this.f18320c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18318a) {
            case 0:
                this.f18319b.lambda$performSendDelayedMessage$55(this.f18320c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18319b.lambda$uploadMultiMedia$63(this.f18320c, this.d, tLObject, tL_error);
                return;
        }
    }
}
