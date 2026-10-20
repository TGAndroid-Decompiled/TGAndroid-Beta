package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ki implements Runnable {
    public final int f18816a;
    public final SendMessagesHelper f18817b;
    public final TLRPC.Updates f18818c;
    public final TLRPC.Message d;
    public final boolean e;

    public ki(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18816a = i10;
        this.f18817b = sendMessagesHelper;
        this.f18818c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18816a) {
            case 0:
                this.f18817b.lambda$performSendMessageRequest$88(this.f18818c, this.d, this.e);
                return;
            default:
                this.f18817b.lambda$performSendMessageRequest$91(this.f18818c, this.d, this.e);
                return;
        }
    }
}
