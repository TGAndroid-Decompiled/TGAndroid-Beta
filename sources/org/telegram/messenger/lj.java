package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lj implements Runnable {
    public final int f18902a;
    public final SendMessagesHelper f18903b;
    public final TLObject f18904c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public lj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18902a = i10;
        this.f18903b = sendMessagesHelper;
        this.f18904c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18902a) {
            case 0:
                this.f18903b.lambda$performSendDelayedMessage$54(this.f18904c, this.d, this.e);
                return;
            default:
                this.f18903b.lambda$uploadMultiMedia$62(this.f18904c, this.d, this.e);
                return;
        }
    }
}
