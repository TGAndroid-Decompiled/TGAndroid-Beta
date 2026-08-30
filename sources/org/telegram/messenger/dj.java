package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dj implements Runnable {
    public final int f17079a;
    public final SendMessagesHelper f17080b;
    public final TLRPC.Updates f17081c;

    public dj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f17079a = i10;
        this.f17080b = sendMessagesHelper;
        this.f17081c = updates;
    }

    @Override
    public final void run() {
        switch (this.f17079a) {
            case 0:
                this.f17080b.lambda$performSendMessageRequest$94(this.f17081c);
                return;
            default:
                this.f17080b.lambda$performSendMessageRequestMulti$72(this.f17081c);
                return;
        }
    }
}
