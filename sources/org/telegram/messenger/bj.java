package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bj implements Runnable {
    public final int f15778a;
    public final SendMessagesHelper f15779b;
    public final TLRPC.Updates f15780c;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f15778a = i10;
        this.f15779b = sendMessagesHelper;
        this.f15780c = updates;
    }

    @Override
    public final void run() {
        switch (this.f15778a) {
            case 0:
                this.f15779b.lambda$performSendMessageRequest$94(this.f15780c);
                return;
            default:
                this.f15779b.lambda$performSendMessageRequestMulti$72(this.f15780c);
                return;
        }
    }
}
