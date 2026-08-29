package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f21090a;
    public final SendMessagesHelper f21091b;
    public final TLObject f21092c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f21093e;

    public nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f21090a = i10;
        this.f21091b = sendMessagesHelper;
        this.f21092c = tLObject;
        this.d = inputMedia;
        this.f21093e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f21090a) {
            case 0:
                this.f21091b.lambda$uploadMultiMedia$59(this.f21092c, this.d, this.f21093e);
                return;
            default:
                this.f21091b.lambda$performSendDelayedMessage$51(this.f21092c, this.d, this.f21093e);
                return;
        }
    }
}
