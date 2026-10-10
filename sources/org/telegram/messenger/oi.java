package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class oi implements Runnable {
    public final int f18767a;
    public final SendMessagesHelper f18768b;
    public final TLRPC.Updates f18769c;
    public final TLRPC.Message d;
    public final boolean f18770e;

    public oi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18767a = i10;
        this.f18768b = sendMessagesHelper;
        this.f18769c = updates;
        this.d = message;
        this.f18770e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18767a) {
            case 0:
                this.f18768b.lambda$performSendMessageRequest$88(this.f18769c, this.d, this.f18770e);
                return;
            default:
                this.f18768b.lambda$performSendMessageRequest$91(this.f18769c, this.d, this.f18770e);
                return;
        }
    }
}
