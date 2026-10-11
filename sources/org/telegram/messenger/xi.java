package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xi implements Runnable {
    public final int f19861a;
    public final SendMessagesHelper f19862b;
    public final TLRPC.Updates f19863c;

    public xi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19861a = i10;
        this.f19862b = sendMessagesHelper;
        this.f19863c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19861a) {
            case 0:
                this.f19862b.lambda$performSendMessageRequest$97(this.f19863c);
                return;
            default:
                this.f19862b.lambda$performSendMessageRequestMulti$75(this.f19863c);
                return;
        }
    }
}
