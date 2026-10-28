package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qj implements Runnable {
    public final int f21066a;
    public final SendMessagesHelper f21067b;
    public final TLObject f21068c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public qj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f21066a = i10;
        this.f21067b = sendMessagesHelper;
        this.f21068c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f21066a) {
            case 0:
                this.f21067b.lambda$performSendDelayedMessage$54(this.f21068c, this.d, this.e);
                return;
            default:
                this.f21067b.lambda$uploadMultiMedia$62(this.f21068c, this.d, this.e);
                return;
        }
    }
}
