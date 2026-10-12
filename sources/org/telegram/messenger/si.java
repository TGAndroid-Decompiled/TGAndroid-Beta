package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f18910a;
    public final SendMessagesHelper f18911b;
    public final TLRPC.Updates f18912c;
    public final TLRPC.Message d;
    public final boolean f18913e;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18910a = i10;
        this.f18911b = sendMessagesHelper;
        this.f18912c = updates;
        this.d = message;
        this.f18913e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18910a) {
            case 0:
                this.f18911b.lambda$performSendMessageRequest$88(this.f18912c, this.d, this.f18913e);
                return;
            default:
                this.f18911b.lambda$performSendMessageRequest$91(this.f18912c, this.d, this.f18913e);
                return;
        }
    }
}
