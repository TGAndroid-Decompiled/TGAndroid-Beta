package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ti implements Runnable {
    public final int f19586a;
    public final SendMessagesHelper f19587b;
    public final TLRPC.Updates f19588c;

    public ti(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19586a = i10;
        this.f19587b = sendMessagesHelper;
        this.f19588c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19586a) {
            case 0:
                this.f19587b.lambda$performSendMessageRequest$97(this.f19588c);
                return;
            default:
                this.f19587b.lambda$performSendMessageRequestMulti$75(this.f19588c);
                return;
        }
    }
}
