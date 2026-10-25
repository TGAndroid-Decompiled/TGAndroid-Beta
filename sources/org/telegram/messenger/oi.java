package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class oi implements Runnable {
    public final int f20889a;
    public final SendMessagesHelper f20890b;
    public final TLRPC.Updates f20891c;
    public final TLRPC.Message d;
    public final boolean e;

    public oi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f20889a = i10;
        this.f20890b = sendMessagesHelper;
        this.f20891c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f20889a) {
            case 0:
                this.f20890b.lambda$performSendMessageRequest$88(this.f20891c, this.d, this.e);
                return;
            default:
                this.f20890b.lambda$performSendMessageRequest$91(this.f20891c, this.d, this.e);
                return;
        }
    }
}
