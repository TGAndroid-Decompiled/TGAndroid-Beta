package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f17446a;
    public final SendMessagesHelper f17447b;
    public final TLRPC.Message f17448c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17446a = i10;
        this.f17447b = sendMessagesHelper;
        this.f17448c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17446a) {
            case 0:
                this.f17447b.lambda$putToSendingMessages$61(this.f17448c, this.d);
                return;
            case 1:
                this.f17447b.lambda$performSendMessageRequest$84(this.f17448c, this.d);
                return;
            default:
                this.f17447b.lambda$performSendMessageRequest$87(this.f17448c, this.d);
                return;
        }
    }
}
