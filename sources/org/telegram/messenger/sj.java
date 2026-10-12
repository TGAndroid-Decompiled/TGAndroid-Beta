package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sj implements Runnable {
    public final int f18430a;
    public final SendMessagesHelper f18431b;
    public final TLObject f18432c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public sj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18430a = i10;
        this.f18431b = sendMessagesHelper;
        this.f18432c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18430a) {
            case 0:
                this.f18431b.lambda$performSendDelayedMessage$54(this.f18432c, this.d, this.e);
                return;
            default:
                this.f18431b.lambda$uploadMultiMedia$62(this.f18432c, this.d, this.e);
                return;
        }
    }
}
