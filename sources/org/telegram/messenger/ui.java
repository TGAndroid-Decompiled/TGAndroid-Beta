package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ui implements Runnable {
    public final int f21448a;
    public final SendMessagesHelper f21449b;
    public final TLRPC.Message f21450c;
    public final int d;

    public ui(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f21448a = i11;
        this.f21449b = sendMessagesHelper;
        this.f21450c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f21448a) {
            case 0:
                this.f21449b.lambda$performSendMessageRequest$105(this.f21450c, this.d);
                return;
            default:
                this.f21449b.lambda$sendMessage$18(this.f21450c, this.d);
                return;
        }
    }
}
