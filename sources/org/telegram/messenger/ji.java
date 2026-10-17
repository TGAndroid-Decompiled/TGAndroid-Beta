package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f18712a;
    public final SendMessagesHelper f18713b;
    public final TLRPC.Updates f18714c;
    public final TLRPC.Message d;
    public final boolean e;

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18712a = i10;
        this.f18713b = sendMessagesHelper;
        this.f18714c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18712a) {
            case 0:
                this.f18713b.lambda$performSendMessageRequest$88(this.f18714c, this.d, this.e);
                return;
            default:
                this.f18713b.lambda$performSendMessageRequest$91(this.f18714c, this.d, this.e);
                return;
        }
    }
}
