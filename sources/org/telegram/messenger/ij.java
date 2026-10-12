package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ij implements Runnable {
    public final int f17891a;
    public final SendMessagesHelper f17892b;
    public final TLRPC.Message f17893c;
    public final boolean d;

    public ij(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17891a = i10;
        this.f17892b = sendMessagesHelper;
        this.f17893c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17891a) {
            case 0:
                this.f17892b.lambda$putToSendingMessages$64(this.f17893c, this.d);
                return;
            case 1:
                this.f17892b.lambda$performSendMessageRequest$90(this.f17893c, this.d);
                return;
            default:
                this.f17892b.lambda$performSendMessageRequest$87(this.f17893c, this.d);
                return;
        }
    }
}
