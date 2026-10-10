package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f17589a;
    public final SendMessagesHelper f17590b;
    public final TLRPC.Message f17591c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17589a = i10;
        this.f17590b = sendMessagesHelper;
        this.f17591c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17589a) {
            case 0:
                this.f17590b.lambda$putToSendingMessages$64(this.f17591c, this.d);
                return;
            case 1:
                this.f17590b.lambda$performSendMessageRequest$90(this.f17591c, this.d);
                return;
            default:
                this.f17590b.lambda$performSendMessageRequest$87(this.f17591c, this.d);
                return;
        }
    }
}
