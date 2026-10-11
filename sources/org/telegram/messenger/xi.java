package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xi implements Runnable {
    public final int f19825a;
    public final SendMessagesHelper f19826b;
    public final TLRPC.Updates f19827c;

    public xi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19825a = i10;
        this.f19826b = sendMessagesHelper;
        this.f19827c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19825a) {
            case 0:
                this.f19826b.lambda$performSendMessageRequest$97(this.f19827c);
                return;
            default:
                this.f19826b.lambda$performSendMessageRequestMulti$75(this.f19827c);
                return;
        }
    }
}
