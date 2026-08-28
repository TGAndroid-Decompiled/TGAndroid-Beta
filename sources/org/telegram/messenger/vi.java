package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vi implements Runnable {
    public final int f21778a;
    public final SendMessagesHelper f21779b;
    public final TLRPC.Message f21780c;
    public final boolean d;

    public vi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i9) {
        this.f21778a = i9;
        this.f21779b = sendMessagesHelper;
        this.f21780c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f21778a) {
            case 0:
                this.f21779b.lambda$putToSendingMessages$61(this.f21780c, this.d);
                return;
            case 1:
                this.f21779b.lambda$performSendMessageRequest$84(this.f21780c, this.d);
                return;
            default:
                this.f21779b.lambda$performSendMessageRequest$87(this.f21780c, this.d);
                return;
        }
    }
}
