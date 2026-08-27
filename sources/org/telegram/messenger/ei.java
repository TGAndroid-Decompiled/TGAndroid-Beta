package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class ei implements Runnable {

    public final int f20171a;

    public final SendMessagesHelper f20172b;

    public final TLRPC.Updates f20173c;
    public final TLRPC.Message d;

    public final boolean f20174e;

    public ei(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f20171a = i10;
        this.f20172b = sendMessagesHelper;
        this.f20173c = updates;
        this.d = message;
        this.f20174e = z10;
    }

    @Override
    public final void run() {
        switch (this.f20171a) {
            case 0:
                this.f20172b.lambda$performSendMessageRequest$88(this.f20173c, this.d, this.f20174e);
                break;
            default:
                this.f20172b.lambda$performSendMessageRequest$85(this.f20173c, this.d, this.f20174e);
                break;
        }
    }
}
