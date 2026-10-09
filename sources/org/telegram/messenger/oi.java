package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class oi implements Runnable {
    public final int f18763a;
    public final SendMessagesHelper f18764b;
    public final TLRPC.Updates f18765c;
    public final TLRPC.Message d;
    public final boolean f18766e;

    public oi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18763a = i10;
        this.f18764b = sendMessagesHelper;
        this.f18765c = updates;
        this.d = message;
        this.f18766e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18763a) {
            case 0:
                this.f18764b.lambda$performSendMessageRequest$88(this.f18765c, this.d, this.f18766e);
                return;
            default:
                this.f18764b.lambda$performSendMessageRequest$91(this.f18765c, this.d, this.f18766e);
                return;
        }
    }
}
