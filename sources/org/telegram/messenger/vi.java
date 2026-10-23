package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vi implements Runnable {
    public final int f19776a;
    public final SendMessagesHelper f19777b;
    public final TLRPC.Updates f19778c;

    public vi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19776a = i10;
        this.f19777b = sendMessagesHelper;
        this.f19778c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19776a) {
            case 0:
                this.f19777b.lambda$performSendMessageRequest$97(this.f19778c);
                return;
            default:
                this.f19777b.lambda$performSendMessageRequestMulti$75(this.f19778c);
                return;
        }
    }
}
