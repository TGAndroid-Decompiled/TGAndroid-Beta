package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class oi implements Runnable {
    public final int f19206a;
    public final SendMessagesHelper f19207b;
    public final TLRPC.Message f19208c;
    public final int d;

    public oi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19206a = i11;
        this.f19207b = sendMessagesHelper;
        this.f19208c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19206a) {
            case 0:
                this.f19207b.lambda$performSendMessageRequest$105(this.f19208c, this.d);
                return;
            default:
                this.f19207b.lambda$sendMessage$18(this.f19208c, this.d);
                return;
        }
    }
}
