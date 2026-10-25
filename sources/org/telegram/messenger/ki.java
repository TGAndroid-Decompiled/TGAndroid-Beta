package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ki implements RequestDelegate {
    public final int f20533a;
    public final SendMessagesHelper f20534b;
    public final TLRPC.InputMedia f20535c;
    public final SendMessagesHelper.DelayedMessage d;

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f20533a = i10;
        this.f20534b = sendMessagesHelper;
        this.f20535c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20533a) {
            case 0:
                this.f20534b.lambda$performSendDelayedMessage$55(this.f20535c, this.d, tLObject, tL_error);
                return;
            default:
                this.f20534b.lambda$uploadMultiMedia$63(this.f20535c, this.d, tLObject, tL_error);
                return;
        }
    }
}
