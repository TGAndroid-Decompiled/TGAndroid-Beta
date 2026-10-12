package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vj implements Runnable {
    public final int f19283a;
    public final SendMessagesHelper f19284b;
    public final TLObject f19285c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f19286e;

    public vj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f19283a = i10;
        this.f19284b = sendMessagesHelper;
        this.f19285c = tLObject;
        this.d = inputMedia;
        this.f19286e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f19283a) {
            case 0:
                this.f19284b.lambda$performSendDelayedMessage$54(this.f19285c, this.d, this.f19286e);
                return;
            default:
                this.f19284b.lambda$uploadMultiMedia$62(this.f19285c, this.d, this.f19286e);
                return;
        }
    }
}
