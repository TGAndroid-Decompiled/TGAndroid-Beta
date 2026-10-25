package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f20981a;
    public final SendMessagesHelper f20982b;
    public final TLObject f20983c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public pj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f20981a = i10;
        this.f20982b = sendMessagesHelper;
        this.f20983c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f20981a) {
            case 0:
                this.f20982b.lambda$performSendDelayedMessage$54(this.f20983c, this.d, this.e);
                return;
            default:
                this.f20982b.lambda$uploadMultiMedia$62(this.f20983c, this.d, this.e);
                return;
        }
    }
}
