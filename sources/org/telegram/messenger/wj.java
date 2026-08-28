package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wj implements RequestDelegate {
    public final int f22053a;
    public final SendMessagesHelper f22054b;
    public final TLRPC.InputMedia f22055c;
    public final SendMessagesHelper.DelayedMessage d;

    public wj(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i9) {
        this.f22053a = i9;
        this.f22054b = sendMessagesHelper;
        this.f22055c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22053a) {
            case 0:
                this.f22054b.lambda$uploadMultiMedia$60(this.f22055c, this.d, tLObject, tL_error);
                return;
            default:
                this.f22054b.lambda$performSendDelayedMessage$52(this.f22055c, this.d, tLObject, tL_error);
                return;
        }
    }
}
