package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dk implements RequestDelegate {
    public final int f16222a;
    public final SendMessagesHelper f16223b;
    public final TLRPC.InputMedia f16224c;
    public final SendMessagesHelper.DelayedMessage d;

    public dk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f16222a = i10;
        this.f16223b = sendMessagesHelper;
        this.f16224c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16222a) {
            case 0:
                this.f16223b.lambda$uploadMultiMedia$60(this.f16224c, this.d, tLObject, tL_error);
                return;
            default:
                this.f16223b.lambda$performSendDelayedMessage$52(this.f16224c, this.d, tLObject, tL_error);
                return;
        }
    }
}
