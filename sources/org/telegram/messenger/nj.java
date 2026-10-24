package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f19140a;
    public final SendMessagesHelper f19141b;
    public final TLObject f19142c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f19140a = i10;
        this.f19141b = sendMessagesHelper;
        this.f19142c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f19140a) {
            case 0:
                this.f19141b.lambda$performSendDelayedMessage$54(this.f19142c, this.d, this.e);
                return;
            default:
                this.f19141b.lambda$uploadMultiMedia$62(this.f19142c, this.d, this.e);
                return;
        }
    }
}
