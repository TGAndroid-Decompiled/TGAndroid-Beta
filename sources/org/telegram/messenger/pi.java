package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pi implements Runnable {
    public final int f17823a;
    public final SendMessagesHelper f17824b;
    public final TLRPC.Updates f17825c;
    public final TLRPC.Message d;
    public final boolean e;

    public pi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f17823a = i10;
        this.f17824b = sendMessagesHelper;
        this.f17825c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f17823a) {
            case 0:
                this.f17824b.lambda$performSendMessageRequest$88(this.f17825c, this.d, this.e);
                return;
            default:
                this.f17824b.lambda$performSendMessageRequest$91(this.f17825c, this.d, this.e);
                return;
        }
    }
}
