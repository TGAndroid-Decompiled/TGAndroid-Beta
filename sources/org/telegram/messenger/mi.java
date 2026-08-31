package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mi implements Runnable {
    public final int f19379a;
    public final SendMessagesHelper f19380b;
    public final TLRPC.Updates f19381c;
    public final TLRPC.Message d;
    public final boolean f19382e;

    public mi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z4, int i10) {
        this.f19379a = i10;
        this.f19380b = sendMessagesHelper;
        this.f19381c = updates;
        this.d = message;
        this.f19382e = z4;
    }

    @Override
    public final void run() {
        switch (this.f19379a) {
            case 0:
                this.f19380b.lambda$performSendMessageRequest$88(this.f19381c, this.d, this.f19382e);
                return;
            default:
                this.f19380b.lambda$performSendMessageRequest$85(this.f19381c, this.d, this.f19382e);
                return;
        }
    }
}
