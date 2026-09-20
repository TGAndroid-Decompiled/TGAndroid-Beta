package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ek implements RequestDelegate {
    public final int f16290a;
    public final SendMessagesHelper f16291b;
    public final TLRPC.InputMedia f16292c;
    public final SendMessagesHelper.DelayedMessage d;

    public ek(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f16290a = i10;
        this.f16291b = sendMessagesHelper;
        this.f16292c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16290a) {
            case 0:
                this.f16291b.lambda$uploadMultiMedia$60(this.f16292c, this.d, tLObject, tL_error);
                return;
            default:
                this.f16291b.lambda$performSendDelayedMessage$52(this.f16292c, this.d, tLObject, tL_error);
                return;
        }
    }
}
