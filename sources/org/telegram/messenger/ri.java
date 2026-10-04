package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f19092a;
    public final SendMessagesHelper f19093b;
    public final TLRPC.Message f19094c;
    public final int d;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19092a = i11;
        this.f19093b = sendMessagesHelper;
        this.f19094c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19092a) {
            case 0:
                this.f19093b.lambda$performSendMessageRequest$102(this.f19094c, this.d);
                return;
            default:
                this.f19093b.lambda$sendMessage$15(this.f19094c, this.d);
                return;
        }
    }
}
