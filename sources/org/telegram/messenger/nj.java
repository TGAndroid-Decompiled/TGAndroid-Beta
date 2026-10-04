package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f18723a;
    public final SendMessagesHelper f18724b;
    public final TLObject f18725c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f18726e;

    public nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18723a = i10;
        this.f18724b = sendMessagesHelper;
        this.f18725c = tLObject;
        this.d = inputMedia;
        this.f18726e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18723a) {
            case 0:
                this.f18724b.lambda$uploadMultiMedia$59(this.f18725c, this.d, this.f18726e);
                return;
            default:
                this.f18724b.lambda$performSendDelayedMessage$51(this.f18725c, this.d, this.f18726e);
                return;
        }
    }
}
