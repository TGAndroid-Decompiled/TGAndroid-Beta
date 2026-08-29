package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dk implements RequestDelegate {
    public final int f20072a;
    public final SendMessagesHelper f20073b;
    public final TLRPC.InputMedia f20074c;
    public final SendMessagesHelper.DelayedMessage d;

    public dk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f20072a = i10;
        this.f20073b = sendMessagesHelper;
        this.f20074c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20072a) {
            case 0:
                this.f20073b.lambda$uploadMultiMedia$60(this.f20074c, this.d, tLObject, tL_error);
                return;
            default:
                this.f20073b.lambda$performSendDelayedMessage$52(this.f20074c, this.d, tLObject, tL_error);
                return;
        }
    }
}
