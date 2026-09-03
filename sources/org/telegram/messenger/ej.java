package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ej implements Runnable {
    public final int f17140a;
    public final SendMessagesHelper f17141b;
    public final TLRPC.Updates f17142c;

    public ej(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f17140a = i10;
        this.f17141b = sendMessagesHelper;
        this.f17142c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17140a) {
            case 0:
                this.f17141b.lambda$performSendMessageRequest$94(this.f17142c);
                return;
            default:
                this.f17141b.lambda$performSendMessageRequestMulti$72(this.f17142c);
                return;
        }
    }
}
