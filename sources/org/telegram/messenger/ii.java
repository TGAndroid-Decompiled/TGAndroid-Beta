package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f16667a;
    public final SendMessagesHelper f16668b;
    public final TLRPC.Updates f16669c;
    public final TLRPC.Message d;
    public final boolean e;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f16667a = i10;
        this.f16668b = sendMessagesHelper;
        this.f16669c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f16667a) {
            case 0:
                this.f16668b.lambda$performSendMessageRequest$88(this.f16669c, this.d, this.e);
                return;
            default:
                this.f16668b.lambda$performSendMessageRequest$85(this.f16669c, this.d, this.e);
                return;
        }
    }
}
