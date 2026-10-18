package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f18899a;
    public final SendMessagesHelper f18900b;
    public final TLObject f18901c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public lj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18899a = i10;
        this.f18900b = sendMessagesHelper;
        this.f18901c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18899a) {
            case 0:
                this.f18900b.lambda$performSendDelayedMessage$54(this.f18901c, this.d, this.e);
                return;
            default:
                this.f18900b.lambda$uploadMultiMedia$62(this.f18901c, this.d, this.e);
                return;
        }
    }
}
