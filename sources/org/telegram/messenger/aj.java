package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f17949a;
    public final SendMessagesHelper f17950b;
    public final TLRPC.Message f17951c;
    public final boolean d;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17949a = i10;
        this.f17950b = sendMessagesHelper;
        this.f17951c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17949a) {
            case 0:
                this.f17950b.lambda$putToSendingMessages$64(this.f17951c, this.d);
                return;
            case 1:
                this.f17950b.lambda$performSendMessageRequest$90(this.f17951c, this.d);
                return;
            default:
                this.f17950b.lambda$performSendMessageRequest$87(this.f17951c, this.d);
                return;
        }
    }
}
