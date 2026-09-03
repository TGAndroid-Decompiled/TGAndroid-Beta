package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vi implements Runnable {
    public final int f18663a;
    public final SendMessagesHelper f18664b;
    public final TLRPC.Message f18665c;
    public final int d;

    public vi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f18663a = i11;
        this.f18664b = sendMessagesHelper;
        this.f18665c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18663a) {
            case 0:
                this.f18664b.lambda$performSendMessageRequest$102(this.f18665c, this.d);
                return;
            default:
                this.f18664b.lambda$sendMessage$15(this.f18665c, this.d);
                return;
        }
    }
}
