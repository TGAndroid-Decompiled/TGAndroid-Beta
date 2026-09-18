package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk implements RequestDelegate {
    public final int f16333a;
    public final SendMessagesHelper f16334b;
    public final TLRPC.InputMedia f16335c;
    public final SendMessagesHelper.DelayedMessage d;

    public fk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f16333a = i10;
        this.f16334b = sendMessagesHelper;
        this.f16335c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16333a) {
            case 0:
                this.f16334b.lambda$uploadMultiMedia$60(this.f16335c, this.d, tLObject, tL_error);
                return;
            default:
                this.f16334b.lambda$performSendDelayedMessage$52(this.f16335c, this.d, tLObject, tL_error);
                return;
        }
    }
}
