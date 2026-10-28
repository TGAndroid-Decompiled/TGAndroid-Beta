package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dj implements Runnable {
    public final int f19927a;
    public final SendMessagesHelper f19928b;
    public final TLRPC.Message f19929c;
    public final boolean d;

    public dj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f19927a = i10;
        this.f19928b = sendMessagesHelper;
        this.f19929c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19927a) {
            case 0:
                this.f19928b.lambda$putToSendingMessages$64(this.f19929c, this.d);
                return;
            case 1:
                this.f19928b.lambda$performSendMessageRequest$90(this.f19929c, this.d);
                return;
            default:
                this.f19928b.lambda$performSendMessageRequest$87(this.f19929c, this.d);
                return;
        }
    }
}
