package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bj implements Runnable {
    public final int f17471a;
    public final SendMessagesHelper f17472b;
    public final TLRPC.Updates f17473c;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f17471a = i10;
        this.f17472b = sendMessagesHelper;
        this.f17473c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17471a) {
            case 0:
                this.f17472b.lambda$performSendMessageRequest$94(this.f17473c);
                return;
            default:
                this.f17472b.lambda$performSendMessageRequestMulti$72(this.f17473c);
                return;
        }
    }
}
