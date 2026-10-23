package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mj implements Runnable {
    public final int f19002a;
    public final SendMessagesHelper f19003b;
    public final TLObject f19004c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public mj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f19002a = i10;
        this.f19003b = sendMessagesHelper;
        this.f19004c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f19002a) {
            case 0:
                this.f19003b.lambda$performSendDelayedMessage$54(this.f19004c, this.d, this.e);
                return;
            default:
                this.f19003b.lambda$uploadMultiMedia$62(this.f19004c, this.d, this.e);
                return;
        }
    }
}
