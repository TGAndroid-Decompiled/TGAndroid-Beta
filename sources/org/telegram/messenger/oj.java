package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f18642a;
    public final SendMessagesHelper f18643b;
    public final TLObject f18644c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f18645e;

    public oj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18642a = i10;
        this.f18643b = sendMessagesHelper;
        this.f18644c = tLObject;
        this.d = inputMedia;
        this.f18645e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18642a) {
            case 0:
                this.f18643b.lambda$uploadMultiMedia$59(this.f18644c, this.d, this.f18645e);
                return;
            default:
                this.f18643b.lambda$performSendDelayedMessage$51(this.f18644c, this.d, this.f18645e);
                return;
        }
    }
}
