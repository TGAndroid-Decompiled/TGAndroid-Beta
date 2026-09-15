package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f16501a;
    public final SendMessagesHelper f16502b;
    public final TLRPC.Updates f16503c;
    public final TLRPC.Message d;
    public final boolean e;

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f16501a = i10;
        this.f16502b = sendMessagesHelper;
        this.f16503c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f16501a) {
            case 0:
                this.f16502b.lambda$performSendMessageRequest$88(this.f16503c, this.d, this.e);
                return;
            default:
                this.f16502b.lambda$performSendMessageRequest$85(this.f16503c, this.d, this.e);
                return;
        }
    }
}
