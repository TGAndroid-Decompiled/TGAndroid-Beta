package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gj implements Runnable {
    public final int f18785a;
    public final SendMessagesHelper f18786b;
    public final TLRPC.Message f18787c;
    public final boolean d;

    public gj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z4, int i10) {
        this.f18785a = i10;
        this.f18786b = sendMessagesHelper;
        this.f18787c = message;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f18785a) {
            case 0:
                this.f18786b.lambda$putToSendingMessages$61(this.f18787c, this.d);
                return;
            case 1:
                this.f18786b.lambda$performSendMessageRequest$84(this.f18787c, this.d);
                return;
            default:
                this.f18786b.lambda$performSendMessageRequest$87(this.f18787c, this.d);
                return;
        }
    }
}
