package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fi implements RequestDelegate {
    public final int f18392a;
    public final SendMessagesHelper f18393b;
    public final TLRPC.InputMedia f18394c;
    public final SendMessagesHelper.DelayedMessage d;

    public fi(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18392a = i10;
        this.f18393b = sendMessagesHelper;
        this.f18394c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18392a) {
            case 0:
                this.f18393b.lambda$performSendDelayedMessage$55(this.f18394c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18393b.lambda$uploadMultiMedia$63(this.f18394c, this.d, tLObject, tL_error);
                return;
        }
    }
}
