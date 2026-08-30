package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f17324a;
    public final SendMessagesHelper f17325b;
    public final TLRPC.Message f17326c;
    public final boolean d;

    public gj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z4, int i10) {
        this.f17324a = i10;
        this.f17325b = sendMessagesHelper;
        this.f17326c = message;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f17324a) {
            case 0:
                this.f17325b.lambda$putToSendingMessages$61(this.f17326c, this.d);
                return;
            case 1:
                this.f17325b.lambda$performSendMessageRequest$84(this.f17326c, this.d);
                return;
            default:
                this.f17325b.lambda$performSendMessageRequest$87(this.f17326c, this.d);
                return;
        }
    }
}
