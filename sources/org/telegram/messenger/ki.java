package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ki implements Runnable {
    public final int f16779a;
    public final SendMessagesHelper f16780b;
    public final TLRPC.Updates f16781c;
    public final TLRPC.Message d;
    public final boolean e;

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f16779a = i10;
        this.f16780b = sendMessagesHelper;
        this.f16781c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f16779a) {
            case 0:
                this.f16780b.lambda$performSendMessageRequest$88(this.f16781c, this.d, this.e);
                return;
            default:
                this.f16780b.lambda$performSendMessageRequest$85(this.f16781c, this.d, this.e);
                return;
        }
    }
}
