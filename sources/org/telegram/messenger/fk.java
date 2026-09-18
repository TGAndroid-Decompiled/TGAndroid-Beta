package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk implements RequestDelegate {
    public final int f16165a;
    public final SendMessagesHelper f16166b;
    public final TLRPC.InputMedia f16167c;
    public final SendMessagesHelper.DelayedMessage d;

    public fk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f16165a = i10;
        this.f16166b = sendMessagesHelper;
        this.f16167c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16165a) {
            case 0:
                this.f16166b.lambda$uploadMultiMedia$60(this.f16167c, this.d, tLObject, tL_error);
                return;
            default:
                this.f16166b.lambda$performSendDelayedMessage$52(this.f16167c, this.d, tLObject, tL_error);
                return;
        }
    }
}
