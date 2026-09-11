package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f17419a;
    public final SendMessagesHelper f17420b;
    public final TLRPC.Message f17421c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17419a = i10;
        this.f17420b = sendMessagesHelper;
        this.f17421c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17419a) {
            case 0:
                this.f17420b.lambda$putToSendingMessages$61(this.f17421c, this.d);
                return;
            case 1:
                this.f17420b.lambda$performSendMessageRequest$84(this.f17421c, this.d);
                return;
            default:
                this.f17420b.lambda$performSendMessageRequest$87(this.f17421c, this.d);
                return;
        }
    }
}
