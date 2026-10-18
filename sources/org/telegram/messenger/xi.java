package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xi implements Runnable {
    public final int f20096a;
    public final SendMessagesHelper f20097b;
    public final TLRPC.Message f20098c;
    public final boolean d;

    public xi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f20096a = i10;
        this.f20097b = sendMessagesHelper;
        this.f20098c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20096a) {
            case 0:
                this.f20097b.lambda$putToSendingMessages$64(this.f20098c, this.d);
                return;
            case 1:
                this.f20097b.lambda$performSendMessageRequest$90(this.f20098c, this.d);
                return;
            default:
                this.f20097b.lambda$performSendMessageRequest$87(this.f20098c, this.d);
                return;
        }
    }
}
