package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f18634a;
    public final SendMessagesHelper f18635b;
    public final TLRPC.Updates f18636c;
    public final TLRPC.Message d;
    public final boolean e;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18634a = i10;
        this.f18635b = sendMessagesHelper;
        this.f18636c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18634a) {
            case 0:
                this.f18635b.lambda$performSendMessageRequest$88(this.f18636c, this.d, this.e);
                return;
            default:
                this.f18635b.lambda$performSendMessageRequest$91(this.f18636c, this.d, this.e);
                return;
        }
    }
}
