package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ek implements RequestDelegate {
    public final int f16305a;
    public final SendMessagesHelper f16306b;
    public final TLRPC.InputMedia f16307c;
    public final SendMessagesHelper.DelayedMessage d;

    public ek(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f16305a = i10;
        this.f16306b = sendMessagesHelper;
        this.f16307c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16305a) {
            case 0:
                this.f16306b.lambda$uploadMultiMedia$60(this.f16307c, this.d, tLObject, tL_error);
                return;
            default:
                this.f16306b.lambda$performSendDelayedMessage$52(this.f16307c, this.d, tLObject, tL_error);
                return;
        }
    }
}
