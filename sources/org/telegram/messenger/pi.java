package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pi implements Runnable {
    public final int f19283a;
    public final SendMessagesHelper f19284b;
    public final TLRPC.Message f19285c;
    public final int d;

    public pi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19283a = i11;
        this.f19284b = sendMessagesHelper;
        this.f19285c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19283a) {
            case 0:
                this.f19284b.lambda$performSendMessageRequest$105(this.f19285c, this.d);
                return;
            default:
                this.f19284b.lambda$sendMessage$18(this.f19285c, this.d);
                return;
        }
    }
}
