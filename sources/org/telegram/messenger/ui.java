package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ui implements Runnable {
    public final int f19677a;
    public final SendMessagesHelper f19678b;
    public final TLRPC.Updates f19679c;

    public ui(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19677a = i10;
        this.f19678b = sendMessagesHelper;
        this.f19679c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19677a) {
            case 0:
                this.f19678b.lambda$performSendMessageRequest$97(this.f19679c);
                return;
            default:
                this.f19678b.lambda$performSendMessageRequestMulti$75(this.f19679c);
                return;
        }
    }
}
