package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f18182a;
    public final SendMessagesHelper f18183b;
    public final TLRPC.Updates f18184c;
    public final TLRPC.Message d;
    public final boolean f18185e;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18182a = i10;
        this.f18183b = sendMessagesHelper;
        this.f18184c = updates;
        this.d = message;
        this.f18185e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18182a) {
            case 0:
                this.f18183b.lambda$performSendMessageRequest$88(this.f18184c, this.d, this.f18185e);
                return;
            default:
                this.f18183b.lambda$performSendMessageRequest$85(this.f18184c, this.d, this.f18185e);
                return;
        }
    }
}
