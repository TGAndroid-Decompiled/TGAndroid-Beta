package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ui implements Runnable {
    public final int f19361a;
    public final SendMessagesHelper f19362b;
    public final TLRPC.Message f19363c;
    public final int d;

    public ui(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11) {
        this.f19361a = i11;
        this.f19362b = sendMessagesHelper;
        this.f19363c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19361a) {
            case 0:
                this.f19362b.lambda$performSendMessageRequest$105(this.f19363c, this.d);
                return;
            default:
                this.f19362b.lambda$sendMessage$18(this.f19363c, this.d);
                return;
        }
    }
}
