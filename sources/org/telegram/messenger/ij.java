package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ij implements Runnable {
    public final int f17890a;
    public final SendMessagesHelper f17891b;
    public final TLRPC.Message f17892c;
    public final boolean d;

    public ij(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17890a = i10;
        this.f17891b = sendMessagesHelper;
        this.f17892c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17890a) {
            case 0:
                this.f17891b.lambda$putToSendingMessages$64(this.f17892c, this.d);
                return;
            case 1:
                this.f17891b.lambda$performSendMessageRequest$90(this.f17892c, this.d);
                return;
            default:
                this.f17891b.lambda$performSendMessageRequest$87(this.f17892c, this.d);
                return;
        }
    }
}
