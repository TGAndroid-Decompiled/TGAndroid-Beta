package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f20415a;
    public final SendMessagesHelper f20416b;
    public final TLObject f20417c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f20418e;

    public gj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i9) {
        this.f20415a = i9;
        this.f20416b = sendMessagesHelper;
        this.f20417c = tLObject;
        this.d = inputMedia;
        this.f20418e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f20415a) {
            case 0:
                this.f20416b.lambda$uploadMultiMedia$59(this.f20417c, this.d, this.f20418e);
                return;
            default:
                this.f20416b.lambda$performSendDelayedMessage$51(this.f20417c, this.d, this.f20418e);
                return;
        }
    }
}
