package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mj implements Runnable {
    public final int f19066a;
    public final SendMessagesHelper f19067b;
    public final TLObject f19068c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public mj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f19066a = i10;
        this.f19067b = sendMessagesHelper;
        this.f19068c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f19066a) {
            case 0:
                this.f19067b.lambda$performSendDelayedMessage$54(this.f19068c, this.d, this.e);
                return;
            default:
                this.f19067b.lambda$uploadMultiMedia$62(this.f19068c, this.d, this.e);
                return;
        }
    }
}
