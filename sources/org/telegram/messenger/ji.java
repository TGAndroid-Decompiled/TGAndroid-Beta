package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f18106a;
    public final SendMessagesHelper f18107b;
    public final TLRPC.Updates f18108c;
    public final TLRPC.Message d;
    public final boolean f18109e;

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18106a = i10;
        this.f18107b = sendMessagesHelper;
        this.f18108c = updates;
        this.d = message;
        this.f18109e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18106a) {
            case 0:
                this.f18107b.lambda$performSendMessageRequest$88(this.f18108c, this.d, this.f18109e);
                return;
            default:
                this.f18107b.lambda$performSendMessageRequest$85(this.f18108c, this.d, this.f18109e);
                return;
        }
    }
}
