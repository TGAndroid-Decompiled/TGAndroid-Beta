package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f15915a;
    public final SendMessagesHelper f15916b;
    public final TLRPC.Updates f15917c;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, int i10) {
        this.f15915a = i10;
        this.f15916b = sendMessagesHelper;
        this.f15917c = updates;
    }

    @Override
    public final void run() {
        switch (this.f15915a) {
            case 0:
                this.f15916b.lambda$performSendMessageRequest$94(this.f15917c);
                return;
            default:
                this.f15916b.lambda$performSendMessageRequestMulti$72(this.f15917c);
                return;
        }
    }
}
