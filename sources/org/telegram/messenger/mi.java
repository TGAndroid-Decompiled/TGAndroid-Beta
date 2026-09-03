package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mi implements Runnable {
    public final int f19381a;
    public final SendMessagesHelper f19382b;
    public final TLRPC.Updates f19383c;
    public final TLRPC.Message d;
    public final boolean f19384e;

    public mi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z4, int i10) {
        this.f19381a = i10;
        this.f19382b = sendMessagesHelper;
        this.f19383c = updates;
        this.d = message;
        this.f19384e = z4;
    }

    @Override
    public final void run() {
        switch (this.f19381a) {
            case 0:
                this.f19382b.lambda$performSendMessageRequest$88(this.f19383c, this.d, this.f19384e);
                return;
            default:
                this.f19382b.lambda$performSendMessageRequest$85(this.f19383c, this.d, this.f19384e);
                return;
        }
    }
}
