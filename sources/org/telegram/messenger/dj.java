package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dj implements Runnable {
    public final int f17688a;
    public final SendMessagesHelper f17689b;
    public final TLRPC.Message f17690c;
    public final boolean d;

    public dj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17688a = i10;
        this.f17689b = sendMessagesHelper;
        this.f17690c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17688a) {
            case 0:
                this.f17689b.lambda$putToSendingMessages$61(this.f17690c, this.d);
                return;
            case 1:
                this.f17689b.lambda$performSendMessageRequest$84(this.f17690c, this.d);
                return;
            default:
                this.f17689b.lambda$performSendMessageRequest$87(this.f17690c, this.d);
                return;
        }
    }
}
