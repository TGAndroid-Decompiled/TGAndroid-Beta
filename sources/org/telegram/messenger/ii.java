package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f18637a;
    public final SendMessagesHelper f18638b;
    public final TLRPC.Updates f18639c;
    public final TLRPC.Message d;
    public final boolean e;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18637a = i10;
        this.f18638b = sendMessagesHelper;
        this.f18639c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18637a) {
            case 0:
                this.f18638b.lambda$performSendMessageRequest$88(this.f18639c, this.d, this.e);
                return;
            default:
                this.f18638b.lambda$performSendMessageRequest$91(this.f18639c, this.d, this.e);
                return;
        }
    }
}
