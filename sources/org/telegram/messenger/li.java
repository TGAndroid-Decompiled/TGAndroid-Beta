package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class li implements Runnable {
    public final int f18972a;
    public final SendMessagesHelper f18973b;
    public final TLRPC.Updates f18974c;
    public final TLRPC.Message d;
    public final boolean e;

    public li(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18972a = i10;
        this.f18973b = sendMessagesHelper;
        this.f18974c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18972a) {
            case 0:
                this.f18973b.lambda$performSendMessageRequest$88(this.f18974c, this.d, this.e);
                return;
            default:
                this.f18973b.lambda$performSendMessageRequest$91(this.f18974c, this.d, this.e);
                return;
        }
    }
}
