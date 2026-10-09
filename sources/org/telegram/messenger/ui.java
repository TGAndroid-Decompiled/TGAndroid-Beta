package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ui implements Runnable {
    public final int f19357a;
    public final SendMessagesHelper f19358b;
    public final TLRPC.Message f19359c;
    public final int d;

    public ui(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19357a = i11;
        this.f19358b = sendMessagesHelper;
        this.f19359c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19357a) {
            case 0:
                this.f19358b.lambda$performSendMessageRequest$105(this.f19359c, this.d);
                return;
            default:
                this.f19358b.lambda$sendMessage$18(this.f19359c, this.d);
                return;
        }
    }
}
