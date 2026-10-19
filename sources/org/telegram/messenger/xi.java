package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xi implements Runnable {
    public final int f20090a;
    public final SendMessagesHelper f20091b;
    public final TLRPC.Message f20092c;
    public final boolean d;

    public xi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f20090a = i10;
        this.f20091b = sendMessagesHelper;
        this.f20092c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20090a) {
            case 0:
                this.f20091b.lambda$putToSendingMessages$64(this.f20092c, this.d);
                return;
            case 1:
                this.f20091b.lambda$performSendMessageRequest$90(this.f20092c, this.d);
                return;
            default:
                this.f20091b.lambda$performSendMessageRequest$87(this.f20092c, this.d);
                return;
        }
    }
}
