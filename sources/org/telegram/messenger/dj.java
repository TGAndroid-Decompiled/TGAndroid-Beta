package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dj implements Runnable {
    public final int f17493a;
    public final SendMessagesHelper f17494b;
    public final TLRPC.Message f17495c;
    public final boolean d;

    public dj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17493a = i10;
        this.f17494b = sendMessagesHelper;
        this.f17495c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17493a) {
            case 0:
                this.f17494b.lambda$putToSendingMessages$61(this.f17495c, this.d);
                return;
            case 1:
                this.f17494b.lambda$performSendMessageRequest$84(this.f17495c, this.d);
                return;
            default:
                this.f17494b.lambda$performSendMessageRequest$87(this.f17495c, this.d);
                return;
        }
    }
}
