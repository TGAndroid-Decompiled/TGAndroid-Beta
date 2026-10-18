package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kj implements Runnable {
    public final int f18818a;
    public final SendMessagesHelper f18819b;
    public final TLObject f18820c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage e;

    public kj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18818a = i10;
        this.f18819b = sendMessagesHelper;
        this.f18820c = tLObject;
        this.d = inputMedia;
        this.e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18818a) {
            case 0:
                this.f18819b.lambda$performSendDelayedMessage$54(this.f18820c, this.d, this.e);
                return;
            default:
                this.f18819b.lambda$uploadMultiMedia$62(this.f18820c, this.d, this.e);
                return;
        }
    }
}
