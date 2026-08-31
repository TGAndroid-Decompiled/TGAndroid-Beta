package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ej implements Runnable {
    public final int f18600a;
    public final SendMessagesHelper f18601b;
    public final TLRPC.Updates f18602c;

    public ej(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f18600a = i10;
        this.f18601b = sendMessagesHelper;
        this.f18602c = updates;
    }

    @Override
    public final void run() {
        switch (this.f18600a) {
            case 0:
                this.f18601b.lambda$performSendMessageRequest$94(this.f18602c);
                return;
            default:
                this.f18601b.lambda$performSendMessageRequestMulti$72(this.f18602c);
                return;
        }
    }
}
