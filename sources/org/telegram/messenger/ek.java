package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ek implements RequestDelegate {
    public final int f17625a;
    public final SendMessagesHelper f17626b;
    public final TLRPC.InputMedia f17627c;
    public final SendMessagesHelper.DelayedMessage d;

    public ek(SendMessagesHelper sendMessagesHelper, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17625a = i10;
        this.f17626b = sendMessagesHelper;
        this.f17627c = inputMedia;
        this.d = delayedMessage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17625a) {
            case 0:
                this.f17626b.lambda$uploadMultiMedia$60(this.f17627c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17626b.lambda$performSendDelayedMessage$52(this.f17627c, this.d, tLObject, tL_error);
                return;
        }
    }
}
