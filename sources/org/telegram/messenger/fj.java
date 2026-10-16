package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fj implements Runnable {
    public final int f16959a;
    public final SendMessagesHelper f16960b;
    public final TLRPC.Message f16961c;
    public final boolean d;

    public fj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f16959a = i10;
        this.f16960b = sendMessagesHelper;
        this.f16961c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16959a) {
            case 0:
                this.f16960b.lambda$putToSendingMessages$64(this.f16961c, this.d);
                return;
            case 1:
                this.f16960b.lambda$performSendMessageRequest$90(this.f16961c, this.d);
                return;
            default:
                this.f16960b.lambda$performSendMessageRequest$87(this.f16961c, this.d);
                return;
        }
    }
}
