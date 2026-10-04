package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dk implements RequestDelegate {
    public final int f17697a;
    public final SendMessagesHelper f17698b;
    public final TLRPC.InputMedia f17699c;
    public final SendMessagesHelper.DelayedMessage d;

    public dk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17697a = i10;
        this.f17698b = sendMessagesHelper;
        this.f17699c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17697a) {
            case 0:
                this.f17698b.lambda$uploadMultiMedia$60(this.f17699c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17698b.lambda$performSendDelayedMessage$52(this.f17699c, this.d, tLObject, tL_error);
                return;
        }
    }
}
