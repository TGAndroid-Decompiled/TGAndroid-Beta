package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fj implements Runnable {
    public final int f17260a;
    public final SendMessagesHelper f17261b;
    public final TLRPC.Message f17262c;
    public final boolean d;

    public fj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17260a = i10;
        this.f17261b = sendMessagesHelper;
        this.f17262c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17260a) {
            case 0:
                this.f17261b.lambda$putToSendingMessages$64(this.f17262c, this.d);
                return;
            case 1:
                this.f17261b.lambda$performSendMessageRequest$90(this.f17262c, this.d);
                return;
            default:
                this.f17261b.lambda$performSendMessageRequest$87(this.f17262c, this.d);
                return;
        }
    }
}
