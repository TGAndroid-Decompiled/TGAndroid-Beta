package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f19505a;
    public final SendMessagesHelper f19506b;
    public final TLRPC.Updates f19507c;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19505a = i10;
        this.f19506b = sendMessagesHelper;
        this.f19507c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19505a) {
            case 0:
                this.f19506b.lambda$performSendMessageRequest$97(this.f19507c);
                return;
            default:
                this.f19506b.lambda$performSendMessageRequestMulti$75(this.f19507c);
                return;
        }
    }
}
