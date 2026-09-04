package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f18997a;
    public final SendMessagesHelper f18998b;
    public final TLRPC.Message f18999c;
    public final int d;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f18997a = i11;
        this.f18998b = sendMessagesHelper;
        this.f18999c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18997a) {
            case 0:
                this.f18998b.lambda$performSendMessageRequest$102(this.f18999c, this.d);
                return;
            default:
                this.f18998b.lambda$sendMessage$15(this.f18999c, this.d);
                return;
        }
    }
}
