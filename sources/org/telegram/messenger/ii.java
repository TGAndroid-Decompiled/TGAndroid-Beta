package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f16660a;
    public final SendMessagesHelper f16661b;
    public final TLRPC.Updates f16662c;
    public final TLRPC.Message d;
    public final boolean e;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f16660a = i10;
        this.f16661b = sendMessagesHelper;
        this.f16662c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f16660a) {
            case 0:
                this.f16661b.lambda$performSendMessageRequest$88(this.f16662c, this.d, this.e);
                return;
            default:
                this.f16661b.lambda$performSendMessageRequest$85(this.f16662c, this.d, this.e);
                return;
        }
    }
}
