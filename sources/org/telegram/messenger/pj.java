package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f18726a;
    public final SendMessagesHelper f18727b;
    public final TLObject f18728c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f18729e;

    public pj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18726a = i10;
        this.f18727b = sendMessagesHelper;
        this.f18728c = tLObject;
        this.d = inputMedia;
        this.f18729e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18726a) {
            case 0:
                this.f18727b.lambda$uploadMultiMedia$59(this.f18728c, this.d, this.f18729e);
                return;
            default:
                this.f18727b.lambda$performSendDelayedMessage$51(this.f18728c, this.d, this.f18729e);
                return;
        }
    }
}
