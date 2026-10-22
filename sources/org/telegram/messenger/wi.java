package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wi implements Runnable {
    public final int f20006a;
    public final SendMessagesHelper f20007b;
    public final TLRPC.Updates f20008c;

    public wi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f20006a = i10;
        this.f20007b = sendMessagesHelper;
        this.f20008c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20006a) {
            case 0:
                this.f20007b.lambda$performSendMessageRequest$97(this.f20008c);
                return;
            default:
                this.f20007b.lambda$performSendMessageRequestMulti$75(this.f20008c);
                return;
        }
    }
}
