package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ai implements Runnable {
    public final int f19753a;
    public final SendMessagesHelper f19754b;
    public final TLRPC.Updates f19755c;
    public final TLRPC.Message d;
    public final boolean f19756e;

    public ai(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i9) {
        this.f19753a = i9;
        this.f19754b = sendMessagesHelper;
        this.f19755c = updates;
        this.d = message;
        this.f19756e = z10;
    }

    @Override
    public final void run() {
        switch (this.f19753a) {
            case 0:
                this.f19754b.lambda$performSendMessageRequest$88(this.f19755c, this.d, this.f19756e);
                return;
            default:
                this.f19754b.lambda$performSendMessageRequest$85(this.f19755c, this.d, this.f19756e);
                return;
        }
    }
}
