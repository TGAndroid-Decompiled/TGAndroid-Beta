package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nj implements Runnable {
    public final int f17127a;
    public final SendMessagesHelper f17128b;
    public final TLObject f17129c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public nj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f17127a = i10;
        this.f17128b = sendMessagesHelper;
        this.f17129c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f17127a) {
            case 0:
                this.f17128b.lambda$uploadMultiMedia$59(this.f17129c, this.d, this.e);
                return;
            default:
                this.f17128b.lambda$performSendDelayedMessage$51(this.f17129c, this.d, this.e);
                return;
        }
    }
}
