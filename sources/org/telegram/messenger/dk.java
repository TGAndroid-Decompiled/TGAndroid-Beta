package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dk implements RequestDelegate {
    public final int f17698a;
    public final SendMessagesHelper f17699b;
    public final TLRPC.InputMedia f17700c;
    public final SendMessagesHelper.DelayedMessage d;

    public dk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17698a = i10;
        this.f17699b = sendMessagesHelper;
        this.f17700c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17698a) {
            case 0:
                this.f17699b.lambda$uploadMultiMedia$60(this.f17700c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17699b.lambda$performSendDelayedMessage$52(this.f17700c, this.d, tLObject, tL_error);
                return;
        }
    }
}
