package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f19378a;
    public final SendMessagesHelper f19379b;
    public final TLRPC.Message f19380c;
    public final int d;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19378a = i11;
        this.f19379b = sendMessagesHelper;
        this.f19380c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19378a) {
            case 0:
                this.f19379b.lambda$performSendMessageRequest$105(this.f19380c, this.d);
                return;
            default:
                this.f19379b.lambda$sendMessage$18(this.f19380c, this.d);
                return;
        }
    }
}
