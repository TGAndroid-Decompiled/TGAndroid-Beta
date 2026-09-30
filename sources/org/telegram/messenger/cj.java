package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f16159a;
    public final SendMessagesHelper f16160b;
    public final TLRPC.Message f16161c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f16159a = i10;
        this.f16160b = sendMessagesHelper;
        this.f16161c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16159a) {
            case 0:
                this.f16160b.lambda$putToSendingMessages$61(this.f16161c, this.d);
                return;
            case 1:
                this.f16160b.lambda$performSendMessageRequest$84(this.f16161c, this.d);
                return;
            default:
                this.f16160b.lambda$performSendMessageRequest$87(this.f16161c, this.d);
                return;
        }
    }
}
