package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bj implements Runnable {
    public final int f15780a;
    public final SendMessagesHelper f15781b;
    public final TLRPC.Updates f15782c;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f15780a = i10;
        this.f15781b = sendMessagesHelper;
        this.f15782c = updates;
    }

    @Override
    public final void run() {
        switch (this.f15780a) {
            case 0:
                this.f15781b.lambda$performSendMessageRequest$94(this.f15782c);
                return;
            default:
                this.f15781b.lambda$performSendMessageRequestMulti$72(this.f15782c);
                return;
        }
    }
}
