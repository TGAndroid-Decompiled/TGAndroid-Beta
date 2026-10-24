package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mi implements Runnable {
    public final int f19046a;
    public final SendMessagesHelper f19047b;
    public final TLRPC.Updates f19048c;
    public final TLRPC.Message d;
    public final boolean e;

    public mi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f19046a = i10;
        this.f19047b = sendMessagesHelper;
        this.f19048c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f19046a) {
            case 0:
                this.f19047b.lambda$performSendMessageRequest$88(this.f19048c, this.d, this.e);
                return;
            default:
                this.f19047b.lambda$performSendMessageRequest$91(this.f19048c, this.d, this.e);
                return;
        }
    }
}
