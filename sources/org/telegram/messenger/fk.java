package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk implements RequestDelegate {
    public final int f16150a;
    public final SendMessagesHelper f16151b;
    public final TLRPC.InputMedia f16152c;
    public final SendMessagesHelper.DelayedMessage d;

    public fk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f16150a = i10;
        this.f16151b = sendMessagesHelper;
        this.f16152c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16150a) {
            case 0:
                this.f16151b.lambda$uploadMultiMedia$60(this.f16152c, this.d, tLObject, tL_error);
                return;
            default:
                this.f16151b.lambda$performSendDelayedMessage$52(this.f16152c, this.d, tLObject, tL_error);
                return;
        }
    }
}
