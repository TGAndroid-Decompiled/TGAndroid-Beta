package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f17584a;
    public final SendMessagesHelper f17585b;
    public final TLRPC.Message f17586c;
    public final boolean d;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, boolean z10, int i10) {
        this.f17584a = i10;
        this.f17585b = sendMessagesHelper;
        this.f17586c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17584a) {
            case 0:
                this.f17585b.lambda$putToSendingMessages$64(this.f17586c, this.d);
                return;
            case 1:
                this.f17585b.lambda$performSendMessageRequest$90(this.f17586c, this.d);
                return;
            default:
                this.f17585b.lambda$performSendMessageRequest$87(this.f17586c, this.d);
                return;
        }
    }
}
