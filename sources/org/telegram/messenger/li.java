package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class li implements Runnable {
    public final int f18904a;
    public final SendMessagesHelper f18905b;
    public final TLRPC.Updates f18906c;
    public final TLRPC.Message d;
    public final boolean e;

    public li(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18904a = i10;
        this.f18905b = sendMessagesHelper;
        this.f18906c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18904a) {
            case 0:
                this.f18905b.lambda$performSendMessageRequest$88(this.f18906c, this.d, this.e);
                return;
            default:
                this.f18905b.lambda$performSendMessageRequest$91(this.f18906c, this.d, this.e);
                return;
        }
    }
}
