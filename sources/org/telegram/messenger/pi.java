package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pi implements Runnable {
    public final int f19290a;
    public final SendMessagesHelper f19291b;
    public final TLRPC.Message f19292c;
    public final int d;

    public pi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19290a = i11;
        this.f19291b = sendMessagesHelper;
        this.f19292c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19290a) {
            case 0:
                this.f19291b.lambda$performSendMessageRequest$105(this.f19292c, this.d);
                return;
            default:
                this.f19291b.lambda$sendMessage$18(this.f19292c, this.d);
                return;
        }
    }
}
