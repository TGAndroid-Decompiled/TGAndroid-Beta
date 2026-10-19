package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ti implements Runnable {
    public final int f19593a;
    public final SendMessagesHelper f19594b;
    public final TLRPC.Updates f19595c;

    public ti(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f19593a = i10;
        this.f19594b = sendMessagesHelper;
        this.f19595c = updates;
    }

    @Override
    public final void run() {
        switch (this.f19593a) {
            case 0:
                this.f19594b.lambda$performSendMessageRequest$97(this.f19595c);
                return;
            default:
                this.f19594b.lambda$performSendMessageRequestMulti$75(this.f19595c);
                return;
        }
    }
}
