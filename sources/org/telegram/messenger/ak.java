package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ak implements RequestDelegate {

    public final int f19737a;

    public final SendMessagesHelper f19738b;

    public final TLRPC.InputMedia f19739c;
    public final SendMessagesHelper.DelayedMessage d;

    public ak(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f19737a = i10;
        this.f19738b = sendMessagesHelper;
        this.f19739c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19737a) {
            case 0:
                this.f19738b.lambda$uploadMultiMedia$60(this.f19739c, this.d, tLObject, tL_error);
                break;
            default:
                this.f19738b.lambda$performSendDelayedMessage$52(this.f19739c, this.d, tLObject, tL_error);
                break;
        }
    }
}
