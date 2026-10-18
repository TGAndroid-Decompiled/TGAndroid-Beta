package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ti implements Runnable {
    public final int f19590a;
    public final SendMessagesHelper f19591b;
    public final TLRPC.Updates f19592c;

    public ti(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19590a = i10;
        this.f19591b = sendMessagesHelper;
        this.f19592c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19590a) {
            case 0:
                this.f19591b.lambda$performSendMessageRequest$97(this.f19592c);
                return;
            default:
                this.f19591b.lambda$performSendMessageRequestMulti$75(this.f19592c);
                return;
        }
    }
}
