package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hi implements RequestDelegate {
    public final int f18621a;
    public final SendMessagesHelper f18622b;
    public final TLRPC.InputMedia f18623c;
    public final SendMessagesHelper.DelayedMessage d;

    public hi(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18621a = i10;
        this.f18622b = sendMessagesHelper;
        this.f18623c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18621a) {
            case 0:
                this.f18622b.lambda$performSendDelayedMessage$55(this.f18623c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18622b.lambda$uploadMultiMedia$63(this.f18623c, this.d, tLObject, tL_error);
                return;
        }
    }
}
