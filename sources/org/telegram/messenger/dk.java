package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dk implements RequestDelegate {
    public final int f16228a;
    public final SendMessagesHelper f16229b;
    public final TLRPC.InputMedia f16230c;
    public final SendMessagesHelper.DelayedMessage d;

    public dk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f16228a = i10;
        this.f16229b = sendMessagesHelper;
        this.f16230c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16228a) {
            case 0:
                this.f16229b.lambda$uploadMultiMedia$60(this.f16230c, this.d, tLObject, tL_error);
                return;
            default:
                this.f16229b.lambda$performSendDelayedMessage$52(this.f16230c, this.d, tLObject, tL_error);
                return;
        }
    }
}
