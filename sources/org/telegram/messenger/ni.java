package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ni implements Runnable {
    public final int f18672a;
    public final SendMessagesHelper f18673b;
    public final TLRPC.Updates f18674c;
    public final TLRPC.Message d;
    public final boolean f18675e;

    public ni(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18672a = i10;
        this.f18673b = sendMessagesHelper;
        this.f18674c = updates;
        this.d = message;
        this.f18675e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18672a) {
            case 0:
                this.f18673b.lambda$performSendMessageRequest$88(this.f18674c, this.d, this.f18675e);
                return;
            default:
                this.f18673b.lambda$performSendMessageRequest$91(this.f18674c, this.d, this.f18675e);
                return;
        }
    }
}
