package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ti implements Runnable {
    public final int f19301a;
    public final SendMessagesHelper f19302b;
    public final TLRPC.Message f19303c;
    public final int d;

    public ti(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19301a = i11;
        this.f19302b = sendMessagesHelper;
        this.f19303c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19301a) {
            case 0:
                this.f19302b.lambda$performSendMessageRequest$105(this.f19303c, this.d);
                return;
            default:
                this.f19302b.lambda$sendMessage$18(this.f19303c, this.d);
                return;
        }
    }
}
