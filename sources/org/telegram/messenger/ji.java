package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ji implements Runnable {
    public final int f18281a;
    public final SendMessagesHelper f18282b;
    public final TLRPC.Updates f18283c;
    public final TLRPC.Message d;
    public final boolean f18284e;

    public ji(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18281a = i10;
        this.f18282b = sendMessagesHelper;
        this.f18283c = updates;
        this.d = message;
        this.f18284e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18281a) {
            case 0:
                this.f18282b.lambda$performSendMessageRequest$88(this.f18283c, this.d, this.f18284e);
                return;
            default:
                this.f18282b.lambda$performSendMessageRequest$85(this.f18283c, this.d, this.f18284e);
                return;
        }
    }
}
