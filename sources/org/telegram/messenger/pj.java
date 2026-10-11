package org.telegram.messenger;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f18885a;
    public final SendMessagesHelper f18886b;
    public final TLObject f18887c;
    public final TLRPC.InputMedia d;
    public final SendMessagesHelper.DelayedMessage f18888e;

    public pj(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10) {
        this.f18885a = i10;
        this.f18886b = sendMessagesHelper;
        this.f18887c = tLObject;
        this.d = inputMedia;
        this.f18888e = delayedMessage;
    }

    @Override
    public final void run() {
        switch (this.f18885a) {
            case 0:
                this.f18886b.lambda$performSendDelayedMessage$54(this.f18887c, this.d, this.f18888e);
                return;
            default:
                this.f18886b.lambda$uploadMultiMedia$62(this.f18887c, this.d, this.f18888e);
                return;
        }
    }
}
