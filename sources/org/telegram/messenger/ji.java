package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f18721a;
    public final SendMessagesHelper f18722b;
    public final TLRPC.Updates f18723c;
    public final TLRPC.Message d;
    public final boolean e;

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18721a = i10;
        this.f18722b = sendMessagesHelper;
        this.f18723c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18721a) {
            case 0:
                this.f18722b.lambda$performSendMessageRequest$88(this.f18723c, this.d, this.e);
                return;
            default:
                this.f18722b.lambda$performSendMessageRequest$91(this.f18723c, this.d, this.e);
                return;
        }
    }
}
