package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f18823a;
    public final SendMessagesHelper f18824b;
    public final TLObject f18825c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f18826e;

    public oj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18823a = i10;
        this.f18824b = sendMessagesHelper;
        this.f18825c = tLObject;
        this.d = inputMedia;
        this.f18826e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18823a) {
            case 0:
                this.f18824b.lambda$uploadMultiMedia$59(this.f18825c, this.d, this.f18826e);
                return;
            default:
                this.f18824b.lambda$performSendDelayedMessage$51(this.f18825c, this.d, this.f18826e);
                return;
        }
    }
}
