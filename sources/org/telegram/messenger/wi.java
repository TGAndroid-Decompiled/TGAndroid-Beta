package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wi implements Runnable {
    public final int f20069a;
    public final SendMessagesHelper f20070b;
    public final TLRPC.Updates f20071c;

    public wi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f20069a = i10;
        this.f20070b = sendMessagesHelper;
        this.f20071c = updates;
    }

    @Override
    public final void run() {
        switch (this.f20069a) {
            case 0:
                this.f20070b.lambda$performSendMessageRequest$97(this.f20071c);
                return;
            default:
                this.f20070b.lambda$performSendMessageRequestMulti$75(this.f20071c);
                return;
        }
    }
}
