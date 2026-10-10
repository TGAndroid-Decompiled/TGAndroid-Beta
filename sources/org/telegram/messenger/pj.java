package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f18880a;
    public final SendMessagesHelper f18881b;
    public final TLObject f18882c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f18883e;

    public pj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18880a = i10;
        this.f18881b = sendMessagesHelper;
        this.f18882c = tLObject;
        this.d = inputMedia;
        this.f18883e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18880a) {
            case 0:
                this.f18881b.lambda$performSendDelayedMessage$54(this.f18882c, this.d, this.f18883e);
                return;
            default:
                this.f18881b.lambda$uploadMultiMedia$62(this.f18882c, this.d, this.f18883e);
                return;
        }
    }
}
