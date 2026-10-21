package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gi implements RequestDelegate {
    public final int f18475a;
    public final SendMessagesHelper f18476b;
    public final TLRPC.InputMedia f18477c;
    public final SendMessagesHelper.DelayedMessage d;

    public gi(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18475a = i10;
        this.f18476b = sendMessagesHelper;
        this.f18477c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18475a) {
            case 0:
                this.f18476b.lambda$performSendDelayedMessage$55(this.f18477c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18476b.lambda$uploadMultiMedia$63(this.f18477c, this.d, tLObject, tL_error);
                return;
        }
    }
}
