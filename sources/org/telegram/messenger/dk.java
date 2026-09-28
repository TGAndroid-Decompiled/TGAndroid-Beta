package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dk implements RequestDelegate {
    public final int f16235a;
    public final SendMessagesHelper f16236b;
    public final TLRPC.InputMedia f16237c;
    public final SendMessagesHelper.DelayedMessage d;

    public dk(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f16235a = i10;
        this.f16236b = sendMessagesHelper;
        this.f16237c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16235a) {
            case 0:
                this.f16236b.lambda$uploadMultiMedia$60(this.f16237c, this.d, tLObject, tL_error);
                return;
            default:
                this.f16236b.lambda$performSendDelayedMessage$52(this.f16237c, this.d, tLObject, tL_error);
                return;
        }
    }
}
