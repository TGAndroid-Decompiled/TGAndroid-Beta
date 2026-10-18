package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ei implements RequestDelegate {
    public final int f18312a;
    public final SendMessagesHelper f18313b;
    public final TLRPC.InputMedia f18314c;
    public final SendMessagesHelper.DelayedMessage d;

    public ei(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18312a = i10;
        this.f18313b = sendMessagesHelper;
        this.f18314c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18312a) {
            case 0:
                this.f18313b.lambda$performSendDelayedMessage$55(this.f18314c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18313b.lambda$uploadMultiMedia$63(this.f18314c, this.d, tLObject, tL_error);
                return;
        }
    }
}
