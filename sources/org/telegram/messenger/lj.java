package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f18909a;
    public final SendMessagesHelper f18910b;
    public final TLObject f18911c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public lj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18909a = i10;
        this.f18910b = sendMessagesHelper;
        this.f18911c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18909a) {
            case 0:
                this.f18910b.lambda$performSendDelayedMessage$54(this.f18911c, this.d, this.e);
                return;
            default:
                this.f18910b.lambda$uploadMultiMedia$62(this.f18911c, this.d, this.e);
                return;
        }
    }
}
