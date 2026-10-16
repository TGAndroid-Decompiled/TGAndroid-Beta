package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sj implements Runnable {
    public final int f18134a;
    public final SendMessagesHelper f18135b;
    public final TLObject f18136c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public sj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18134a = i10;
        this.f18135b = sendMessagesHelper;
        this.f18136c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18134a) {
            case 0:
                this.f18135b.lambda$performSendDelayedMessage$54(this.f18136c, this.d, this.e);
                return;
            default:
                this.f18135b.lambda$uploadMultiMedia$62(this.f18136c, this.d, this.e);
                return;
        }
    }
}
