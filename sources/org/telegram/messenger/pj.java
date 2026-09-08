package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f18753a;
    public final SendMessagesHelper f18754b;
    public final TLObject f18755c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f18756e;

    public pj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18753a = i10;
        this.f18754b = sendMessagesHelper;
        this.f18755c = tLObject;
        this.d = inputMedia;
        this.f18756e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18753a) {
            case 0:
                this.f18754b.lambda$uploadMultiMedia$59(this.f18755c, this.d, this.f18756e);
                return;
            default:
                this.f18754b.lambda$performSendDelayedMessage$51(this.f18755c, this.d, this.f18756e);
                return;
        }
    }
}
