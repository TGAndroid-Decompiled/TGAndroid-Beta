package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pi implements Runnable {
    public final int f20976a;
    public final SendMessagesHelper f20977b;
    public final TLRPC.Updates f20978c;
    public final TLRPC.Message d;
    public final boolean e;

    public pi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f20976a = i10;
        this.f20977b = sendMessagesHelper;
        this.f20978c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f20976a) {
            case 0:
                this.f20977b.lambda$performSendMessageRequest$88(this.f20978c, this.d, this.e);
                return;
            default:
                this.f20977b.lambda$performSendMessageRequest$91(this.f20978c, this.d, this.e);
                return;
        }
    }
}
