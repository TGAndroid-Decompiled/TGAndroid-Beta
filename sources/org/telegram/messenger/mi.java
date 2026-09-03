package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mi implements Runnable {
    public final int f17836a;
    public final SendMessagesHelper f17837b;
    public final TLRPC.Updates f17838c;
    public final TLRPC.Message d;
    public final boolean e;

    public mi(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z4, int i10) {
        this.f17836a = i10;
        this.f17837b = sendMessagesHelper;
        this.f17838c = updates;
        this.d = message;
        this.e = z4;
    }

    @Override
    public final void run() {
        switch (this.f17836a) {
            case 0:
                this.f17837b.lambda$performSendMessageRequest$88(this.f17838c, this.d, this.e);
                return;
            default:
                this.f17837b.lambda$performSendMessageRequest$85(this.f17838c, this.d, this.e);
                return;
        }
    }
}
