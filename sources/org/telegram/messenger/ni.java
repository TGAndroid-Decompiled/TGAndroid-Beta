package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class ni implements Runnable {

    public final int f21095a;

    public final SendMessagesHelper f21096b;

    public final TLRPC.Message f21097c;
    public final int d;

    public ni(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f21095a = i11;
        this.f21096b = sendMessagesHelper;
        this.f21097c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f21095a) {
            case 0:
                this.f21096b.lambda$performSendMessageRequest$102(this.f21097c, this.d);
                break;
            default:
                this.f21096b.lambda$sendMessage$15(this.f21097c, this.d);
                break;
        }
    }
}
