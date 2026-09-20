package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bj implements Runnable {
    public final int f16003a;
    public final SendMessagesHelper f16004b;
    public final TLRPC.Updates f16005c;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f16003a = i10;
        this.f16004b = sendMessagesHelper;
        this.f16005c = updates;
    }

    @Override
    public final void run() {
        switch (this.f16003a) {
            case 0:
                this.f16004b.lambda$performSendMessageRequest$94(this.f16005c);
                return;
            default:
                this.f16004b.lambda$performSendMessageRequestMulti$72(this.f16005c);
                return;
        }
    }
}
