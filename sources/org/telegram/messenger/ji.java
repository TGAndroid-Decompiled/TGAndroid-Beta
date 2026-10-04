package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f18276a;
    public final SendMessagesHelper f18277b;
    public final TLRPC.Updates f18278c;
    public final TLRPC.Message d;
    public final boolean f18279e;

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18276a = i10;
        this.f18277b = sendMessagesHelper;
        this.f18278c = updates;
        this.d = message;
        this.f18279e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18276a) {
            case 0:
                this.f18277b.lambda$performSendMessageRequest$88(this.f18278c, this.d, this.f18279e);
                return;
            default:
                this.f18277b.lambda$performSendMessageRequest$85(this.f18278c, this.d, this.f18279e);
                return;
        }
    }
}
