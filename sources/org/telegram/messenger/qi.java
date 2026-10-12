package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f18236a;
    public final SendMessagesHelper f18237b;
    public final TLRPC.Updates f18238c;
    public final TLRPC.Message d;
    public final boolean e;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18236a = i10;
        this.f18237b = sendMessagesHelper;
        this.f18238c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18236a) {
            case 0:
                this.f18237b.lambda$performSendMessageRequest$88(this.f18238c, this.d, this.e);
                return;
            default:
                this.f18237b.lambda$performSendMessageRequest$91(this.f18238c, this.d, this.e);
                return;
        }
    }
}
