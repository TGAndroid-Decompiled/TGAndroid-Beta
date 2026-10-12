package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f18911a;
    public final SendMessagesHelper f18912b;
    public final TLRPC.Updates f18913c;
    public final TLRPC.Message d;
    public final boolean f18914e;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18911a = i10;
        this.f18912b = sendMessagesHelper;
        this.f18913c = updates;
        this.d = message;
        this.f18914e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18911a) {
            case 0:
                this.f18912b.lambda$performSendMessageRequest$88(this.f18913c, this.d, this.f18914e);
                return;
            default:
                this.f18912b.lambda$performSendMessageRequest$91(this.f18913c, this.d, this.f18914e);
                return;
        }
    }
}
