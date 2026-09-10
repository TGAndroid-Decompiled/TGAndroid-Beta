package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jj implements Runnable {
    public final int f15556a;
    public final SendMessagesHelper f15557b;
    public final TLRPC.Updates f15558c;

    public jj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f15556a = i10;
        this.f15557b = sendMessagesHelper;
        this.f15558c = updates;
    }

    @Override
    public final void run() {
        switch (this.f15556a) {
            case 0:
                this.f15557b.lambda$performSendMessageRequest$94(this.f15558c);
                return;
            default:
                this.f15557b.lambda$performSendMessageRequestMulti$72(this.f15558c);
                return;
        }
    }
}
