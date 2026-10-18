package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class oi implements Runnable {
    public final int f19209a;
    public final SendMessagesHelper f19210b;
    public final TLRPC.Message f19211c;
    public final int d;

    public oi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19209a = i11;
        this.f19210b = sendMessagesHelper;
        this.f19211c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19209a) {
            case 0:
                this.f19210b.lambda$performSendMessageRequest$105(this.f19211c, this.d);
                return;
            default:
                this.f19210b.lambda$sendMessage$18(this.f19211c, this.d);
                return;
        }
    }
}
