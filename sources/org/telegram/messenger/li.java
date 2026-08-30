package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class li implements Runnable {
    public final int f17774a;
    public final SendMessagesHelper f17775b;
    public final TLRPC.Updates f17776c;
    public final TLRPC.Message d;
    public final boolean e;

    public li(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z4, int i10) {
        this.f17774a = i10;
        this.f17775b = sendMessagesHelper;
        this.f17776c = updates;
        this.d = message;
        this.e = z4;
    }

    @Override
    public final void run() {
        switch (this.f17774a) {
            case 0:
                this.f17775b.lambda$performSendMessageRequest$88(this.f17776c, this.d, this.e);
                return;
            default:
                this.f17775b.lambda$performSendMessageRequest$85(this.f17776c, this.d, this.e);
                return;
        }
    }
}
