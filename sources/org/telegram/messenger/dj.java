package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dj implements Runnable {
    public final int f17693a;
    public final SendMessagesHelper f17694b;
    public final TLRPC.Message f17695c;
    public final boolean d;

    public dj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17693a = i10;
        this.f17694b = sendMessagesHelper;
        this.f17695c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17693a) {
            case 0:
                this.f17694b.lambda$putToSendingMessages$61(this.f17695c, this.d);
                return;
            case 1:
                this.f17694b.lambda$performSendMessageRequest$84(this.f17695c, this.d);
                return;
            default:
                this.f17694b.lambda$performSendMessageRequest$87(this.f17695c, this.d);
                return;
        }
    }
}
