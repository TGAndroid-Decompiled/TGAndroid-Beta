package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ii implements RequestDelegate {
    public final int f18624a;
    public final SendMessagesHelper f18625b;
    public final TLRPC.InputMedia f18626c;
    public final SendMessagesHelper.DelayedMessage d;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18624a = i10;
        this.f18625b = sendMessagesHelper;
        this.f18626c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18624a) {
            case 0:
                this.f18625b.lambda$performSendDelayedMessage$55(this.f18626c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18625b.lambda$uploadMultiMedia$63(this.f18626c, this.d, tLObject, tL_error);
                return;
        }
    }
}
