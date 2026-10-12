package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f16800a;
    public final SendMessagesHelper f16801b;
    public final TLRPC.Updates f16802c;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f16800a = i10;
        this.f16801b = sendMessagesHelper;
        this.f16802c = updates;
    }

    @Override
    public final void run() {
        switch (this.f16800a) {
            case 0:
                this.f16801b.lambda$performSendMessageRequest$97(this.f16802c);
                return;
            default:
                this.f16801b.lambda$performSendMessageRequestMulti$75(this.f16802c);
                return;
        }
    }
}
