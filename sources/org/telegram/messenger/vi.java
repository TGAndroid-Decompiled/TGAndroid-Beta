package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vi implements Runnable {
    public final int f19839a;
    public final SendMessagesHelper f19840b;
    public final TLRPC.Updates f19841c;

    public vi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19839a = i10;
        this.f19840b = sendMessagesHelper;
        this.f19841c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19839a) {
            case 0:
                this.f19840b.lambda$performSendMessageRequest$97(this.f19841c);
                return;
            default:
                this.f19840b.lambda$performSendMessageRequestMulti$75(this.f19841c);
                return;
        }
    }
}
