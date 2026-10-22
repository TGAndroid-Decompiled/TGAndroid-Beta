package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mi implements Runnable {
    public final int f18980a;
    public final SendMessagesHelper f18981b;
    public final TLRPC.Updates f18982c;
    public final TLRPC.Message d;
    public final boolean e;

    public mi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18980a = i10;
        this.f18981b = sendMessagesHelper;
        this.f18982c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18980a) {
            case 0:
                this.f18981b.lambda$performSendMessageRequest$88(this.f18982c, this.d, this.e);
                return;
            default:
                this.f18981b.lambda$performSendMessageRequest$91(this.f18982c, this.d, this.e);
                return;
        }
    }
}
