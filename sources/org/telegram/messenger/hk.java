package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hk implements RequestDelegate {
    public final int f18892a;
    public final SendMessagesHelper f18893b;
    public final TLRPC.InputMedia f18894c;
    public final SendMessagesHelper.DelayedMessage d;

    public hk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18892a = i10;
        this.f18893b = sendMessagesHelper;
        this.f18894c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18892a) {
            case 0:
                this.f18893b.lambda$uploadMultiMedia$60(this.f18894c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18893b.lambda$performSendDelayedMessage$52(this.f18894c, this.d, tLObject, tL_error);
                return;
        }
    }
}
