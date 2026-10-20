package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f18905a;
    public final SendMessagesHelper f18906b;
    public final TLObject f18907c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public lj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18905a = i10;
        this.f18906b = sendMessagesHelper;
        this.f18907c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18905a) {
            case 0:
                this.f18906b.lambda$performSendDelayedMessage$54(this.f18907c, this.d, this.e);
                return;
            default:
                this.f18906b.lambda$uploadMultiMedia$62(this.f18907c, this.d, this.e);
                return;
        }
    }
}
