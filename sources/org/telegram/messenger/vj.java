package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vj implements Runnable {
    public final int f19284a;
    public final SendMessagesHelper f19285b;
    public final TLObject f19286c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f19287e;

    public vj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f19284a = i10;
        this.f19285b = sendMessagesHelper;
        this.f19286c = tLObject;
        this.d = inputMedia;
        this.f19287e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f19284a) {
            case 0:
                this.f19285b.lambda$performSendDelayedMessage$54(this.f19286c, this.d, this.f19287e);
                return;
            default:
                this.f19285b.lambda$uploadMultiMedia$62(this.f19286c, this.d, this.f19287e);
                return;
        }
    }
}
