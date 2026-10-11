package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ti implements Runnable {
    public final int f19265a;
    public final SendMessagesHelper f19266b;
    public final TLRPC.Message f19267c;
    public final int d;

    public ti(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19265a = i11;
        this.f19266b = sendMessagesHelper;
        this.f19267c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19265a) {
            case 0:
                this.f19266b.lambda$performSendMessageRequest$105(this.f19267c, this.d);
                return;
            default:
                this.f19266b.lambda$sendMessage$18(this.f19267c, this.d);
                return;
        }
    }
}
