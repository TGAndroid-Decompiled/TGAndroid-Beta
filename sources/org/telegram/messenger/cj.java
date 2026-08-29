package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f19966a;
    public final SendMessagesHelper f19967b;
    public final TLRPC.Message f19968c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f19966a = i10;
        this.f19967b = sendMessagesHelper;
        this.f19968c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19966a) {
            case 0:
                this.f19967b.lambda$putToSendingMessages$61(this.f19968c, this.d);
                return;
            case 1:
                this.f19967b.lambda$performSendMessageRequest$84(this.f19968c, this.d);
                return;
            default:
                this.f19967b.lambda$performSendMessageRequest$87(this.f19968c, this.d);
                return;
        }
    }
}
