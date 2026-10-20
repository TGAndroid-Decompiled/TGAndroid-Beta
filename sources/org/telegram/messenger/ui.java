package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ui implements Runnable {
    public final int f19680a;
    public final SendMessagesHelper f19681b;
    public final TLRPC.Updates f19682c;

    public ui(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19680a = i10;
        this.f19681b = sendMessagesHelper;
        this.f19682c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19680a) {
            case 0:
                this.f19681b.lambda$performSendMessageRequest$97(this.f19682c);
                return;
            default:
                this.f19681b.lambda$performSendMessageRequestMulti$75(this.f19682c);
                return;
        }
    }
}
