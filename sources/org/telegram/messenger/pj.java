package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f18921a;
    public final SendMessagesHelper f18922b;
    public final TLObject f18923c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f18924e;

    public pj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18921a = i10;
        this.f18922b = sendMessagesHelper;
        this.f18923c = tLObject;
        this.d = inputMedia;
        this.f18924e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18921a) {
            case 0:
                this.f18922b.lambda$performSendDelayedMessage$54(this.f18923c, this.d, this.f18924e);
                return;
            default:
                this.f18922b.lambda$uploadMultiMedia$62(this.f18923c, this.d, this.f18924e);
                return;
        }
    }
}
