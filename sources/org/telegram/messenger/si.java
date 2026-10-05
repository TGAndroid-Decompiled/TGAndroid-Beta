package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f19178a;
    public final SendMessagesHelper f19179b;
    public final TLRPC.Message f19180c;
    public final int d;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19178a = i11;
        this.f19179b = sendMessagesHelper;
        this.f19180c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19178a) {
            case 0:
                this.f19179b.lambda$performSendMessageRequest$102(this.f19180c, this.d);
                return;
            default:
                this.f19179b.lambda$sendMessage$15(this.f19180c, this.d);
                return;
        }
    }
}
