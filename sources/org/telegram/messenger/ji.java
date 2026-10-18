package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f18718a;
    public final SendMessagesHelper f18719b;
    public final TLRPC.Updates f18720c;
    public final TLRPC.Message d;
    public final boolean e;

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18718a = i10;
        this.f18719b = sendMessagesHelper;
        this.f18720c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18718a) {
            case 0:
                this.f18719b.lambda$performSendMessageRequest$88(this.f18720c, this.d, this.e);
                return;
            default:
                this.f18719b.lambda$performSendMessageRequest$91(this.f18720c, this.d, this.e);
                return;
        }
    }
}
