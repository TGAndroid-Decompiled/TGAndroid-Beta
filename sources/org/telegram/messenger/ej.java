package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ej implements Runnable {
    public final int f16241a;
    public final SendMessagesHelper f16242b;
    public final TLRPC.Message f16243c;
    public final boolean d;

    public ej(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f16241a = i10;
        this.f16242b = sendMessagesHelper;
        this.f16243c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16241a) {
            case 0:
                this.f16242b.lambda$putToSendingMessages$61(this.f16243c, this.d);
                return;
            case 1:
                this.f16242b.lambda$performSendMessageRequest$84(this.f16243c, this.d);
                return;
            default:
                this.f16242b.lambda$performSendMessageRequest$87(this.f16243c, this.d);
                return;
        }
    }
}
