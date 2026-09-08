package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dj implements Runnable {
    public final int f17520a;
    public final SendMessagesHelper f17521b;
    public final TLRPC.Message f17522c;
    public final boolean d;

    public dj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17520a = i10;
        this.f17521b = sendMessagesHelper;
        this.f17522c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17520a) {
            case 0:
                this.f17521b.lambda$putToSendingMessages$61(this.f17522c, this.d);
                return;
            case 1:
                this.f17521b.lambda$performSendMessageRequest$84(this.f17522c, this.d);
                return;
            default:
                this.f17521b.lambda$performSendMessageRequest$87(this.f17522c, this.d);
                return;
        }
    }
}
