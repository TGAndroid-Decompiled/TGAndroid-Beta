package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ek implements RequestDelegate {
    public final int f16058a;
    public final SendMessagesHelper f16059b;
    public final TLRPC.InputMedia f16060c;
    public final SendMessagesHelper.DelayedMessage d;

    public ek(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f16058a = i10;
        this.f16059b = sendMessagesHelper;
        this.f16060c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16058a) {
            case 0:
                this.f16059b.lambda$uploadMultiMedia$60(this.f16060c, this.d, tLObject, tL_error);
                return;
            default:
                this.f16059b.lambda$performSendDelayedMessage$52(this.f16060c, this.d, tLObject, tL_error);
                return;
        }
    }
}
