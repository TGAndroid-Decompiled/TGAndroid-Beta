package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f19508a;
    public final SendMessagesHelper f19509b;
    public final TLRPC.Updates f19510c;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19508a = i10;
        this.f19509b = sendMessagesHelper;
        this.f19510c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19508a) {
            case 0:
                this.f19509b.lambda$performSendMessageRequest$97(this.f19510c);
                return;
            default:
                this.f19509b.lambda$performSendMessageRequestMulti$75(this.f19510c);
                return;
        }
    }
}
